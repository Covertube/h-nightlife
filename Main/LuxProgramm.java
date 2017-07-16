import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import objects.Club.lux.Lux_Parse;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import objects.Clubs.lux.*;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;


public class LuxProgramm {
    ArrayList<String> lux_events;
    Document doc;

    public LuxProgramm() {
        this.lux_events = new ArrayList<String>;
        this.doc = Jsoup.connect("http://www.lux-linden.de/programm/").get();
    }

    public ArrayList<Lux_Parse> getLux_events() {
        ArrayList<Lux_Parse> Array;
        Elements event_list = doc.select("div.row-fluid.event-listing-element.clubnight.event");
        Iterator<Elements> iter = event_list.iterator();
        while(iter.hasNext()) {
            Elements content = iter.next().first().getElementsByClass("row-fluid");
            Iterator<Elements> iter1 = content.iterator();
            while(iter1.hasNext()) {
                iter1.next();
            }
        }

    }


}