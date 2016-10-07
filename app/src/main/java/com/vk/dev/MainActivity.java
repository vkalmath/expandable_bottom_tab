package com.vk.dev;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kalmath_v on 10/6/16.
 */

public class MainActivity extends AppCompatActivity {

    Button button_3;
    Button button_5;
    Button button_7;
    Button button_20;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button_3 = (Button) findViewById(R.id.button_3);
        button_5 = (Button) findViewById(R.id.button_5);
        button_7 = (Button) findViewById(R.id.button_7);
        button_20 = (Button) findViewById(R.id.button_20);

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabThreeActivity.class);
                startActivity(intent);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabFiveActivity.class);
                startActivity(intent);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabSevenActivity.class);
                startActivity(intent);
            }
        });

        button_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabTwentyActivity.class);
                startActivity(intent);
            }
        });
    }
}
