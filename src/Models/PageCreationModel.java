package Models;

public class PageCreationModel
{
    private String htmlContent, filePath;
    private boolean isPersonal;

    public PageCreationModel(String htmlContent, String filePath, boolean isPersonal)
    {
        this.htmlContent = htmlContent;
        this.filePath = filePath;
        this.isPersonal = isPersonal;
    }

    public String getHtmlContent()
    {
        return htmlContent;
    }
    public String getFilePath()
    {
        return filePath;
    }
    public boolean isPersonal()
    {
        return isPersonal;
    }

    @Override
    public String toString()
    {
        return "PageCreationModel{" +
                "htmlContent='" + htmlContent + '\'' +
                ", filePath='" + filePath + '\'' +
                "}\n";
    }
}
