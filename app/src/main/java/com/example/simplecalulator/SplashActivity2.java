package com.example.simplecalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);


        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(SplashActivity2.this, MainActivity.class);
                    startActivity(intent);
                    finish(); //have to finish the thread or else when the user presses the back btn
                }               //the thread will start again
            }
        }; thread.start();
    }
}

