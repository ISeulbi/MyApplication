package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {
    private TextView tv_btn_nm1= null;
    private Button btn_1 = null;
    private Button btn_2 = null;
    private Button btn_3 = null;

    public void clkBtn1(View v) {
        Button btn = (Button)v;

        if(v.getId() == R.id.btn_1) {
            btn_1.setText("1");
            btn_2.setText("0");
            btn_3.setText("0");

        } else if (v.getId() == R.id.btn_2){
            btn_1.setText("0");
            btn_2.setText("2");
            btn_3.setText("0");

        } else if (v.getId() == R.id.btn_3){
            btn_1.setText("0");
            btn_2.setText("0");
            btn_3.setText("3");

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
        tv_btn_nm1 = findViewById(R.id.tv_btn_nm);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
    }
}
