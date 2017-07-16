package objects.interfaces;

import org.jsoup.Jsoup;

public class IParse {

    public abstract Elements get_divs(Document doc);

    public abstract String getText();

    public abstract String getEventTitle();
}