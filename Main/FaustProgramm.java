package Main;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Iterator;

public class FaustProgramm {
    private Array<faust_objects> faust_events;
    private Document doc;

    public FaustProgramm() {
        this.faust_events = new Array<faust_objects>;
        this.doc = Jsoup.connect("http://www.kulturzentrum-faust.de/veranstaltungen.html?rub=1").get();
    }

    public Array<faust_objects> getFaust_Events(){

        Elements list = doc.select("div.tsr-1 tsr-1-mid  col-md-3 col-sm-4 col-xs-6 col-xxs-12");

        Iterator<Element> iter = list.iterator();

        while(iter.hasNext()) {
            Element events = iter.next().first();

            for (Element event : events) {
                faust_object object = new faust_object();

                object.setTitle(events.getElementsByClass("tmTitle1").text());
                object.setDate(events.getElementsByClass("tmDate  tColor-1").text());
                object.setLocation(Elements location = events.getElementsByClass("mLoc").text());
                object.setCost(events.getElementsByClass("tmEintritt").text());
                object.setTime(events.getElementsByClass("tmBeginn").text());

                this.faust_events.add(object);
            }
        }
        return this.faust_events;
    }



}