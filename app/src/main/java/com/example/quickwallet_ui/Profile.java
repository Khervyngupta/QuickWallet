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

public class Profile extends AppCompatActivity {

    private ImageView Back_btn;
    Button confirm;
    EditText Name,Number,Dob,Email,CPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Back_btn=(ImageView) findViewById(R.id.back_btn);
        confirm=(Button)findViewById(R.id.confirm_btn);
        Name=findViewById(R.id.editTextTextPersonName);
        Number=findViewById(R.id.editTextTextPersonName4);
        Dob=findViewById(R.id.editTextDate);
        Email=findViewById(R.id.editTextTextEmailAddress);
        CPass=findViewById(R.id.editTextTextPassword);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name1=Name.getText().toString().trim();
                String Number1=Number.getText().toString().trim();
                String Dob1=Dob.getText().toString().trim();
                String Email1=Email.getText().toString().trim();
                String CPass1=CPass.getText().toString().trim();

                if(TextUtils.isEmpty(Name1) || TextUtils.isEmpty(Number1) || TextUtils.isEmpty(Dob1) || TextUtils.isEmpty(Email1) || TextUtils.isEmpty(CPass1)){
                    Toast.makeText(Profile.this,"Please enter all the details to complete Profile.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Profile.this,"Profile updated successfully",Toast.LENGTH_SHORT).show();
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