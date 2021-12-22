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

public class Recharge extends AppCompatActivity {

    private ImageView Back_btn;
    EditText amount,Mnum;
    private Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
        Back_btn=(ImageView) findViewById(R.id.recharge_back_btn);
        amount=findViewById(R.id.RAmu);
        Mnum=findViewById(R.id.RmNum);
        pay=(Button)findViewById(R.id.recharge_btn_pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Num=Mnum.getText().toString().trim();
                String Amount=amount.getText().toString().trim();
                int mob=Num.length();
                if(TextUtils.isEmpty(Num) || TextUtils.isEmpty(Amount)){
                    Toast.makeText(Recharge.this,"Please enter Mobile number and Amount both.",Toast.LENGTH_SHORT).show();
                }
                else if(Num.length()<=9){
                    Toast.makeText(Recharge.this,"Please Enter correct Mobile Number.",Toast.LENGTH_SHORT).show();
                }
                else{
                    int Amount1=Integer.parseInt(Amount);
                    MainActivity.total-=Amount1;
                    Toast.makeText(Recharge.this,"Recharge done",Toast.LENGTH_SHORT).show();
                }
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
}