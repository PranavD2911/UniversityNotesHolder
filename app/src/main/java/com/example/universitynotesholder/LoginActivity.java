package com.example.universitynotesholder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button exitbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent=getIntent();
        String message= intent.getStringExtra(MainActivity.MSG);

//        Set text inside to message
//        TextView textView1=findViewById(R.id.textView4);
//        textView1.setText(message);

//        exitbtn2=(Button) findViewById(R.id.exitbtn2);
//        exitbtn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                moveTaskToBack(true);
//                android.os.Process.killProcess(android.os.Process.myPid());
//                System.exit(1);
//            }
//        });

    }

    public void notespage(View view){
        Intent intent=new Intent(this,Notespage.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.exitbt) {
//            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//            builder.setMessage("Do You Want To Exit?");
//            builder.setCancelable(true);
//            builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    System.exit(1);
//                }
//            });
//
//            builder.setPositiveButton("NO", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    dialogInterface.cancel();
//                }
//            });
//            AlertDialog alertDialog = builder.create();
//            alertDialog.show();
//
//        }
//        return true;
//    }
    public void backbt(View view){
        Intent back=new Intent(this, MainActivity.class);
        startActivity(back);
    }

}