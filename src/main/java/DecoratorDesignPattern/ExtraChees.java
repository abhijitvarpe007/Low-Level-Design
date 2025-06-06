package DecoratorDesignPattern;

public class ExtraChees extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraChees(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
       return this.basePizza.cost() + 10;
    }
}
