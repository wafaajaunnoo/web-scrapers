import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebScraper {
    public static void main(String[] args) {
        String url = "https://finance.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAAHPwJe3qdC_QNe7l_Y41Nvmo1sAa-S6cXW0R7HrkAUnK-KGVOKVfY5B19w-vGXhpePOWE756En9LJP_hXIvUC15V2t3lFl9mzysXpFK4bmQQIHIp9qNmrd5n-zx1wurHvnhItEw4JNibYJzA0PWj7uEXAj0QN0GUN83NsCI-epAs"; 
        try {
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("a");
            for (Element link : links) {
                System.out.println(link.attr("href"));
            }
     } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
