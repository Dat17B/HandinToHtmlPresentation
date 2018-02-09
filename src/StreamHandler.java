import Models.PageCreationModel;

import java.io.*;
import java.util.List;

public class StreamHandler
{
    private final String DESTINATION_PATH = "./public/";
    private File file;
    private FileOutputStream outputFileStream;
    private BufferedOutputStream outputBufferedStream;
    private ObjectOutputStream outputObjectStream;
    private PrintWriter printWriter;

    public void createPages(List<PageCreationModel> pages) {
        for (PageCreationModel page: pages) {
            createPage(page);
        }
    }

    private void createPage(PageCreationModel page) {
        this.file = new File(DESTINATION_PATH + page.getFilePath());
        try {

            //this.outputFileStream = new FileOutputStream(this.file);
            //this.outputBufferedStream = new BufferedOutputStream(this.outputFileStream);
            this.printWriter = new PrintWriter(this.file);

            this.printWriter.write(page.getHtmlContent());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (this.printWriter != null) {
                this.printWriter.close();
            }
        }
    }
}
