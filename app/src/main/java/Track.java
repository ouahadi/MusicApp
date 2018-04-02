/**
 * Created by alek on 02/04/2018.
 */

package rocks.lechick.android.musicapp;

import java.util.List;

public class Track {

    // Name of the track, like Papaoutai
    private String mTrackName;

    // Artist name, like Stromae
    private String mArtistName;

    // Album name, like Racine Carrée
    private String mAlbumName;

    // Drawable resource ID for album cover
    private int mAlbumCover;

    // Resource ID for the track
    private int mTrackFile;

    // Tags by which the track might be searched, as in parts of lyrics, name of the track with typo etc
    private String [] trackTags;

    /*
    * Create a new Track object.
    *
    * */
    public SingleTrack(String vTrackName, String vArtistName, String vAlbumName, List<String> vTrackTags, int vAlbumCover, int vTrackFile)
    {
        mTrackName = vTrackName;
        mArtistName = vArtistName;
        mAlbumName = vAlbumName;
        trackTags = vTrackTags;
        mAlbumCover = vAlbumCover;
        mTrackFile = vTrackFile;
    }

    /**
     * Get the track name
     */
    public String getmTrackName() {
        return mTrackName;
    }

    /**
     * Get the artist name
     */
    public String getmArtistName() {
        return mArtistName;
    }

    /**
     * Get the album name
     */
    public String getmAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the album cover image resource ID
     */
    public int getmAlbumCover() {
        return mAlbumCover;
    }

    /**
     * Get the track music file resource ID
     */
    public int getmTrackFile() {
        return mTrackFile;
    }

    /**
     * Get track tags
     */
    public String[] getTrackTags {
        return trackTags[]
    }


}
