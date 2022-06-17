package Segundo_Parcial;

import java.util.HashMap;
import java.util.Map;

public class GymRegistry {
    private Map<String,Client> members = new HashMap<>();

    public void registerClient(String name,Membership membership){
        if(members.containsKey(name)){
            throw new GymRegistryException(name + " already exists");
        }
        members.put(name,new Client(membership));
    }

    private void monthCheck(int m){
        if(m < 0 || m > 13){
            throw new IllegalArgumentException();
        }
    }
    private void memberCheck(String name){
        if(!members.containsKey(name)){
            throw new GymRegistryException(name + " is not registered");
        }
    }
    public int visitsCount(String name,int month){
        monthCheck(month);
        return members.get(name).vis(month);
    }

    public int visitsCount(String name){
        memberCheck(name);
        return members.get(name).vis();
    }

    public GymRegistry visit(String name,int month){
        memberCheck(name);
        members.get(name).visit(month,name);
        return this;
    }

    public boolean canVisit(String name,int month){
        memberCheck(name);
        return members.get(name).canVisit(month);
    }
}
