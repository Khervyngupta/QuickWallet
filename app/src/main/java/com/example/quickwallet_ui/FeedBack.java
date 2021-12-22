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

public class FeedBack extends AppCompatActivity {

    Button submit;
    ImageView back;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        back=findViewById(R.id.feedback_backbtn);
        submit=findViewById(R.id.submit_btn);
        text=findViewById(R.id.feedTxt);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackD();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=text.getText().toString().trim();
                if(TextUtils.isEmpty(txt)){
                    Toast.makeText(FeedBack.this,"Please Enter Something.",Toast.LENGTH_SHORT).show();
                }
                else{
                    openService();
                }
            }
        });
    }
    public void openService(){
        Intent intent = new Intent(this,Services.class);
        startActivity(intent);
        Toast.makeText(FeedBack.this,"THANKS FOR GIVING FEEDBACK",Toast.LENGTH_SHORT).show();
        finish();
    }
    public void BackD(){
        Intent intent = new Intent(this,Services.class);
        startActivity(intent);
        finish();
    }
}