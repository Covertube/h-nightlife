package objects.Clubs.lux;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import parse.interfaces.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
public class Lux_Parse implements IParse {
    Document doc;
    private String EventTitle;
    private String Description;
    private String AK;
    private String StartTime;
    private int Day;
    private int Month;
    private String DayString;

    public Lux_Parse(String DayString, String StartTime, String AK){
        this.DayString = DayString;
        this.StartTime = StartTime;
        this.AK = AK;
    }

    public String getEventTitle() {
        return this.EventTitle;
    }

    public void setEventTitle(String s) {
        this.EventTitle = s;
    }

    public String getDescription() {
        return this.Description;
    }

    public setDescription(String s) {
        this.Description = s;
    }

    public int getAK() {
        return this.AK;
    }

    public setAK(int i) {
        this.AK = i;
    }

    public int getStartTime() {
        return this.StartTime;
    }

    public setStartTime(int i) {
        this.StartTime = i;
    }

    public int getDay() {
        return this.Day;
    }

    public setDay(int i) {
        this.Day = i;
    }

    public int getMonth() {
        return this.Month
    }

    public setMonth(int i) {
        this.Month = i;
    }

    public String getDayString() {
        return this.DayString;
    }

    public setDayString(String s) {
        this.DayString = s;
    }

}