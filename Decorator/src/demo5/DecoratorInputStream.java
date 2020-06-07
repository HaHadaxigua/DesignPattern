package demo5;

public abstract class DecoratorInputStream implements MyInputStream {
    MyInputStream inputStream;

    public DecoratorInputStream(MyInputStream inputStream) {
        this.inputStream = inputStream;
    }
}
