import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayAllChar arrayAllChar = new ArrayAllChar("OriginalText.txt");
        arrayAllChar.finder();
        for (int i = 0; i < arrayAllChar.allChar.size(); i++) {
            SoughtChar soughtChar = new SoughtChar("OriginalText.txt", arrayAllChar.allChar.get(i));
            soughtChar.counter();
        }
    }
}
