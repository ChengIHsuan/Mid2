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
            }
        }
    }

    public void b1(View view){
        Intent intent1 = new Intent(this, Func1Activity.class);
        startActivityForResult(intent1, FUNC);
    }
    public void b2(View view){
        Intent intent2 = new Intent(this, Func2Activity.class);
        startActivityForResult(intent2, FUNC);
    }
    public void b3(View view){
        Intent intent3 = new Intent(this, Func3Activity.class);
        startActivityForResult(intent3, FUNC);
        setResult(RESULT_OK, getIntent());
    }
    public void b4(View view){
        Intent intent4 = new Intent(this, Func4Activity.class);
        startActivityForResult(intent4, FUNC);
    }
    public void b5(View view){
        Intent intent5 = new Intent(this, Func5Activity.class);
        startActivityForResult(intent5, FUNC);
    }
    public void b6(View view){
        Intent intent6 = new Intent(this, Func6Activity.class);
        startActivityForResult(intent6, FUNC);
    }
    public void b7(View view){
        Intent intent7 = new Intent(this, Func7Activity.class);
        startActivityForResult(intent7, FUNC);
    }
    public void b8(View view){
        Intent intent8 = new Intent(this, Func8Activity.class);
        startActivityForResult(intent8, FUNC);
    }

}
