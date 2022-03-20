package ej1;

public class MultipleCounter extends Counter {

    private int times;
    public MultipleCounter(int times){
        this.times = times;
    }

    @Override
    public void increment(){
        int i = this.times;
        while(i > 0){
            super.increment();
            i--;
        }
    }

    @Override
    public void decrement(){
        int i = this.times;
        while(i > 0){
            super.decrement();
            i--;
        }
    }
}
