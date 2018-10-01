package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {
    private TextView textView_print = null;
    private EditText editText_print = null;
    private Button button_print = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("PrintStar");

        init();
    }

    private  void init(){
        editText_print = findViewById(R.id.EditText_print);
        textView_print = findViewById(R.id.TextView_print);
        button_print = findViewById(R.id.Button_print);
        button_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = editText_print.getText().toString().trim();

                int index = checkInteger(x);
                String print = "";
                if(index > 0) {
                    for (int i = 0; i < index; i++) {
                        for (int j = 0; j <= i; j++) {
                            print += "*";
                        }
                        print += "\n";
                    }
                }

                textView_print.setText(print);
                editText_print.setText(null);
            }
        });
    }

    private  int checkInteger(String v){
        int result = 0;
        try{
            result = Integer.parseInt(v);
        }catch (Exception e){

        }
        return result;
    }
}
