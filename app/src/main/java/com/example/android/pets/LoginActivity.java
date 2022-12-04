package com.example.android.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name,pass;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {

        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.pass);

        s1 = name.getText().toString().trim();
        s2 = pass.getText().toString().trim();

        if(s1.equals("") || s2.equals("")){
            Toast.makeText(this, "Enter details", Toast.LENGTH_SHORT).show();
        }
        else if(s1.equals("Ghalib") && s2.equals("password")) {
            Intent i = new Intent(LoginActivity.this, CatalogActivity.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Wrong username or password", Toast.LENGTH_SHORT).show();
        }
    }
}