package com.example.newwindowsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignando clic action al boton
        button=(Button) findViewById(R.id.button);

button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Abriendo Main2Activity
        Intent intentLogin = new Intent(this, Main2Activity.class);
        startActivity(intentLogin);
    }
}
