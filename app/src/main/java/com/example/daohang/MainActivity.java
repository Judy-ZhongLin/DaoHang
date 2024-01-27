package com.example.daohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton ib1,ib2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
    }
    public void init(){
        ib1 = (ImageButton) findViewById(R.id.daohang);
        ib2 = (ImageButton) findViewById(R.id.jingdiantuijian);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.daohang:
                startActivity(new Intent(this,selectDidian.class));
                break;
            case R.id.jingdiantuijian:
                startActivity(new Intent(this,Tourist.class));
        }
    }
}