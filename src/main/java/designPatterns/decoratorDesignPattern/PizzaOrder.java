package designPatterns.decoratorDesignPattern;

public class PizzaOrder {
    public static void main(String[] args) {
        BasePizza pizza = new PaneerTopping(new ExtraCheese(new FarmHouse()));
        System.out.println(pizza.cost());
    }
}
