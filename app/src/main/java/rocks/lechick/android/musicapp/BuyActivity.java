package rocks.lechick.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.app.Activity;
import android.widget.Toast;

public class BuyActivity extends AppCompatActivity {

    private EditText mDateEntryField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        mDateEntryField = (EditText) findViewById(R.id.date_entry_field);
        mDateEntryField.addTextChangedListener(mDateEntryWatcher);

        Intent intent = getIntent();
        if (null != intent) {
            TextView nameTrackView = (TextView) findViewById(R.id.track_name_buy);
            nameTrackView.setText(intent.getStringExtra("TrackNameBuy"));

            TextView artistTrackView = (TextView) findViewById(R.id.artist_name_buy);
            artistTrackView.setText(intent.getStringExtra("ArtistNameBuy"));

            TextView albumTrackView = (TextView) findViewById(R.id.album_name_buy);
            albumTrackView.setText(intent.getStringExtra("AlbumNameBuy"));

        }

        Button button = (Button) findViewById(R.id.button_buy_small);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This is a learning project, we do not charge", Toast.LENGTH_LONG).show();
            }

        });
    }

    //This is supposed to watch out for the valid until field to present data in the right format (found on stackoverflow)
    private TextWatcher mDateEntryWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String working = s.toString();
            boolean isValid = true;
            if (working.length()==2 && before ==0) {
                if (Integer.parseInt(working) < 1 || Integer.parseInt(working)>12) {
                    isValid = false;
                } else {
                    working+="/";
                    mDateEntryField.setText(working);
                    mDateEntryField.setSelection(working.length());
                }
            }
            else if (working.length()==7 && before ==0) {
                String enteredYear = working.substring(3);
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                if (Integer.parseInt(enteredYear) < currentYear) {
                    isValid = false;
                }
            } else if (working.length()!=7) {
                isValid = false;
            }

            if (!isValid) {
                mDateEntryField.setError("Enter a valid date: MM/YYYY");
            } else {
                mDateEntryField.setError(null);
            }

        }

        @Override
        public void afterTextChanged(Editable s) {}

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    };

}

