package com.example.milestokm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView appName;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        appName = (TextView)findViewById(R.id.textView);
        appName.setText("KM TO MILES");

        final Intent goTo = new Intent(this, ActivitySecond.class);

        button = (Button)findViewById(R.id.button);
        button.setText("START !");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goTo);
            }
        });
    }



}
