package ExercisePackage;

public class Assignment
{
    private String chapter, assignmentNo, handinDate;
    private boolean isDone;

    public Assignment(String chapter, String assignmentNo, String handinDate)
    {
        this.chapter = chapter;
        this.assignmentNo = assignmentNo;
        this.handinDate = handinDate;
        this.isDone = false;
    }
}
