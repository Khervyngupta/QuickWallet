package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
                if(num.equals("") || am.equals("") || pass.equals("")){
                    Toast.makeText(Money_Transfer.this,"Please Fill all the details.",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Money_Transfer.this, "Money Transfered Successfully.", Toast.LENGTH_SHORT).show();
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