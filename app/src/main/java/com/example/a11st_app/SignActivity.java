package com.example.a11st_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SignActivity extends AppCompatActivity {

    EditText unames;
    EditText spw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        Button ok_Button = (Button) findViewById(R.id.ok_Button);
        ok_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View V) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        unames = (EditText) findViewById(R.id.unames);
        spw = (EditText) findViewById(R.id.spw);


    }

}


