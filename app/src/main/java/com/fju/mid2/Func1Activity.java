package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }

    public void roll(View view){
        int num = (int) (Math.random() * 6 + 1);
        Log.d("MainActivity","random" + num);
        new AlertDialog.Builder(this)
                .setMessage(num)
                .setNegativeButton("CLOSE", null)
                .show();
    }

}
