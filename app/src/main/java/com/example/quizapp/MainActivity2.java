package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myradioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myradioGroup=findViewById(R.id.btnGroupId);

    }
    public void submit(View view) {
        int count1=0;
        if(myradioGroup.getCheckedRadioButtonId()==R.id.btn1id){
            count1++;
        }
        Intent myIntent=getIntent();
        String receive= myIntent.getStringExtra(MainActivity.Data1);

        int num=Integer.parseInt(receive);

        int res=num+count1;
        Toast.makeText(this, "Your total Score: "+res, Toast.LENGTH_SHORT).show();
    }
}