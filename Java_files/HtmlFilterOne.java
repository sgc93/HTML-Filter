import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlFilterOne {
    public static String sanitizeHtml(String inputHtml) {
        // Parse the input HTML using Jsoup
        Document doc = Jsoup.parse(inputHtml);

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

        // Return the sanitized HTML as a string
        return doc.html();
    }
}

