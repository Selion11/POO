package Recu_Primer_Parcial;

public enum Club {
    MIL(1000,950,0,0),
    DOSMIL(2000,1750,1000,2),
    CINCOMIL(5000,4400,2500,5),
    DIEZMIL(10000,14400,10000,6);


    private int millas,extras,promo;
    private double price;

   Club(int millas,double price,int extras,int promo){
        this.millas = millas;
        this.price = price;
        this.extras = extras;
        this.promo = promo;
    }

    public int getTotal(int mes){
      if(mes < promo){
          return extras + millas;
      }
      return millas;
    }

    public String  getPrice(){
       return String.format("$%.2f",price);
    }
}
