package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {
    EditText first_no = null;
    EditText second_no = null;
    TextView calc = null;
    TextView answer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.calc);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
       init();
    }

    private void init(){
        first_no = findViewById(R.id.first_no);
        first_no.setShowSoftInputOnFocus(false);
        second_no = findViewById(R.id.second_no);
        second_no.setShowSoftInputOnFocus(false);

        answer = findViewById(R.id.answer);
        calc = findViewById(R.id.calc);
    }

    public void onClick(View v){
        Log.i("test","이벤트");
        Button b = null;
        if(v instanceof Button) {
            b = (Button) v;
        }

        if(answer.getText().toString().length()!=0){
            answer.setText(null);
            calc.setText(null);
            second_no.setText(null);
            first_no.setText(b.getText());
        }else if(b.getId()==R.id.equal){
            if(first_no.getText().toString().equals("")||calc.getText().toString().equals("")||second_no.getText().toString().equals("")){
                answer.setText("누락");
            }else {
                String str1 = first_no.getText().toString().trim();
                String str2 = second_no.getText().toString().trim();
                int i = 0, j=0;
                try {
                    i = Integer.parseInt(str1);
                    j = Integer.parseInt(str2);
                }catch (Exception e) { answer.setText("잘못된 값 입력"); }
                resultSet(i, j);
            }
        } else if(calc.getText().length()==0){
            first_no.setText(first_no.getText().toString() + b.getText());
        } else if (calc.getText().length()!=0) {
            second_no.setText(second_no.getText().toString() + b.getText());
        }
    }

    private void resultSet(int i, int j){
        if(calc.getText().toString().equals("+")){
            answer.setText("" + (i + j));
        } else if (calc.getText().toString().equals("-")){
            answer.setText(""+ (i - j));
        } else if (calc.getText().toString().equals("*")){
            answer.setText(""+ (i*j));
        } else if (calc.getText().toString().equals("/")){
            if(j!=0) {
                answer.setText("" + ((double) i / j));
            }else {
                answer.setText("not biv 0");
            }
        }
    }

    public void calcBtn(View v){
        if(v instanceof Button) {
            Button b = (Button)v;
            String x = b.getText().toString().trim();
            if(x.equals("C")){
                first_no.setText(null);
                calc.setText(null);
                second_no.setText(null);
                answer.setText(null);
            }else {
                calc.setText(x);
            }
        }
    }
}
