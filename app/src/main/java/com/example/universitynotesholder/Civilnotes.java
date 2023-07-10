package com.example.universitynotesholder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.util.ValueIterator;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civilnotes extends AppCompatActivity {

    public void sem1btn(View view){
        Intent sem1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1JWMwL9gf-5iPIAcLgYJb4raGUPexfkmh?usp=sharing"));
        startActivity(sem1);
    }

    public void sem2btn(View view){
        Intent sem2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1qGYmI7LzBMM1PvuViAun02bZ-rvaRggi?usp=sharing"));
        startActivity(sem2);
    }

    public void sem3btn(View view){
        Intent sem3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1JYEV0PbTqbLOi8WF-TRAm0X3LeH-y7Fo?usp=sharing"));
        startActivity(sem3);
    }

    public void sem4btn(View view){
        Intent sem4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1BLVOXMXnWhcz2Mr0KH-IhJd0zj1b_aI_?usp=sharing"));
        startActivity(sem4);
    }

    public void sem5btn(View view){
        Intent sem5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1RSSeLJj15BafeNVH_kg5a2NfDT1yxTT_?usp=sharing"));
        startActivity(sem5);
    }

    public void sem6btn(View view){
        Intent sem6=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1nsmiNDnub7X3PXw668mF3BAw1OWtY6h1?usp=sharing"));
        startActivity(sem6);
    }

    public void sem7btn(View view){
        Intent sem7=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1sFOB1jcmE7oi1HUYoBwP1Ohqi8kJtOeX?usp=sharing"));
        startActivity(sem7);
    }

    public void sem8btn(View view){
        Intent sem8=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1szO4rURxZJtMeRM3HNawcSkbSSU7StLh?usp=sharing"));
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
        setContentView(R.layout.activity_civilnotes);

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
                .setTitle("Thanks for Using...!")
                .setMessage("Thanks For Using....3" +
                        "Are you sure you want to exit")
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