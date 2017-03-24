package com.lsw.demo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lsw.demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fileButton = (Button)findViewById(R.id.file_storage);
        fileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,FileStorageActivity.class);
                startActivity(intent);
            }
        });


        Button SPButton = (Button)findViewById(R.id.sp_button);
        SPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SharedPreferencesActivity.class);
                startActivity(intent);
            }
        });


        Button dataBaseButton = (Button)findViewById(R.id.database_button);
        dataBaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,DataBaseActivity.class);
                startActivity(intent);
            }
        });

        Button LitePalButton = (Button)findViewById(R.id.LitePal_button);
        LitePalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,LitePalActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
