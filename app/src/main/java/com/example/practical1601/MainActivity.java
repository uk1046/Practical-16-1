package com.example.practical1601;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showTimeButton = findViewById(R.id.showTimeButton);
    }
    public void showSelectedTime(View view) {
        TimePicker timePicker = findViewById(R.id.timePicker);

        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();

        String timeMode = (hour < 12) ? "AM" : "PM";

        if (hour > 12) {
            hour -= 12;
        }
        String formattedTime = String.format("%02d:%02d %s", hour, minute, timeMode);
        Toast.makeText(this, "Selected Time: " + formattedTime, Toast.LENGTH_SHORT).show();
    }
}
