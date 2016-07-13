package de.ur.mi.jonesses.listenary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void setupUI() {
        Button startStopButton = (Button) findViewById(R.id.start_stop_button);
        TextView trackInfoTextView = (TextView) findViewById(R.id.playing_info_textview);
    }
}
