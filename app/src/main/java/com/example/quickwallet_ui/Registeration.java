package com.example.quickwallet_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registeration extends AppCompatActivity implements View.OnClickListener {


    DBHelper myDB;
    String msg;
    Button Register;
    EditText name,username,password,cpass,mobile;
    TextView tv_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        myDB=new DBHelper(this);
        Register=(Button)findViewById(R.id.register_btn);
        name=findViewById(R.id.editTextTextPersonName);
        username=(EditText)findViewById(R.id.inputPassword);
        password=(EditText)findViewById(R.id.new_password_register);
        cpass=(EditText)findViewById(R.id.confirm_password_register);
        mobile=findViewById(R.id.edtpwd_registeration);
        tv_login=(TextView)findViewById(R.id.tv_loginpage);
        tv_login.setOnClickListener(this);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });


        Register.setOnClickListener(this);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass= cpass.getText().toString();

                if(user.equals("") || pass.equals("") || repass.equals("") ){
                    Toast.makeText(Registeration.this,"Fill all the fields.",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(pass.equals(repass)){
                          Boolean usercheckResult = myDB.checkusername(user);
                          if(usercheckResult==false){
                             Boolean regResult =  myDB.insertData(user,pass);
                             if(regResult == true){
                                 Toast.makeText(Registeration.this,"Registeration Successful.",Toast.LENGTH_SHORT).show();
                                 back();
                             }
                             else {
                                 Toast.makeText(Registeration.this,"Registeration Failed.",Toast.LENGTH_SHORT).show();
                             }
                          }
                          else {
                              Toast.makeText(Registeration.this,"User already Exists. \n Please Sign In",Toast.LENGTH_SHORT).show();
                          }
                    }
                    else {
                        Toast.makeText(Registeration.this,"Password not matching.",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


    @Override
    public void onClick(View v) {

    }
    public void back(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}