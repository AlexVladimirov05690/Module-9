import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        ArrayAllChar arrayAllChar = new ArrayAllChar("OrginalText.txt");
        arrayAllChar.finder();
        for (int i = 0; i < arrayAllChar.allChar.size(); i++) {
            SoughtChar soughtChar = new SoughtChar("OriginalText.txt", arrayAllChar.allChar.get(i));
            try {
                soughtChar.counter();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
