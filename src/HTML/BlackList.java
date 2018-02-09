package HTML;

import Models.Student;

import java.util.List;

public class BlackList
{
    private String htmlContent = "";

    String addHeader() {
        return "<!doctype html>\n" +
                "<html><head>" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\" />" +
                "</head>";
    }

    public void htmlGenerator(List<Student> students) {
        htmlContent += addHeader();
        htmlContent += "<body>";

        htmlContent += addTable(students);

        htmlContent += "</body>\n</html>";
    }

    public String getHtmlContent() { return this.htmlContent; }

    private String addTable(List<Student> students) {
        String value =  "<table class='full-width border-bottom'>" +
                "<tr>" +
                "<th colspan=3 class='border-all'>" +
                "<h1>Black List</h1>" +
                "</th>" +
                "</tr>" +
                "<tr>" +
                "<th class='border-left border-right border-bottom'>Name</th>" +
                "<th class='border-right border-bottom'>Mail</th>" +
                "<th class='border-right border-bottom'>Exercises done</th>" +
                "</tr>";

        for (Student stud: students) {
            value +=    "<tr>" +
                        "<td class='border-left border-right border-bottom'><a href='./public/StudentPages/" + stud.getMailName() + ".html'>" + stud.getName() + "</a></td>" +
                        "<td class='border-right border-bottom'>" + stud.getMail() + "</td>" +
                        "<td class='border-right border-bottom'>" + stud.getPoints() + "</td>" +
                        "</tr>";
        }
        value +=        "</table>";

        return value;
    }
}
