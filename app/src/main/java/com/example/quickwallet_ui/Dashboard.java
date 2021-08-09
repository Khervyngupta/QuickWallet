package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    private Button Walletbtn,MoneyTrf,Profile,BillPay,Services,Recharge;
    ImageView logout;
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
    }

    public void openLogin(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openMoneyTrf(){
        Intent intent=new Intent(this,Money_Transfer.class);
        startActivity(intent);
    }

    public void openWallet(){
        Intent intent = new Intent(this,Wallet.class);
        startActivity(intent);
    }
    public void openBillpay(){
        Intent intent=new Intent(this,Bill_Payments.class);
        startActivity(intent);
    }
    public void openRecharge(){
        Intent intent=new Intent(this,Recharge.class);
        startActivity(intent);

    }

    public void openProfile(){

        Intent intent=new Intent(this,Profile.class);
        startActivity(intent);
    }
}