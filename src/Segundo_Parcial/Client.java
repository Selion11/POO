package Segundo_Parcial;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private Membership membership;
    private Map<Integer,Integer> visits = new HashMap<>();

    public Client(Membership membership){
        this.membership = membership;
    }

    public int vis(int m){
        visits.putIfAbsent(m,0);
        return visits.get(m);
    }

    public int vis(){
        int ans = 0;
        for(Integer m: visits.keySet()) {
            ans += vis(m);
        }
        return ans;
    }

    public void visit(int month,String name){
        visits.putIfAbsent(month,0);
        if(!membership.canVisit(visits.get(month))){
            throw new GymRegistryException("Max visits per month already reached for " + name);
        }
        int visit = visits.remove(month) + 1;
        visits.put(month,visit);
    }

    public boolean canVisit(int month){
        if(!visits.containsKey(month)){
            throw new IllegalArgumentException();
        }
        return membership.canVisit(month);
    }
}
