package AdapterDesignPattern;

public class Main {

    public static void main(String[] args){
        Bird sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makeSound();

        Duck duck = new Duck();
        Bird duckAdapter = new DuckAdapter(duck);
        duckAdapter.fly();
        duckAdapter.makeSound();
    }
}
