package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openurl(View view) {
        Uri u = Uri.parse("https://www.youtube.com/");
        Intent i= new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }

    public void call(View view) {
        Uri d= Uri.parse("tel:9295049999");
        Intent i= new Intent(Intent.ACTION_DIAL,d);
        startActivity(i);
    }

    public void mylocation(View view) {
        Uri gmmIntentUri = Uri.parse("geo:16.463054,80.506849");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}