package com.example.luisrodriguezmuoz_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView  tv;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tv=findViewById(R.id.textView);
        st=getIntent().getExtras().getString("Value");
        tv.setText("bienvenido " + st);
    }
}
