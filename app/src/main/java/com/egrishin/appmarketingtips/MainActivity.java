package com.egrishin.appmarketingtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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

    public void stageLifecycle(View view) {
                setContentView(R.layout.activity_common_lifecycle);
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

    public int scanRadioGroup3() {
        RadioGroup radioGroup_3 = (RadioGroup) findViewById(R.id.q3_radio_button_group);
        int n = radioGroup_3.getCheckedRadioButtonId();
        int s = 0;

        if (n == R.id.q3a2_radio_button) {
            s = s + 10;
        }

        else {
            s = 0;
        }

        return s;
    }

    public int scanRadioGroup4() {
        RadioGroup radioGroup_4 = (RadioGroup) findViewById(R.id.q4_radio_button_group);
        int n = radioGroup_4.getCheckedRadioButtonId();
        int s = 0;

        if (n == R.id.q4a1_radio_button) {
            s = s + 10;
        }

        else {
            s = 0;
        }

        return s;
    }

    public int scanRadioGroup5() {
        RadioGroup radioGroup_5 = (RadioGroup) findViewById(R.id.q5_radio_button_group);
        int n = radioGroup_5.getCheckedRadioButtonId();
        int s = 0;

        if (n == R.id.q5a4_radio_button) {
            s = s + 10;
        }

        else {
            s = 0;
        }

        return s;
    }

    public int scanEditText(){
        int s = 0;
        String x;
        x = q6aEntered();
        boolean check = false;

        if ((check = "Android Pay".equals(x)) || (check = "ANDROID PAY".equals(x)) || (check = "Android pay".equals(x)) || (check = "android pay".equals(x))) {
            s = s + 10;
        }

        else {
            s = 0;
        }

        return s;
    }

    private String q6aEntered(){
        EditText enteredName = (EditText) findViewById(R.id.q6_line_view);
        String n = enteredName.getText().toString();
        return n;
    }

    private boolean q7a1CheckboxStatus () {
        CheckBox q7a1Checkbox = (CheckBox) findViewById(R.id.q7a1_checkbox);
        boolean i = q7a1Checkbox.isChecked();
        return i;
    }
    private boolean q7a2CheckboxStatus () {
        CheckBox q7a2Checkbox = (CheckBox) findViewById(R.id.q7a2_checkbox);
        boolean i = q7a2Checkbox.isChecked();
        return i;
    }
    private boolean q7a3CheckboxStatus () {
        CheckBox q7a3Checkbox = (CheckBox) findViewById(R.id.q7a3_checkbox);
        boolean i = q7a3Checkbox.isChecked();
        return i;
    }
    private boolean q7a4CheckboxStatus () {
        CheckBox q7a4Checkbox = (CheckBox) findViewById(R.id.q7a4_checkbox);
        boolean i = q7a4Checkbox.isChecked();
        return i;
    }
    public int scanCheckBox(){
        int s = 0;
        if (q7a2CheckboxStatus() == true && q7a3CheckboxStatus() == true && q7a1CheckboxStatus() != true && q7a4CheckboxStatus() != true){
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
        m = m + scanRadioGroup3();
        m = m + scanRadioGroup4();
        m = m + scanRadioGroup5();
        m = m + scanEditText();
        m = m + scanCheckBox();
        return m;
    }

    public void displayCheckedButtonId_q1(View view) {
        score = scoreCount();

        if (score == 0){
            Toast.makeText(this, "Oh, nothing right...", Toast.LENGTH_LONG).show();
        }
        if (score == 70){
            Toast.makeText(this, "Whoa, 70 of 70!!!", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Your score is " + score + " of 70", Toast.LENGTH_LONG).show();
        }

    }


}