package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1 = (Button)findViewById(R.id.btnRed);
        final Button b2 = (Button)findViewById(R.id.btnBlue);
        final Button b3 = (Button)findViewById(R.id.btnYellow);
        final Button b4 = (Button)findViewById(R.id.btnGreen);
        final Button b5 = (Button)findViewById(R.id.btnOrange);
        final Button b6 = (Button)findViewById(R.id.btnPink);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setMyScreenColor(Color.RED);
            }


        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setMyScreenColor(Color.BLUE);
            }


        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setMyScreenColor(Color.YELLOW);
            }


        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setMyScreenColor(0xFF228B22);
            }


        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setMyScreenColor(0xFFFF5733);
            }


        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setMyScreenColor(0xFFEF1A81);
            }


        });

    }

    public void setMyScreenColor(int color) {
        View view=this.getWindow().getDecorView();
        view.setBackgroundColor(color);



    }
}