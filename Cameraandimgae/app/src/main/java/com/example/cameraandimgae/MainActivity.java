package com.example.cameraandimgae;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button camera,gallery;
    ImageView images;

    public static final int CAMERA_REQUEST_CODE=25;
    public static final int GALLERY_REQUEST_CODE=35;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camera=findViewById(R.id.camera);
        gallery=findViewById(R.id.gallery);
        images=findViewById(R.id.image);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCamera();
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengallery();
            }
        });
    }

    private void opengallery()
    {
        Intent i1=new Intent();
        i1.setType("image/*");
        i1.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(i1,GALLERY_REQUEST_CODE);
    }

    private void openCamera()
    {
        Intent i2=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i2,CAMERA_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==CAMERA_REQUEST_CODE){
            if (resultCode==RESULT_OK){
                Bitmap b= (Bitmap) data.getExtras().get("data");
                images.setImageBitmap(b);
            }
        }

        if(requestCode==GALLERY_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Uri u1=data.getData();
                images.setImageURI(u1);

            }
        }


    }
}