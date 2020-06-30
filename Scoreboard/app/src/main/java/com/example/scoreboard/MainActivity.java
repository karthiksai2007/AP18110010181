package com.example.scoreboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    TextView tv1;
    Button a1;
    Button a2;
    Button a3;
    Button c1;
    Button c2;
    Button c3;
    Button reset;
    int a;
    int b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.t2);
        tv1 = findViewById(R.id.t4);
        a1 = findViewById(R.id.b1);
        a2 = findViewById(R.id.b2);
        a3 = findViewById(R.id.b3);
        c1 = findViewById(R.id.b4);
        c2 = findViewById(R.id.b5);
        c3 = findViewById(R.id.b6);
        reset = findViewById(R.id.reset);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv.setText(""+a);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+2;
                tv.setText(""+a);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+3;
                tv.setText(""+a);
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                tv1.setText(""+b);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=b+2;
                tv1.setText(""+b);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=b+3;
                tv1.setText(""+b);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                tv.setText(""+a);
                b=0;
                tv1.setText(""+b);
            }
        });
        if(savedInstanceState!=null) {
            String s = savedInstanceState.getString("key");
            String s1 = savedInstanceState.getString("key1");
            tv.setText(s);
            tv1.setText(s1);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key",tv.getText().toString());
        outState.putString("key1",tv1.getText().toString());
    }


}
