import Models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentHandler
{
    public List<Student> generateUniqueList(List<Student> students) {
        List<Student> studentsReturn = new ArrayList<>();

        for (Student student: students) {
            //System.out.println("O(N)");
            for (int i = 0; i < studentsReturn.size(); i++)
            {
                //System.out.println("O(N2)");
                if (student.getName().equalsIgnoreCase(studentsReturn.get(i).getName()))
                {
                    //System.out.println("IF");
                    studentsReturn.get(i).addExercise(student.getFirstExercise());
                    break;
                }
                if (i == studentsReturn.size() - 1) {
                    studentsReturn.add(student);
                }
            }

            if (studentsReturn.size() == 0)
                studentsReturn.add(student);
        }

        return studentsReturn;
    }
}
