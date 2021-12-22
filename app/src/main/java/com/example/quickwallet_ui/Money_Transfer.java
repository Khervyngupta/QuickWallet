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

public class Money_Transfer extends AppCompatActivity {

    private ImageView Back_btn;
    EditText num,am,pass;
    Button transfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money__transfer);
        Back_btn=(ImageView) findViewById(R.id.Back_Button);
        transfer=(Button)findViewById(R.id.money_trf);
        num=(EditText)findViewById(R.id.mt_number);
        am=(EditText)findViewById(R.id.mt_amount);
        pass=(EditText)findViewById(R.id.mt_password);
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=num.getText().toString().trim();
                String am1=am.getText().toString().trim();
                String pass1=pass.getText().toString().trim();

                if(TextUtils.isEmpty(num1) || TextUtils.isEmpty(am1) || TextUtils.isEmpty(pass1)){
                    Toast.makeText(Money_Transfer.this,"Please Fill all the details.",Toast.LENGTH_SHORT).show();
                }
                else if(num1.length()<=9){
                    Toast.makeText(Money_Transfer.this,"Please Enter correct Mobile Number.",Toast.LENGTH_SHORT).show();
                }
                else{
                    int am2=Integer.parseInt(am1);
                    MainActivity.total-=am2;
                    Toast.makeText(Money_Transfer.this, "Money Transferred Successfully.", Toast.LENGTH_SHORT).show();
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
    }
}