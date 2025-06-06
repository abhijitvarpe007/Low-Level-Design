package DecoratorDesignPattern;

public class Main {

    public static void main(String[] args){
        BasePizza basePizza = new Mushroom(new ExtraChees(new VegDelight()));
        System.out.println("Total price of pizza : "+basePizza.cost());
    }
}
