package com.example.android.educationalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup1;RadioGroup radioGroup2;
    RadioButton radio;
    String res_g1="";String res_g2="";
    boolean a5 ,b5, c5, d5;
    String questiononeText="";String questiononeTwoText="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group_1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_group_2);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radio = (RadioButton) findViewById(checkedId);
                res_g1 = radio.getText().toString();
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radio = (RadioButton) findViewById(checkedId);
                res_g2 = radio.getText().toString();
            }
        });
    }


    public void Submit(View view) {
        CheckBox QA5checkbox = (CheckBox) findViewById(R.id.a5);
        a5 = QA5checkbox.isChecked();

        CheckBox QB5checkbox = (CheckBox) findViewById(R.id.b5);
        b5 = QB5checkbox.isChecked();

        CheckBox QC5checkbox = (CheckBox) findViewById(R.id.c5);
        c5 = QC5checkbox.isChecked();

        CheckBox QD5checkbox = (CheckBox) findViewById(R.id.d5);
        d5 = QD5checkbox.isChecked();

        EditText nameeditText1 = (EditText) findViewById(R.id.Enter_result_q1);
        questiononeText = nameeditText1.getText().toString();

        EditText nameeditText2 = (EditText) findViewById(R.id.Enter_result_q2);
        questiononeTwoText = nameeditText2.getText().toString();

        if (res_g1.equals("a.Asia")&&res_g2.equals("c.312.4")&&!a5 == true &&b5 == true && c5 == true && d5 == true&&questiononeText.equals("108")&&questiononeTwoText.equals("11")) {
            Toast.makeText(this, "The result=5/5 answer", Toast.LENGTH_SHORT).show();
            return;
        } else {
            Toast.makeText(this, "Error in your result", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}