package com.lab1.a01272373.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;//Import the widget button.
import android.content.Intent;//Importing the Intent class.
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnActivity;
    EditText myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnActivity = findViewById(R.id.button2);
        myName = findViewById(R.id.my_Text);

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override // It creates an event listener for the button.
            public void onClick(View view) {
                String nameToSend = myName.getText().toString();
                Intent myIntent= new Intent(MainActivity.this,targetActivity1.class);
                myIntent.putExtra("name",nameToSend);
                startActivity(myIntent);
            }
        });
    }

}
