package com.egrishin.appmarketingtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Table_of_contents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_contents);
    }

    public void infoEssential(View view){
        setContentView(R.layout.activity_essential_questions);
    }

}
