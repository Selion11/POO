package Segundo_Parcial;

public enum TimesForLend {
    STUDENT(2),
    RESPONSABLE(12),
    JEFETP(11),
    AYUDANTE(10);

    private final int time;

    TimesForLend(int time){
        this.time = time;
    }

    public int getTime(){
        return time;
    }
}
