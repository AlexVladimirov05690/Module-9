import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayAllChar {
    String source;
    protected ArrayList<Character> allChar = new ArrayList<>();

    public ArrayAllChar(String source) {
        this.source = source;
    }

    public void finder() throws IOException {
        FileInputStream fis = new FileInputStream(source);
        int i;
        char sym;
        while ((i = fis.read()) != -1) {
            sym = (char) i;
            compare(sym);
        }
        fis.close();
    }

    private void compare(char symbol) {
        boolean chek = true;
        if (allChar.size() == 0) {
            allChar.add(symbol);
        }
        for (Character character : allChar) {
            if (symbol == character) {
                chek = false;
                break;
            }
        }
        if(chek) allChar.add(symbol);
    }
}
