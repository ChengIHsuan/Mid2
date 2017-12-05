package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int FUNC = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNC){
            if (resultCode == RESULT_OK){
                Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
            }else{
                finish();
            }
        }
    }

    public void b1(View view){
        Intent intent1 = new Intent(this, Func1Activity.class);
        startActivity(intent1);
    }
    public void b2(View view){
        Intent intent2 = new Intent(this, Func2Activity.class);
        startActivity(intent2);
    }
    public void b3(View view){
        Intent intent3 = new Intent(this, Func3Activity.class);
        startActivity(intent3);
    }
    public void b4(View view){
        Intent intent4 = new Intent(this, Func4Activity.class);
        startActivity(intent4);
    }
    public void b5(View view){
        Intent intent5 = new Intent(this, Func5Activity.class);
        startActivity(intent5);
    }
    public void b6(View view){
        Intent intent6 = new Intent(this, Func6Activity.class);
        startActivity(intent6);
    }
    public void b7(View view){
        Intent intent7 = new Intent(this, Func7Activity.class);
        startActivity(intent7);
    }
    public void b8(View view){
        Intent intent8 = new Intent(this, Func8Activity.class);
        startActivity(intent8);
    }

}
