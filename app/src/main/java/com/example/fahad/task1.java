package com.example.fahad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class task1 extends AppCompatActivity {
    private TextView txcreate,txresume,txstop,txrestart;
    static int stop,create,resume,restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        create++;

        txcreate = findViewById(R.id.tvcreate);
        txrestart = findViewById(R.id.tvrestart);
        txresume = findViewById(R.id.tvresume);
        txstop = findViewById(R.id.tvstop);

        txcreate.setText(create);
    }
        @Override
        protected void onStop() {
            super.onStop();
            stop++;
            txstop.setText(stop);
        }

        @Override
        protected void onResume() {
            super.onResume();
            resume++;
            txresume.setText(resume);
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            restart++;
            txrestart.setText(restart);
        }


    }
