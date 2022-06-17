package Segundo_Parcial;

import java.util.*;

public class Reminders {
    private Map<String,Set<Task>> tasks = new TreeMap<>();

    public Collection<String> tasks(String key){
        check(key);
        List<String> ans = new ArrayList<>();
        for(Task t: tasks.get(key)){
            ans.add(t.getName());
        }
        return ans;
    }

    public void addTask(String zone,String name){
        tasks.putIfAbsent(zone,new TreeSet<>());
        tasks.get(zone).add(new Task(name));
    }

    public Collection<String> tasks(){
        List<String> ans = new ArrayList<>();
        for(String key: tasks.keySet()){
            ans.addAll(tasks(key));
        }
        return ans;
    }

    private void check(String categoryName) {
        if(!tasks.containsKey(categoryName)) {
            throw new CategoryNotFoundException();
        }
    }

    public void done(String zone,String name){
        check(zone);
        for(Task t:tasks.get(zone)){
            if(t.getName().equals(name)){
                t.done();
                return;
            }
        }
    }
     public void done(String zone){
        check(zone);
        for(Task t:tasks.get(zone)){
            t.done();
        }
     }

     public Collection<String> pendingTasks(String zone){
        check(zone);
        Collection<String> ans = new TreeSet<>();
        for(Task t:tasks.get(zone)){
            if(!t.isCompleted()){
                ans.add(t.getName());
            }
        }
        return ans;
     }
}
