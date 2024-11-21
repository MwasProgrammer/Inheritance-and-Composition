package vraiment.com;

public class Brass extends Section {
    private String player;
    private int noOfPlayers;

    public Brass(String sectionName, String musicInstrument, String player, int noOfPlayers) {
        super(sectionName, musicInstrument);
        this.player = player;
        this.noOfPlayers = noOfPlayers;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }
}
