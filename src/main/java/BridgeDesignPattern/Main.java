package BridgeDesignPattern;

public class Main {

    public static void main(String[] args){
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();
        blueSquare.draw();
    }
}
