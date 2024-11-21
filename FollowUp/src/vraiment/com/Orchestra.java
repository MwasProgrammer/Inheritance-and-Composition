package vraiment.com;

public class Orchestra {
    private String nameOfOrchestra;
    private String concertMonth;
    private Brass brass;
    private Percussion percussion;
    private StringSection stringSection;

    //constructor
    public Orchestra(String nameOfOrchestra, String concertMonth, Brass brass, Percussion percussion, StringSection stringSection) {
        this.nameOfOrchestra = nameOfOrchestra;
        this.concertMonth = concertMonth;
        this.brass = brass;
        this.percussion = percussion;
        this.stringSection = stringSection;
    }


    //getters and setters
    public String getNameOfOrchestra() {
        return nameOfOrchestra;
    }

    public void setNameOfOrchestra(String nameOfOrchestra) {
        this.nameOfOrchestra = nameOfOrchestra;
    }

    public String getConcertMonth() {
        return concertMonth;
    }

    public void setConcertMonth(String concertMonth) {
        this.concertMonth = concertMonth;
    }

    public Brass getBrass() {
        return brass;
    }

    public void setBrass(Brass brass) {
        this.brass = brass;
    }

    public Percussion getPercussion() {
        return percussion;
    }

    public void setPercussion(Percussion percussion) {
        this.percussion = percussion;
    }

    public StringSection getStringSection() {
        return stringSection;
    }

    public void setStringSection(StringSection stringSection) {
        this.stringSection = stringSection;
    }
}
