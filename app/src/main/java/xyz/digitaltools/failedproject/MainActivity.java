package xyz.digitaltools.failedproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playB,stopB;
    Intent playstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playB = (Button) findViewById(R.id.playButtonID);
        stopB = (Button) findViewById(R.id.stopButtonID);
        playstop = new Intent(MainActivity.this,BgAudioService.class);

        playB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this,BgAudioService.class));
                //finish();
            }
        });

        stopB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this,BgAudioService.class));
                //finish();
            }
        });

    }
}
