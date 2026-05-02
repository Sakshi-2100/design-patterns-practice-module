package designPatterns.decoratorDesignPattern;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    int cost() {
        return basePizza.cost()+50;
    }
}
