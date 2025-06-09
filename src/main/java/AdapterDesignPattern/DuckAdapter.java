package AdapterDesignPattern;

public class DuckAdapter implements Bird{

    private Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void fly() {
        System.out.println("Duck can't fly, but it can swim");
    }

    @Override
    public void makeSound() {
        duck.quack();
    }
}
