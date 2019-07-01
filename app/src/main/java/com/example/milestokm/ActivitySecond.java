package com.example.milestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText kmInput = findViewById(R.id.kmInput);
        final TextView result = findViewById(R.id.textViewResult);
        result.setText("");

        Button setResult = findViewById(R.id.buttonConvert);
        setResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = String.valueOf(kmInput.getText());
                int km =  Integer.parseInt(input);
                int miles = (int) (km / 0.621371);
                result.setText(Integer.toString(miles));
            }
        });
    }
}
