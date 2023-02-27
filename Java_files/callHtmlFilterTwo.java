import java.io.File;
import java.io.IOException;

public class callHtmlFilterTwo {
    public static void callSanitizeHtmlFile() throws IOException {

        File inputHtmlFile = new File("C:\\Users\\hp pavilion\\Documents\\GitHub\\Fundamentals-of-software-security-prooject\\sample html document\\OriginalHtmlCode.html");
        File outputHtmlFile = new File("C:\\Users\\hp pavilion\\Documents\\GitHub\\Fundamentals-of-software-security-prooject\\sample html document\\FilteredHtmlCode.html");

        HtmlFilterTwo.sanitizeHtmlFile(inputHtmlFile, outputHtmlFile);
    }
}
