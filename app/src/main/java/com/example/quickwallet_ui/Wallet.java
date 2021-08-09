package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Wallet extends AppCompatActivity implements View.OnClickListener {

    String amount;
     TextView tv;
     Button pay;
     ImageView back_btn;
     EditText edt;
     int amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        pay=findViewById(R.id.pay_btn);
        tv=findViewById(R.id.tv_amount);
        edt=findViewById(R.id.edt_amount);
        back_btn=(ImageView)findViewById(R.id.wallet_back_btn);
        pay.setOnClickListener(this);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashboard();
            }
        });

    }

    @Override
    public void onClick(View v) {
        amount = edt.getText().toString();
        if(amount.equals("")){
            Toast.makeText(this,"Please enter some amount",Toast.LENGTH_SHORT).show();
        }else {
            addMoney(amount);
        }
    }

    public void openDashboard(){
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
    public void addMoney(String amount){
            amt = Integer.parseInt(amount);
            tv.setText(amount);
            Toast.makeText(this, "Money added Successfully", Toast.LENGTH_SHORT).show();
    }
}