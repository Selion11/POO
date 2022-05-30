package Segundo_Parcial;

import java.util.HashMap;
import java.util.Map;

public class RateLimitedCache<K,V> extends BaseCache<K,V> {
    private Map<String,QuotaType> quotaMap = new HashMap<>();
    private Map<String,Map<String,UserData>> dataMap = new HashMap<>();

    public void register(String user, QuotaType type){
        quotaMap.put(user,type);
        dataMap.put(user,new HashMap<>());
    }

    private QuotaType validationQuota(String user){
        QuotaType type = quotaMap.get(user);
        if(type == null){
            throw new IllegalArgumentException();
        }
        return type;
    }

    private UserData validationUser(String user,String date){
        dataMap.get(user).putIfAbsent(user,new UserData());
        return dataMap.get(user).get(date);
    }

    @Override
    public void put(String user,String date,K key, V value){
        QuotaType quota = validationQuota(user);
        UserData data = validationUser(user,date);
        if(! quota.canWrite(data.getWrites())){
            throw new RateLimitedException();
        }
        data.write();
        super.put(user, date, key, value);
    }

    @Override
    public V get(String user, String date, K key){
        QuotaType quota = validationQuota(user);
        UserData data = validationUser(user,date);
        if(! quota.canRead(data.getReads())){
            throw new RateLimitedException();
        }
        data.read();
        return super.get(user, date, key);
    }

    private static class UserData{
        private int writes;
        private int reads;

        public void read(){
            reads++;
        }

        public void write(){
            writes++;
        }

        public int getWrites(){
            return writes;
        }

        public int getReads(){
            return reads;
        }
    }
}
