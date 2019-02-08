package com.lab1.a01272373.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
public class targetActivity1 extends AppCompatActivity {
    TextView myTextView;
    Intent currentIntent;
    String myIntentVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target1);
        currentIntent=getIntent();
        Bundle extras = getIntent().getExtras();
        if (extras != null){
             myIntentVar = extras.getString("name");
        }
        myTextView= findViewById(R.id.nameAct2);
        myTextView.setText(myIntentVar);
    }
}
