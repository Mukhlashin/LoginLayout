package com.example.loginlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void login1(View view) {
        startActivity(new Intent(homeactivity.this, layout1.class));
    }

    public void login2(View view) {
        startActivity(new Intent(homeactivity.this, layout2.class));
    }
}
