import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char[] symbols;
        symbols = new char[]{'a', 'b', 'c', 'd'};
        for (char symbol : symbols) {
            SoughtChar soughtChar = new SoughtChar("OriginalText.txt", symbol);
            soughtChar.counter();
        }
    }
}
