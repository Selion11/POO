package Primer_Parcial;

public enum PizzaType {
    OVEN("Al horno",100),
    GRILL("A la Parilla",150);

    private final String tipo;
    private final int precio;

    PizzaType(String tipo, int precio){
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo(){
        return tipo;
    }
}
