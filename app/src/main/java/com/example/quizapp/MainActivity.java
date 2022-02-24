package com.example.quizapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup myradioGroup;
    int count=0;
    public static final String Data1="1st";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myradioGroup=findViewById(R.id.btnGroupId);
    }

    public void next(View view) {
        if(myradioGroup.getCheckedRadioButtonId()==R.id.btn2id){
            count++;
        }
        String countres=""+count;
        Intent myIntent=new Intent(this, MainActivity2.class);
        myIntent.putExtra(Data1,countres);
        startActivity(myIntent);
    }
}