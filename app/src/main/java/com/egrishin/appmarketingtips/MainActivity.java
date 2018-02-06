package com.egrishin.appmarketingtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stageEssential(View view) {
        setContentView(R.layout.activity_essential_questions);
    }

   /* *//*public void markComplete(View view){
        TextView completeText = (TextView) findViewById(R.id.markComplete);
        completeText.setText("Completed");*//*
    }*/

    public void stageLifecycle(View view) {
        markComplete(View);
        setContentView(R.layout.activity_common_lifecycle);
    }

    public void markComplete(View view){
        TextView completeText = (TextView) findViewById(R.id.markComplete);
        completeText.setText("Completed");
    }

    public void stageDevelop(View view) {
       setContentView(R.layout.activity_develop_stage);
    }

    public void stageLaunch(View view) {
        setContentView(R.layout.activity_launch_stage);
    }

    public void stageEngage(View view) {
        setContentView(R.layout.activity_engage_stage);
    }

    public void stageGrow(View view) {
        setContentView(R.layout.activity_grow_stage);
    }

    public void stageEarn(View view) {
        setContentView(R.layout.activity_earn_stage);
    }

    public void start_quiz(View view) {
        setContentView(R.layout.activity_quiz);
    }

    public int scanRadioGroup1() {
        RadioGroup radioGroup_1 = (RadioGroup) findViewById(R.id.q1_radio_button_group);
        int n = radioGroup_1.getCheckedRadioButtonId();
        int s = 0;

        if (n == R.id.q1a3_radio_button) {
            s = s + 10;
        }

        else {
            s = 0;
        }

        return s;
    }

    public int scanRadioGroup2() {
        RadioGroup radioGroup_2 = (RadioGroup) findViewById(R.id.q2_radio_button_group);
        int n = radioGroup_2.getCheckedRadioButtonId();
        int s = 0;

        if (n == R.id.q2a3_radio_button) {
            s = s + 10;
        }

        else {
            s = 0;
        }

        return s;
    }

    public int scoreCount(){
        int m = 0;
        m = scanRadioGroup1();
        m = m + scanRadioGroup2();
        return m;
    }

    public void displayCheckedButtonId_q1(View view) {
        TextView checkedButtonId = (TextView) findViewById(R.id.q1textView);
        score = scoreCount();
        checkedButtonId.setText("" + score);
    }


}