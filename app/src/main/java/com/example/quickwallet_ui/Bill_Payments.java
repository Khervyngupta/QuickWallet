package com.example.quickwallet_ui;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Bill_Payments extends AppCompatActivity {
    Button EBill,WBill,GBill,CCBill;

    private ImageView Back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill__payments);

        Back_btn=(ImageView) findViewById(R.id.billpay_back_btn);
        EBill=findViewById(R.id.Ebill);
        WBill=findViewById(R.id.Wbill);
        GBill=findViewById(R.id.Gbill);
        CCBill=findViewById(R.id.Cbill);

        EBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comingSoon();
            }
        });
        WBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comingSoon();
            }
        });
        GBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comingSoon();
            }
        });
        CCBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comingSoon();
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
    public void comingSoon(){
        Toast.makeText(Bill_Payments.this,"COMING SOON",Toast.LENGTH_SHORT).show();
    }
}