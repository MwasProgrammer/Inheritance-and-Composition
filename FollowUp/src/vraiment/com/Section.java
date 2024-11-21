package vraiment.com;

public class Section {
    private String sectionName;
    private String musicInstrument;

    //Constructor
    public Section(String sectionName, String musicInstrument) {
        this.sectionName = sectionName;
        this.musicInstrument = musicInstrument;
    }

    //A method to get details
    public void getDetails () {
        System.out.println("Section: " + this.getSectionName());
        System.out.println("Music instrument in this section: " + this.getMusicInstrument());
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getMusicInstrument() {
        return musicInstrument;
    }

    public void setMusicInstrument(String musicInstrument) {
        this.musicInstrument = musicInstrument;
    }
}
