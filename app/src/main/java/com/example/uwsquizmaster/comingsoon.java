package com.example.uwsquizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class comingsoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comingsoon);

        Button button = (Button) findViewById(R.id.bck);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openlanding();
            }
        });
    }

    public void openlanding(){
        Intent intent = new Intent(this, UserLanding.class);
        startActivity(intent);
    }

}