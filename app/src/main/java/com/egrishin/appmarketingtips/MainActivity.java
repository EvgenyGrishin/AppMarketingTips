package com.egrishin.appmarketingtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tableOfContents(View view) {
        setContentView(R.layout.activity_table_of_contents);
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

}