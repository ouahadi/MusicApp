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
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        rocks.lechick.android.musicapp.Track currentTrack = getItem(position);

        if (currentTrack.getmBought() == true) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_list_view_bought, parent, false);
        }
        else {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_list_view_not_bought, parent, false);
        }
        
        TextView nameTrackView = (TextView) listItemView.findViewById(R.id.track_name_list_view);
        nameTrackView.setText(currentTrack.getmTrackName());

        TextView nameArtistView = (TextView) listItemView.findViewById(R.id.artist_name_list_view);
        nameArtistView.setText(currentTrack.getmArtistName());

        TextView nameAlbumView = (TextView) listItemView.findViewById(R.id.album_name_list_view);
        nameAlbumView.setText(currentTrack.getmAlbumName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_cover_list_view);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentTrack.getmAlbumCover());

        return listItemView;

        }

    }

