package vraiment.com;

public class Percussion extends Section {
    private boolean isPlaying;

    public Percussion(String sectionName, String musicInstrument, boolean isPlaying) {
        super(sectionName, musicInstrument);
        this.isPlaying = isPlaying;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if (!isPlaying()) {
            System.out.println("Play at the concert.");
        } else {
            System.out.println("You did not sign up for this season. You are not playing at the concert!");
        }
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
