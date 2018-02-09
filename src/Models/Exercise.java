package Models;

import ExercisePackage.Books;

public class Exercise
{
    private String chapter;
    private String book;
    private String bookLetter;
    private boolean isDone;
    private int exerciseNo;
    private String handinDate;

    public Exercise(String chapter, String bookLetter, String exerciseNo, String handinDate)
    {
        this.chapter = chapter;
        this.bookLetter = bookLetter;
        this.book = Books.getBookNameByLetter(bookLetter);
        this.isDone = true;
        this.exerciseNo = Integer.parseInt(exerciseNo);
        this.handinDate = handinDate;
    }

    public String getChapter()
    {
        return chapter;
    }
    public String getBook()
    {
        return book;
    }
    public String getBookLetter()
    {
        return bookLetter;
    }
    public boolean isDone()
    {
        return isDone;
    }
    public int getExerciseNo()
    {
        return exerciseNo;
    }
    public String getHandinDate()
    {
        return handinDate;
    }
}
