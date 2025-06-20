package BridgeDesignPattern;

public class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Square filled with ");
        color.applyColor();
    }
}
