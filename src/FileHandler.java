import Models.PageCreationModel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler
{
    private File file;

    public List<String> scanFileToList() {
        List<String> list = new ArrayList<>();;
        try
        {
            this.file = new File("./ExercisesHandin.txt");
            // Char set is encoded with ISO-8859-1 to handle æøå
            Scanner scanner = new Scanner(this.file, "ISO-8859-1");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }
}
