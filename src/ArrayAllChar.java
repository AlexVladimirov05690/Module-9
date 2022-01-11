import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayAllChar {
    String source;
    protected ArrayList<Character> allChar = new ArrayList<>();

    public ArrayAllChar(String source) {
        this.source = source;
    }

    public void finder() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(source);
        } catch (FileNotFoundException e) {
            System.out.println("Не найден исходный текст");
        }
        int i = 0;
        char sym;
        while (true) {
            try {
                if (fis != null && (i = fis.read()) == -1) break;
            } catch (IOException e) {
                System.out.println("Не читается исходный текст");
            }
            sym = (char) i;
            compare(sym);
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
