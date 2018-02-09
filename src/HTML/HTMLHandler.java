package HTML;

import Models.Student;

import java.util.ArrayList;
import java.util.List;

public class HTMLHandler
{
    private BlackList blackList;
    private PersonalPage personalPage;

    public HTMLHandler()
    {
        this.blackList = new BlackList();
        this.personalPage = new PersonalPage();
    }

    public BlackList getBlackList() { return this.blackList; }
    public PersonalPage getPersonalPage()
    {
        return personalPage;
    }
}