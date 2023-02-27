import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlFilterTwo {
    public static void sanitizeHtmlFile(File inputHtmlFile, File outputHtmlFile) throws IOException {
        // Parse the input HTML file using Jsoup
        Document doc = Jsoup.parse(inputHtmlFile, "UTF-8");

        // Remove all script tags and inline scripts
        doc.select("script").remove();
        Elements allElements = doc.select("*");
        for (Element element : allElements) {
            for (org.jsoup.nodes.Attribute attr : element.attributes()) {
                if (attr.getKey().toLowerCase().startsWith("on")) {
                    element.removeAttr(attr.getKey());
                }
            }
        }

        // Write the sanitized HTML to the output file
        FileWriter writer = new FileWriter(outputHtmlFile);
        writer.write(doc.html());
        writer.close();
        System.out.println(" you have filtered your sample HTML file successfully.");
    }
}
