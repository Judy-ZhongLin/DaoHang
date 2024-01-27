package com.example.daohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class idea extends AppCompatActivity implements View.OnClickListener{
    private Button idea_b1,idea_b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea);
        init();
        idea_b1.setOnClickListener(this);
        idea_b2.setOnClickListener(this);
    }

    public void init(){
        idea_b1 = (Button) findViewById(R.id.idea_b1);
        idea_b2 = (Button) findViewById(R.id.idea_b2);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.idea_b1:
                startActivity(new Intent(this,outcome.class));
                break;
            case R.id.idea_b2:
                startActivity(new Intent(this,outcome.class));
                break;
        }
    }
}