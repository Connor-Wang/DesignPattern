package creational.builder;

public class MyStringBuilder extends MyAbstractStringBuilder {
    public MyStringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
