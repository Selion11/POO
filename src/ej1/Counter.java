package ej1;

public class Counter {
    private int counter;
    public Counter(){
        this.counter = 0;
    }
    public void increment(){
        this.counter += 1;
    }
    public void decrement(){
        this.counter -= 1;
    }
    public int getCount(){
        return this.counter;
    }
}
