package Segundo_Parcial;

public class Task implements Comparable<Task>{
    private String name;
    private boolean completed;


    public Task(String name){
        this.name = name;
        completed = false;
    }

    @Override
    public int compareTo(Task o) {
        return name.compareTo(o.name);
    }

    public String getName(){return name;}

    public void done(){completed = true;}

    public boolean isCompleted(){return completed;}

}
