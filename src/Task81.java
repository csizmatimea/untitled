import java.util.Arrays;
import java.util.List;

public class Task81 {
    /**
     * Írjatok családbarát metódust, amely egy, a metódusban előre létrehozott listában tárolt szavazat
     * megkeres egyesével a paraméterként kapott szövegben.
     * Amennyiben megtalálja, cserélje ezeket “*” karakterekre.
     * A csillagozott rész legyen pont annyi karakter, amennyi az eredeti szó volt
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("nem", "olyan");
        String text = "Keresek egy olyan szót, ami nem lehet a szövegben.";


        String resultText = "";

        for (String newtext : names) {
            text = text.replaceAll(newtext, "*");
        }
        System.out.println(text);
    }
}