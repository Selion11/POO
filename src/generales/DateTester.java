package generales;

public class DateTester {
    public static void main(String[] args){
        Date d1 = new Date(1,2,2020);
        Date d2 = new Date(1,2,2021);
        System.out.println(d1.getDay());
        System.out.println(d2.getDay());
        System.out.println("La fecha es " + d1);
        Date[] d = new Date[10];
        d[0] = d1;
        d[1] = d2;
        if(d1 == d2){
            System.out.println("Son iguales");
        }

        if(d1.equals(d2)){
            System.out.println("Son equivalntes");

        }

    }
}
