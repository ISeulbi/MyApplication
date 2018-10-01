package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button player = null;
    private Button calc = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

    }

    private void init(){
        player = findViewById(R.id.player);
            player.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Main2Activity.this, "플레이어", Toast.LENGTH_LONG).show();
                }
            });
        calc = findViewById(R.id.calc);
            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Main2Activity.this, "계산기", Toast.LENGTH_LONG).show();
                }
            });

    }
}

