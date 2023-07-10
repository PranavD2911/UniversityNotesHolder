package com.example.universitynotesholder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notespage extends AppCompatActivity {

    public void csnotes (View view){
        Intent csintent = new Intent(this, CSnotes.class);
        startActivity(csintent);
    }

    public void civilnotes (View view){
        Intent csintent = new Intent(this, Civilnotes.class);
        startActivity(csintent);
    }

    public void entcnotes (View view){
        Intent csintent = new Intent(this, Entcnotes.class);
        startActivity(csintent);
    }

    public void electricalnotes (View view){
        Intent csintent = new Intent(this, Electricalnotes.class);
        startActivity(csintent);
    }

    public void mechnotes (View view){
        Intent csintent = new Intent(this, Mechnotes.class);
        startActivity(csintent);
    }

    public void homebtn (View view){
        Intent csintent = new Intent(this, MainActivity.class);
        startActivity(csintent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notespage);

        Intent intent=getIntent();
    }

    public void backbt(View view){
        Intent back=new Intent(this,LoginActivity.class);
        startActivity(back);
    }
}