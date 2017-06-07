package com.example.activitylifecycletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="activity_life_cycle_test ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_test );
        Button startNomalActivity=(Button) findViewById(R.id.start_nomal_activity) ;
        Button startDialogActivity=(Button) findViewById(R.id.start_dialog_activity) ;
        startNomalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        startDialogActivity .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}



