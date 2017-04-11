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
        TextView tvEmail = (TextView)findViewById(R.id.portal_email);
        String strEmail = tvEmail.getText().toString();

        if((((TextView)findViewById(R.id.portal_email)).getText().toString().equals(""))||((TextView)findViewById(R.id.portal_password)).getText().toString().equals((""))){
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
}
