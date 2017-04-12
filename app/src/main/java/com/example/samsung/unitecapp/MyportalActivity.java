package com.example.samsung.unitecapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MyportalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myportal);
    }

    public void button_login(View aView){
        TextView t_email = (TextView)findViewById(R.id.portal_email);
        String strEmail = t_email.getText().toString();
        TextView t_password = (TextView)findViewById(R.id.portal_password);
        String strPassword = t_password.getText().toString();

        if((strEmail.equals(""))||(strPassword.equals(("")))){
            AlertDialog.Builder log_message = new AlertDialog.Builder(MyportalActivity.this);
            log_message.setMessage("Please enter your details!");
            log_message.setTitle("Warning");
            log_message.create().show();
        }
        else{
            TextView textView =  (TextView)findViewById(R.id.logsuccessfully);
            textView.setText("Login successfuly!");
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }

    public void homePage(View aView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
