package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText username,password;
    Button login;
    TextView register;
    DBHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.editTextTextPersonName);
        password=(EditText)findViewById(R.id.inputPassword);
        login=(Button)findViewById(R.id.login_btn);
        myDB= new DBHelper(this);

        register=findViewById(R.id.tv_register);


        login.setOnClickListener(this);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(user.equals("") || pass.equals("")){
                    Toast.makeText(MainActivity.this,"Please enter the credentials.",Toast.LENGTH_SHORT).show();
                }
                else {
                   Boolean result= myDB.checkusernamePassword(user,pass);
                   if(result==true){

                       openDashboard();
                   }
                   else{
                       Toast.makeText(MainActivity.this,"Invalid credentials",Toast.LENGTH_SHORT).show();
                   }
                }

            }
        });

        }
    public void openDashboard(){
        Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
    }
    public void openLogin(){
        Intent intent = new Intent(this, Registeration.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

    }
}