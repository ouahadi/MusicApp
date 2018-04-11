package rocks.lechick.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrackBoughtView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_bought_view);

        Intent intent = getIntent();
        if (null != intent) {
            TextView nameTrackView = (TextView) findViewById(R.id.track_name);
            nameTrackView.setText(intent.getStringExtra("TrackName"));

            TextView artistTrackView = (TextView) findViewById(R.id.artist_name);
            artistTrackView.setText(intent.getStringExtra("ArtistName"));

            TextView albumTrackView = (TextView) findViewById(R.id.album_name);
            albumTrackView.setText(intent.getStringExtra("AlbumName"));

            ImageView albumCoverView = (ImageView) findViewById(R.id.album_cover);
            albumCoverView.setImageResource(intent.getIntExtra("AlbumCover", R.drawable.stromae));

        }
    }
}
