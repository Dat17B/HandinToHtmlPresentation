package Models;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    // Variables
    private String name; // name of student
    private String mail; // mail of student
    private int points; // how many points = exercises have the student done

    private List<Exercise> exercises;

    public Student(String name) {
        this.name = name;
        this.mail = "";
        this.exercises = new ArrayList<>();
    }
    public Student(String name, String mail)
    {
        this.name = name;
        this.mail = mail;
        this.exercises = new ArrayList<>();
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public void addExercise(Exercise exercise) {
        points++;
        this.exercises.add(exercise);
    }
    public Exercise getFirstExercise() {
        try {
            return this.exercises.get(0);
        } catch (IndexOutOfBoundsException eIOOB) {
            return null;
        }
    }

    public List<Exercise> getExercises() { return this.exercises; }
    public int getPoints()
    {
        return mail != "" ? this.exercises.size() : 0;
    }

    public String getMail()
    {
        return mail + "@stud.kea.dk";
    }
    public String getMailName()
    {
        return mail != "" ? this.mail : this.name.split(" ")[1].toString();
    }
}
