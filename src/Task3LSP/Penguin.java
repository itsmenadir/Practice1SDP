package Task3LSP;

public class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly.");
    }
    // Penguins don't implement Flyable, so no fly method.

}
