package com.example.daohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class achieve extends AppCompatActivity implements View.OnClickListener{
    private Button achieve_b1;
    private ImageButton achieve_ib1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achieve);
        init();
        achieve_b1.setOnClickListener(this);
        achieve_ib1.setOnClickListener(this);
    }

    public void init(){
        achieve_b1 = (Button) findViewById(R.id.achieve_b1);
        achieve_ib1 = (ImageButton) findViewById(R.id.achieve_ib1);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.achieve_b1:
                startActivity(new Intent(this, idea.class));
                break;
            case R.id.achieve_ib1:
                startActivity(new Intent(this, Tourist.class));
                break;
        }

    }
}