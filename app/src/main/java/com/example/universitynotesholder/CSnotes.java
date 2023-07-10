package com.example.universitynotesholder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSnotes extends AppCompatActivity {

    public void questions(View view){
    Intent questionpaper = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1L1moM4A88wallL0EigivhwibwN9v97m6?usp=sharing"));
    startActivity(questionpaper);
    }

    public void back(View view){
        Intent back=new Intent(this, Notespage.class);
        startActivity(back);
    }

    public void femcq(View view){
        Intent FEmcq=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1_WB_LeCopCYZq1jeGcPgBnPVuseO7vFZ?usp=sharing"));
        startActivity(FEmcq);
    }

    public void sem3(View view){
        Intent Sem3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1kQ_Gm1urIsuLrDFBE5e2Y2JvM0SJqbHo?usp=sharing"));
        startActivity(Sem3);
    }

    public void sem4(View view){
        Intent Sem4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1Wst1miKV2MjF0BH8lrIi6i2E2byx8Lh_?usp=sharing"));
        startActivity(Sem4);
    }

    public void sem5(View view){
        Intent Sem5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/drive/folders/1JcTsKeK3yO7lama2woTaeBWYL7_Q4axN?usp=sharing"));
        startActivity(Sem5);
    }

    public void sem6(View view){
        Intent Sem6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/drive/folders/1rcaq9XpA8t752DEs5E_lfsdprXAUxjly?usp=sharing"));
        startActivity(Sem6);
    }

    public void sem7(View view){
        Intent Sem7= new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/13JInqHZbSNaZvB3qlsrgXN1QbLSFq3gD?usp=sharing"));
        startActivity(Sem7);
    }

    public void sem8(View view){
        Intent Sem8=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/11GmuSuoZQ5WpLa3-ITVtpPNXxI8C3VTk?usp=sharing"));
        startActivity(Sem8);
    }

    Button btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csnotes);

//        btnexit=(Button) findViewById(R.id.btnexit);
//        btnexit.setOnClickListener(new View.OnClickListener() {
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