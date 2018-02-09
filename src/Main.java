import HTML.HTMLHandler;
import Models.PageCreationModel;
import Models.Student;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Read file into String array.
        // Trim String to count Exercises
        // Create Html Table in file and show the table

        /*
        * CLasses
        * - FileHandler
        * - Models.Student, collection class
        * - HTML.HTMLHandler, Write HTML table to file
        */

        // Variables
        List<Student> students = new ArrayList<>();
        List<PageCreationModel> pages = new ArrayList<>();

        // Handlers
        StringHandler stringHandler = new StringHandler();
        StudentHandler studentHandler = new StudentHandler();
        FileHandler fileHandler = new FileHandler();
        HTMLHandler htmlHandler = new HTMLHandler();
        StreamHandler streamHandler = new StreamHandler();

        //System.out.println(fileHandler.scanFileToList());

        // Change scanned file to list of students
        students = stringHandler.generateStringtoStudent(fileHandler.scanFileToList());
        //System.out.println(students);
        //System.out.println("Generate unique list of student names");
        students = studentHandler.generateUniqueList(students);
        //System.out.println(students);
        // Generate html code
        htmlHandler.getBlackList().htmlGenerator(students);

        System.out.println("---- Returning BlackList.html code ----");
        System.out.println(htmlHandler.getBlackList().getHtmlContent());
        pages.add(new PageCreationModel(htmlHandler.getBlackList().getHtmlContent(), "blacklist.html", false));

        System.out.println("---- Generate Personal Page ----");
        for (Student student: students)
        {
            htmlHandler.getPersonalPage().createPersonalPage(student);
            System.out.println("----- " + student.getName() + " -----");
            System.out.println(htmlHandler.getPersonalPage().getHtmlContent());
            pages.add(new PageCreationModel(htmlHandler.getPersonalPage().getHtmlContent(), "StudentPages/" + student.getMailName() + ".html", true));
        }

        System.out.println("*** Test of pages ***");
        for (PageCreationModel page: pages) {
            System.out.println(page);
        }

        streamHandler.createPages(pages);
    }
}
