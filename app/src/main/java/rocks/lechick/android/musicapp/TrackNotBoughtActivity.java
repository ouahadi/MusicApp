package rocks.lechick.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TrackNotBoughtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_not_bought);

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

        Button button = (Button) findViewById(R.id.button_buy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(TrackNotBoughtActivity.this, BuyActivity.class);

                Intent intent = getIntent();
                if (null != intent) {
                    Bundle trackInfo = new Bundle();
                    trackInfo.putString("TrackNameBuy", intent.getStringExtra("TrackName"));
                    trackInfo.putString("ArtistNameBuy", intent.getStringExtra("ArtistkName"));
                    trackInfo.putString("AlbumNameBuy", intent.getStringExtra("AlbumName"));
                    intent1.putExtras(trackInfo);
                }

                startActivity(intent1);
            }
        });

    }
}





