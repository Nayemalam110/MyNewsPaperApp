package com.example.mynewspaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.button1);
        bt1.setOnClickListener(this);
        bt2 = findViewById(R.id.button2);
        bt2.setOnClickListener(this);
        bt3 = findViewById(R.id.button3);
        bt3.setOnClickListener(this);
        bt4 = findViewById(R.id.button4);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button1)
        {
            //Toast.makeText(getApplicationContext(),"Hospital Button is clicked",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            intent.putExtra("link","https://www.prothomalo.com/");
            startActivity(intent);

        }
        else if(view.getId()==R.id.button2)
        {
            //Toast.makeText(getApplicationContext(),"Hospital Button is clicked",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            intent.putExtra("link","https://www.kalerkantho.com/");
            startActivity(intent);

        }
        else if(view.getId()==R.id.button3)
        {
            //Toast.makeText(getApplicationContext(),"Hospital Button is clicked",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            intent.putExtra("link","https://www.jugantor.com/");
            startActivity(intent);

        }
        else if(view.getId()==R.id.button4)
        {
            //Toast.makeText(getApplicationContext(),"Hospital Button is clicked",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            intent.putExtra("link","https://www.dailynayadiganta.com/");
            startActivity(intent);

        }
    }
}