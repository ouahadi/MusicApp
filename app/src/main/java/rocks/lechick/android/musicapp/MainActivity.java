package rocks.lechick.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create ArrayList of Java objects for Track
        ArrayList<Tracks> tracks = new ArrayList<Tracks>();
        tracks.add(new rocks.lechick.android.musicapp.Track("Papaoutai", "Stromae", "Racine Carrée", vTrackTags <"racine", "papaoutai", "stromae">, R.drawable.stromae_racine_carre));
    }
}
