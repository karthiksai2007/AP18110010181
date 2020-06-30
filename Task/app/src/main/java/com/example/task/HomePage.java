package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.task.R;

public class HomePage extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv=findViewById(R.id.textView);
        String s=getIntent().getStringExtra("name");
        tv.setText("Welcome: "+s);
    }
}