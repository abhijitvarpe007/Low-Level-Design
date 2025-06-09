package NullObjectPattern;

public class NullVechicle implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeattingCapacity() {
        return 0;
    }
}
