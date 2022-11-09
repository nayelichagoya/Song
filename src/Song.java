public class Song
{
    // 1) class or instance variables
    private String title;
    private String artist;
    private boolean hasChorus;
    private int tempo;
    private double playTime;
    private static int numSongs;

    // 2) Contructors
    public Song(String title, String artist, boolean hasChorus, int tempo, double playTime)
    {
        this.title = title;
        this.artist = artist;
        this.hasChorus = hasChorus;
        this.tempo = tempo;
        this.playTime = playTime;
        numSongs++;
    }//end full constructor
    // Overloaded constructor - must be different by the type in the parameter list

    // 4) Getter = allow the client to access instance variables
    public String getTitle()
    {
        return title;
    } // end title getter

    public String getArtist()
    {
        return artist;
    } //end artist getter

    public int getTempo()
    {
        return tempo;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    // 5) Setter (aka mutators) To change a value
    public void setTempo(int myTempo)
    {
        tempo = myTempo;
    }// end tempo setter


    // 6) Brain Methods
    //Convert the playTime into seconds
    public int playTimeSeconds()
    {
        int minuteInSeconds = 60 * (int)(playTime) ;
        //subtract minute part from playTime to get second part
        double something = playTime - (int)(playTime);
        int seconds = (int)(playTime * 100) % 100;
                //gets the minute part into seconds
        return seconds + minuteInSeconds;
    }
    //  To String
    public String toString()
    {
        String output = "Title: " + title +
                        "\nArtist: " + artist +
                        "\nHas a Chorus: " + hasChorus +
                        "\nTempo: " + tempo +
                "\nPlay time: " + playTime;

        return output;
    }
} //end Song class
