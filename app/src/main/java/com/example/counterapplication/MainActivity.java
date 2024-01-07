package com.example.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mydisplay,mytext;
    Button mybtn;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydisplay=findViewById(R.id.display);
        mytext=findViewById(R.id.welcome);
        mybtn=findViewById(R.id.myBtn);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydisplay.setText(""+counter());
            }
        });
    }

    public int counter(){
        return ++count;
    }
}