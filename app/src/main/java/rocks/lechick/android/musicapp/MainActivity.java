package rocks.lechick.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create ArrayList of Java objects for Track
        ArrayList<rocks.lechick.android.musicapp.Track> tracks = new ArrayList<rocks.lechick.android.musicapp.Track>();
        tracks.add(new rocks.lechick.android.musicapp.Track("Ta fête", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Papaoutai", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Bâtard", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Ave Cesaria", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Tous les mêmes", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Formidable", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Moules frites", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Carmen", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Humain à l'eau", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Quand c'est?", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Sommeil", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Merci", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("AVF", "Stromae ", "Racine Carrée", R.drawable.stromae_racine_carree, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("About a Girl", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Come As You Are", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Jesus Doesn't Want Me for a Sunbeam", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("The Man Who Sold the World", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Pennyroyal Tea", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Dumb", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Polly", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("On a Plain", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Something in the Way", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Plateau", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Oh, Me", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, false));
        tracks.add(new rocks.lechick.android.musicapp.Track("Lake of Fire", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("All Apologies", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, true));
        tracks.add(new rocks.lechick.android.musicapp.Track("Where did you sleep last night", "Nirvana ", "Unplugged in New York", R.drawable.nirvana_mtv_unplugged_in_new_york, true));


        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        final rocks.lechick.android.musicapp.TrackAdaptor trackAdaptor = new rocks.lechick.android.musicapp.TrackAdaptor(this, tracks);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listView_tracks);
        listView.setAdapter(trackAdaptor);

        //set up onClick listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,int position, long id)
            {
                if (trackAdaptor.getItem(position).getmBought() == true){
                    Intent trackView = new Intent(MainActivity.this, TrackBoughtView.class);
                    startActivity(trackView);
                }

                if (trackAdaptor.getItem(position).getmBought() == false) {
                    Intent trackBuy = new Intent(MainActivity.this, TrackNotBoughtActivity.class);
                    startActivity(trackBuy);
                }
            }

        });

    }
}
