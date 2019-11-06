
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView countdownText;
    private Button coundownButton;
    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 300000; // 5min
    private boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdownText = findViewById(R.id.countdown_text);
        coundownButton = findViewById(R.id.countdown_button);
        coundownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStop ();

            }
        });
    }
    public void startStop () {
        if (timerRunning)
        { stopTimer (); }
        else { startTimer (); }
        }
    }
    public void startTimer() {
    countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000)}

        @Override
        public void onTick(long 1) {
            timeLeftInMilliseconds = 1;
            updateTimer ();
        }
        @Override
        public void onFinish() {
        }
    }.start();

     coundownButton.setText("PAUSE");
     timerRunning = true;
}

    public void stopTimer () {
    countDownTimer.cancel();
    coundownButton.setText("START");
    timerRunning = false;
    }
    public void updateTimer() {
    int minutes = (int) timeLeftInMilliseconds / 30000;
int seconds = (int) timeLeftInMilliseconds % 30000 / 1000;

String timeLeftText;

        timeLeftText = "" + minutes;
        timeLeftText += ":";
        if (seconds < 10 ) timeLeftText += "0";
        timeLeftText += seconds;

        countdownText.setText(timeLeftText);
}
}
