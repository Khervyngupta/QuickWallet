package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    private Button Walletbtn,MoneyTrf,Profile,BillPay,Services,Recharge;
    TextView dispName;
    ImageView logout;
    MainActivity mai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Walletbtn=(Button)findViewById(R.id.walletbtn);
        MoneyTrf=(Button)findViewById(R.id.moneytrf);
        Profile=(Button)findViewById(R.id.profile_btn);
        BillPay=(Button)findViewById(R.id.bill_pay_btn);
        Services=(Button)findViewById(R.id.services_btn);
        Recharge=(Button)findViewById(R.id.recharge_btn);
        logout=(ImageView)findViewById(R.id.dashboard_logout);
        dispName=findViewById(R.id.NameTV);
        String Nam1=MainActivity.UserNameS;
        String Nam2=Nam1.toUpperCase();
        dispName.setText(Nam2);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });

        Recharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecharge();
            }
        });

        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openServices();
            }
        });

        BillPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBillpay();
            }
        });

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        MoneyTrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoneyTrf();
            }
        });

        Walletbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWallet();
            }
        });
    }

    public void openServices(){
        Intent intent = new Intent(this,Services.class);
        startActivity(intent);
        finish();
    }

    public void openLogin(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(Dashboard.this,"LOGOUT SUCCESSFULLY",Toast.LENGTH_SHORT).show();
        finish();
    }

    public void openMoneyTrf(){
        Intent intent=new Intent(this,Money_Transfer.class);
        startActivity(intent);
        finish();
    }
    public void openWallet(){
        Intent intent = new Intent(this,Wallet.class);
        startActivity(intent);
        finish();
    }
    public void openBillpay(){
        Intent intent=new Intent(this,Bill_Payments.class);
        startActivity(intent);
        finish();
    }
    public void openRecharge(){
        Intent intent=new Intent(this,Recharge.class);
        startActivity(intent);
        finish();
    }

    public void openProfile(){
        Intent intent=new Intent(this,Profile.class);
        startActivity(intent);
        finish();
    }
//    public void disppName(String na){
//        dispName.setText(na);
//    }
}