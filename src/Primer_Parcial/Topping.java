package Primer_Parcial;

public enum Topping {
    EXTRA_CHEESE("extra queso",20),
    TOMATO("tomates",30),
    ONIONS("cebolla",10);

    private final String tipo;
    private final double precio;

    Topping(String tipo, int precio){
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
}
