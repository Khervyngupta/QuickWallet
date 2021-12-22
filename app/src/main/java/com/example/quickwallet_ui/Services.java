package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Services extends AppCompatActivity {

    Button Feedback,Complaint,Report,helpl,settingB;
    private ImageView Back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Back_btn=(ImageView) findViewById(R.id.services_back_btn);
        Feedback=findViewById(R.id.feedbckBtn);
        Complaint=findViewById(R.id.Compl_btn);
        Report=findViewById(R.id.ReportBug);
        helpl=findViewById(R.id.helpLineBtn);
        settingB=findViewById(R.id.settings_btn);
        settingB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,"Coming Soon",Toast.LENGTH_SHORT).show();
            }
        });
        helpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,"Helpline number - 1800 1111 2432",Toast.LENGTH_SHORT).show();
            }
        });
        Report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReport();
            }
        });
        Complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompl();
            }
        });
        Feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeed();
            }
        });
        Back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashboard();
            }
        });
    }
    public void openDashboard(){
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
        finish();
    }
    public void openFeed(){
        Intent intent = new Intent(this,FeedBack.class);
        startActivity(intent);
        finish();
    }
    public void openCompl(){
        Intent intent = new Intent(this,Complaint.class);
        startActivity(intent);
        finish();
    }
    public void openReport(){
        Intent intent = new Intent(this,ReportBug.class);
        startActivity(intent);
        finish();
    }
}