import java.io.FileInputStream;
import java.io.IOException;

public class SoughtChar {
    private char soughtChar;
    private String source;
    private int number = 0;

    public SoughtChar(String source, char soughtChar) {
        this.source = source;
        this.soughtChar = soughtChar;
    }
    public void counter() throws IOException {
        FileInputStream fis = new FileInputStream(source);
        int i;
        while ((i = fis.read()) != -1) {
            if((char) i == soughtChar) number++;
        }
        fis.close();
        System.out.println("Символ " + "'" + soughtChar + "'" + " - " + number);
    }

}
