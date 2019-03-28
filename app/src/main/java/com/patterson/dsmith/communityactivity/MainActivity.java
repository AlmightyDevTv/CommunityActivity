package com.patterson.dsmith.communityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity {

    Button login;
    TextView username;
    Button nextButton;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (TextView) findViewById(R.id.username);


    }
}
