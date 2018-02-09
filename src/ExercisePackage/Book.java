package ExercisePackage;

import java.util.ArrayList;
import java.util.List;

public class Book
{
    private List<Assignment> assignments;
    private String book;
    private String bookLetter;

    public Book(String bookLetter)
    {
        this.bookLetter = bookLetter;
        this.book = Books.getBookNameByLetter(bookLetter);
        this.assignments = new ArrayList<>();
    }

    public boolean addAssignment(String chapter, String exerciseNo, String handinDate) {
        return addAssignment(new Assignment(chapter, exerciseNo, handinDate));
    }

    public boolean addAssignment(Assignment assignment) {
        this.assignments.add(assignment);
        return true;
    }
}
