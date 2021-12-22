package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Complaint extends AppCompatActivity {

    Button CSubmit;
    EditText CompText;
    ImageView Bak;
    DBHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        CSubmit=findViewById(R.id.Compsubmit_btn);
        CompText=findViewById(R.id.CompTxt);
        Bak=findViewById(R.id.comp_backbtn);
        myDB=new DBHelper(this);

        CSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String compl=CompText.getText().toString().trim();
                if(TextUtils.isEmpty(compl)){
                    Toast.makeText(Complaint.this,"Please Enter Something.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Complaint.this,"Complaint Registered Successfully.",Toast.LENGTH_SHORT).show();
                    backB();
                }
            }
        });
        Bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backB();
            }
        });
    }
    public void backB(){
        Intent intent = new Intent(this,Services.class);
        startActivity(intent);
        finish();
    }
}