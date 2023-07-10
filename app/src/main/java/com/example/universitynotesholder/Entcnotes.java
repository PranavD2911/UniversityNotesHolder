package com.example.universitynotesholder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entcnotes extends AppCompatActivity {

    public void sem1btn(View view){
        Intent sem1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1sBFvlkUy71y_hY1MkKjhRPdNff8wKNYE?usp=sharing"));
        startActivity(sem1);
    }

    public void sem2btn(View view){
        Intent sem2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/10MiwpM8rlVMehmsTwXJQyaB7mnSbHRpF?usp=sharing"));
        startActivity(sem2);
    }

    public void sem3btn(View view){
        Intent sem3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1NTeTmw0ayKMsaI8mkJYPqVcb7K1qodc9?usp=sharing"));
        startActivity(sem3);
    }

    public void sem4btn(View view){
        Intent sem4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1IUrCHNTyziOTpniNGKar1ItXsHFn4QhG?usp=sharing"));
        startActivity(sem4);
    }

    public void sem5btn(View view){
        Intent sem5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1OzmXyPfAC05dIcjafDnVWNpAkaPW6dUh?usp=sharing"));
        startActivity(sem5);
    }

    public void sem6btn(View view){
        Intent sem6=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1JYClRv9-cRaJOz9DeFAmLpgpX-wHv7O9?usp=sharing"));
        startActivity(sem6);
    }

    public void sem7btn(View view){
        Intent sem7=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/12tLUft5VgFDPtU1oPnZ1wOjG5rzw6O6Z?usp=sharing"));
        startActivity(sem7);
    }

    public void sem8btn(View view){
        Intent sem8=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1pgkj03mgAe9ifPlOXCE2TbXiuOySwxjA?usp=sharing"));
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
        setContentView(R.layout.activity_entcnotes);

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