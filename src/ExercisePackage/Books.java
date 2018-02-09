package ExercisePackage;

import java.util.HashMap;
import java.util.Map;

public class Books
{
    private static final Map<String, String> bookNames = new HashMap<String, String>() {
        {
            put("a", "Building java programs");
            put("b", "Murach’s MySQL");
            put("c", "Spring in action");
            put("d", "Network programming");
        }
    };

    public static String getBookNameByLetter(String letter) {
        String name = "No Book Name!!";
        for (Map.Entry<String, String> book: bookNames.entrySet()) {
            if (book.getKey().equalsIgnoreCase(letter)) {
                name = book.getValue();
            }
        }
        return name;
    }
}
