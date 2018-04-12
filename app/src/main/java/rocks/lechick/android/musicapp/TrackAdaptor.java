package rocks.lechick.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by alek on 02/04/2018.
 */


public class TrackAdaptor extends ArrayAdapter<rocks.lechick.android.musicapp.Track> {


    public TrackAdaptor(Activity context, ArrayList<rocks.lechick.android.musicapp.Track> tracks) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tracks);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Because the views inflate in 2 ways I can't really check if the existing view
        // is being reused, so I am inflating the view based on the track's status bought/not bought
        View listItemView = convertView;

            rocks.lechick.android.musicapp.Track currentTrack = getItem(position);


            if (currentTrack.getmBought() == true) {
                //inflate the view from the xml file for bought tracks
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.track_list_view_bought, parent, false);

            }

            if (currentTrack.getmBought() == false) {
                //inflate the view from the xml file for bought tracks
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.track_list_view_not_bought, parent, false);
            }
                //initialise the view with the name of the track and fill it with info from the current track
                TextView nameTrackView = (TextView) listItemView.findViewById(R.id.track_name_list_view);
                nameTrackView.setText(currentTrack.getmTrackName());

                //initialise the view with the name of the artist and fill it with info from the current track
                TextView nameArtistView = (TextView) listItemView.findViewById(R.id.artist_name_list_view);
                nameArtistView.setText(currentTrack.getmArtistName());

                //initialise the view with the name of the album and fill it with info from the current track
                TextView nameAlbumView = (TextView) listItemView.findViewById(R.id.album_name_list_view);
                nameAlbumView.setText(currentTrack.getmAlbumName());

                //initialise the view with the album cover and fill it with info from the current track
                ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_cover_list_view);
                iconView.setImageResource(currentTrack.getmAlbumCover());

        return listItemView;

        }

    }

