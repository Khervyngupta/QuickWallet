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

public class ReportBug extends AppCompatActivity {

    EditText reportTxt;
    Button RSubmit;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_bug);
        reportTxt=findViewById(R.id.ReportTxt);
        RSubmit=findViewById(R.id.Reportsubmit_btn);
        back=findViewById(R.id.repo_backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backB();
            }
        });
        RSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String compl=reportTxt.getText().toString().trim();
                if(TextUtils.isEmpty(compl)){
                    Toast.makeText(ReportBug.this,"Please Enter Something.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(ReportBug.this,"Thank You for your feedback.",Toast.LENGTH_SHORT).show();
                    backB();
                }
            }
        });
    }
    public void backB(){
        Intent intent = new Intent(this,Services.class);
        startActivity(intent);
        finish();
    }
}