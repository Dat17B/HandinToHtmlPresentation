import Helper.Display;
import Models.Exercise;
import Models.Student;

import java.util.ArrayList;
import java.util.List;

public class StringHandler
{
    /* DATA
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_2	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_3	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_4	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_5	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_6	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_7	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_8	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_9	2018-02-02
                ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_19	2018-02-05
                Mohammad Sabah Ahmad	 	Ikke afleveret
                Jakob Aygin Wulff Andersen	 	Ikke afleveret
                Tino Andreasen	 	Ikke afleveret
     */

    /**
     * Get list of Strings and produce a list of students
     * @param strList
     * @return A list of Students
     */
    public List<Student> generateStringtoStudent(List<String> strList) {
        List<Student> students = new ArrayList<>();

        for (String student: strList) {
            // regex split found on this link
            // https://stackoverflow.com/questions/13081527/splitting-string-on-multiple-spaces-in-java
            // Short: Try and see str.split("\\s+"). It returns an array of strings (String[])
            String[] strArray = student.split("\\s+");

            students.add(createStudent(strArray));
        }

        return students;
    }

    /**
     * Creates a Models.Student object from a string line
     * @param studArr
     * @return A new student
     */
    private Student createStudent(String[] studArr) {
        /*for (String str: studArr) {
            System.out.println(str);
        }*/
        /*
            ikke læst	Christian Grye Skydt	Aktiv menu  chri8a00_a_11_19	2018-02-05
            Mohammad Sabah Ahmad	 	Ikke afleveret
         */
        String name = "", mail = "";
        Student student = new Student("");

        if (studArr[0].equalsIgnoreCase("ikke")) {
            // Gets the name
            int nameCount = 0;
            for (int i = 2; i < studArr.length; i++) {
                if (studArr[i].equalsIgnoreCase("aktiv")) {
                    nameCount = i;
                    break;
                } else {
                    name += studArr[i] + " ";
                }
            }
            String[] infoSplit = studArr[nameCount+2].split("_");
            mail = infoSplit[0];
            student = new Student(name, mail);
            Exercise exercise;
            // Exercise(String chapter, String bookLetter, String exerciseNo, String handinDate)
            if (infoSplit[1].equalsIgnoreCase("Exercise")) {
                exercise = new Exercise(infoSplit[3], infoSplit[2], infoSplit[4], studArr[studArr.length-1]);
            } else
            {
                exercise = new Exercise(infoSplit[2], infoSplit[1], infoSplit[3], studArr[studArr.length - 1]);
            }
            student.addExercise(exercise);
        } else {
            for (int i = 0; i < studArr.length; i++) {
                if (studArr[i].equalsIgnoreCase("ikke")) {
                    break;
                }
                name += studArr[i] + " ";
            }
            student = new Student(name);
        }

        // Create student either by name or name/mail
        return student;
    }

    private void printArray(String[] str) {
        for (String st: str) {
            System.out.print(st + ";");
        }
        System.out.println();
    }
}
