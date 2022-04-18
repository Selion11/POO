package Primer_Parcial;

public class Pizza {
    private PizzaType type;
    private Topping[] toppings;

    Pizza(PizzaType type,Topping[] toppings){
        this.type = type;
        this.toppings = toppings;
    }

  @Override
  public String toString() {
      StringBuilder stringBuilder = new StringBuilder("Pizza ").append(type.getTipo());
      double totalPrice = type.getPrecio();
      for(Topping topping : toppings) {
          stringBuilder.append(String.format(" con %s", topping.getTipo()));
          totalPrice += topping.getPrecio();
      }
      stringBuilder.append(": ").append("$").append(String.format("%.2f", totalPrice));
      return stringBuilder.toString();
  }

}
