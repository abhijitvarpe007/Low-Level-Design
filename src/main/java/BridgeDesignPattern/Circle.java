package BridgeDesignPattern;

public class Circle extends Shape{

    public Circle(Color color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle filled with ");
        color.applyColor();
    }
}
