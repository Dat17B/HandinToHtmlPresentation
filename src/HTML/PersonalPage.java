package HTML;

import Models.Exercise;
import Models.Student;

public class PersonalPage
{
    private String htmlContent;
    private BlackList blackList;

    public PersonalPage()
    {
        this.htmlContent = "";
        this.blackList = new BlackList();
    }

    public void createPersonalPage(Student student) {
        this.htmlContent = "";
        if (student.getPoints() != 0)
        {
            this.htmlContent += blackList.addHeader();
            this.htmlContent += "<body>";
            addBody(student);
            this.htmlContent += "</body>\n</html>";
        } else {
            htmlContent += "<html><body> NO HAND IN </body><html>";
        }
    }

    private void addBody(Student student) {
        addbodyHeader(student);
        htmlContent +=  "<table>" +
                        "<tr>" +
                        "<th colspan=3>Hand in information</th>" +
                        "</tr>" +
                        "<tr>" +
                        "<th>Book</th>" +
                        "<th>Chapter</th>" +
                        "<th>Number</th>" +
                        "<th>Delivery Date</th>" +
                        "</tr>";

        for (Exercise exercise: student.getExercises()) {
            htmlContent += "<tr>" +
                    "<td>" + exercise.getBook() + "</td>" +
                    "<td>" + exercise.getChapter() + "</td>" +
                    "<td>" + exercise.getExerciseNo() + "</td>" +
                    "<td>" + exercise.getHandinDate() + "</td>" +
                    "</tr>";
        }
        // name på bog, chapter, exercise number, handinDate,  isDone(?)
    }

    private void addbodyHeader(Student student) {
        htmlContent += "<h2>" + student.getName() + "</h2>" +
                       "<h4>" + student.getMail() + "</h4>" +
                       "<p>Points = " + student.getPoints() + "</p>";
    }

    public String getHtmlContent() { return this.htmlContent; }
}
