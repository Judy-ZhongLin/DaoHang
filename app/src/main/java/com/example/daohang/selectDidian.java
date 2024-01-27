package com.example.daohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class selectDidian extends AppCompatActivity implements View.OnClickListener{
    private EditText select_et1,select_et2;
    private Button select_b1;
    private ImageButton select_ib1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_didian);
        init();
        select_b1.setOnClickListener(this);
        select_ib1.setOnClickListener(this);
    }

    public void init(){
        select_et1 = (EditText) findViewById(R.id.select_et1);
        select_et2 = (EditText) findViewById(R.id.select_et2);
        select_b1 = (Button)findViewById(R.id.select_b1);
        select_ib1 = (ImageButton)findViewById(R.id.select_ib1);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.select_b1:
                startActivity(new Intent(this,achieve.class));
                break;
            case R.id.select_ib1:
                startActivity(new Intent(this,Tourist.class));
                break;
        }

    }
}