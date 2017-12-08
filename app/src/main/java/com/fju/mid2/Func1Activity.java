package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }

    private ImageView dice;
    private int images[] = {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    public void roll(View view){
        int num = (int) (Math.random() * 6 + 1);
        Log.d("Func1Activity","random" + num);
//        new AlertDialog.Builder(this)
//                .setMessage("It's " + num)
//                .setNegativeButton("CLOSE", null)
//                .show();
        dice = (ImageView) findViewById(R.id.dice);
        dice.setImageResource(images[num - 1]);

    }

}
