package com.example.universitynotesholder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mechnotes extends AppCompatActivity {

    public void sem1btn(View view){
        Intent sem1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1uKJUV9ZAihwPU3NTDH3VzMdlvwdwYkXr?usp=sharing"));
        startActivity(sem1);
    }

    public void sem2btn(View view){
        Intent sem2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1vo38N9lEw_iqSq0HQpEqd9sQU47pIHMk?usp=sharing"));
        startActivity(sem2);
    }

    public void sem3btn(View view){
        Intent sem3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1CrtJ9qKvOfGBS4nNwO_MDCg6ZEbAk0cj?usp=sharing"));
        startActivity(sem3);
    }

    public void sem4btn(View view){
        Intent sem4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1HXFzfbVcqzqQILCsUPRXG1j0xVzFLutp?usp=sharing"));
        startActivity(sem4);
    }

    public void sem5btn(View view){
        Intent sem5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1JmbF7V2-GdmFdpVHiP7eP4cEgnqEM2bG?usp=sharing"));
        startActivity(sem5);
    }

    public void sem6btn(View view){
        Intent sem6=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1L66-7Ifx9GN2aSBUZu2gi1xcmaDbjrzk?usp=sharing"));
        startActivity(sem6);
    }

    public void sem7btn(View view){
        Intent sem7=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1pVm9WX_zLvJD1ENzpTMBqgJ_y6Ov0Y0H?usp=sharing"));
        startActivity(sem7);
    }

    public void sem8btn(View view){
        Intent sem8=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1Yp_hj2IxyWIPBmNSf8vT0spf65eNqs0T?usp=sharing"));
        startActivity(sem8);
    }
    public void backbtn(View view){
        Intent back=new Intent(this,Notespage.class);
        startActivity(back);
    }

    Button exitbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechnotes);

//        exitbtn1=(Button) findViewById(R.id.exitbtn1);
//        exitbtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                moveTaskToBack(true);
//                android.os.Process.killProcess(android.os.Process.myPid());
//                System.exit(1);
//            }
//        });
    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No",null)
                .show();
    }
}