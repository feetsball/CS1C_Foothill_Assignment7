package hashTables;

import cs1c.SongEntry;

public class SongCompInt implements Comparable<Integer>
{
    /**
     * SongEntry object class attribute
     */
    private SongEntry songEntryObj;

    /**
     * Class constructor
     * @param song a song
     */
    public SongCompInt(SongEntry song)
    {
        songEntryObj = song;
    }

    /**
     * toString() override method
     * @return the songEntryObj
     */
    public String toString()
    {
        return songEntryObj.toString();
    }

    /**
     * compareTo() override method
     * @param key an integer key value
     * @return songEntryObj id
     */
    public int compareTo(Integer key)
    {
        return songEntryObj.getID() - key;
    }

    /**
     * equals() override method
     * @param rhs
     * @return songEntryObj
     */
    public boolean equals(SongCompInt rhs)
    {
        return songEntryObj.equals(rhs.songEntryObj);
    }

    /**
     * hashCode() override method
     * @return songEntryObj
     */
    public int hashCode()
    {
        return songEntryObj.getID();
    }
}
