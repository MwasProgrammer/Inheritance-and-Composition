package vraiment.com;

public class StringSection extends Section {
    private String player;

    public StringSection(String sectionName, String musicInstrument, String player) {
        super(sectionName, musicInstrument);
        this.player = player;
    }

    //override the getDetails() method initiated in the parent class


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("First violinist: " + this.getPlayer());
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
