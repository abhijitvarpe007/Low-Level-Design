package NullObjectPattern;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 30;
    }

    @Override
    public int getSeattingCapacity() {
        return 5;
    }
}
