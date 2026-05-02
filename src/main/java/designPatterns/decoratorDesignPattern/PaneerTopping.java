package designPatterns.decoratorDesignPattern;

public class PaneerTopping extends Toppings{
    BasePizza basePizza;
    public PaneerTopping(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+60;
    }
}
