package FactoryDesignPattern;

public class ShapeFactory {

    public Shape getShape(String shape){
        switch (shape){
            case "SQUARE" :
                return new Square();
            case "REACTANGLE" :
                return new Reactangle();
            case "CIRCLE" :
                return new Circle();
            default:
                return null;
        }
    }
}
