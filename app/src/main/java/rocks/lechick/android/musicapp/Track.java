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

    //Is the track bought?
    private boolean mBought = false;

    // Resource ID for the track


    // Tags by which the track might be searched, as in parts of lyrics, name of the track with typo etc


    /*
    * Create a new Track object.
    *
    * */
    public Track(String vTrackName, String vArtistName, String vAlbumName, int vAlbumCover, boolean vBought)
    {
        mTrackName = vTrackName;
        mArtistName = vArtistName;
        mAlbumName = vAlbumName;
        mBought = vBought;
        mAlbumCover = vAlbumCover;
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

    /**
     * Figure if the track's been bought or not
     */
    public boolean getmBought() {
        return mBought;
    }

}
