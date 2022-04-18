package Primer_Parcial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LimitedExam extends UniqueExam{
    private int vacantes;
    private String[] listaDeEspera;
    private static final int DIM_ESPERA = 5;
    private int EN_ESPERA = 0;

    public LimitedExam(String name,int vacantes) {
        super(name);
        this.vacantes = vacantes;
        this.listaDeEspera = new String[DIM_ESPERA];
    }

    @Override
    public void enroll(String student){
        if(!hasSpace()){
            WaitingList(student);
            return;
        }
        super.enroll(student);
    }

    @Override
    public void unenroll(String student){
        if(!isEnrolled(student)){
            return;
        }
        super.unenroll(student);
        if(howManyPending() > 0) {
            super.enroll(listaDeEspera[0]);
            for(int i = 0;i < EN_ESPERA;i++) {
                System.arraycopy(listaDeEspera, i+1, listaDeEspera, i, EN_ESPERA - 1);
            }
            EN_ESPERA -= 1;
        }
    }

    private boolean hasSpace(){
        return getEnrolledCount() < vacantes;
    }

    private void WaitingList(String student){
        if(EN_ESPERA == listaDeEspera.length){
            resizeWaiting();
        }
        listaDeEspera[EN_ESPERA++] = student;
    }

    private int howManyPending(){
        return EN_ESPERA;
    }

    public String[] getPendingStudents(){
        return Arrays.copyOf(listaDeEspera,EN_ESPERA);
    }

    private void resizeWaiting() {
        listaDeEspera = Arrays.copyOf(listaDeEspera, listaDeEspera.length + DIM_ESPERA);
    }
}
