package com.example.helloword25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 1 : Khai báo biến
    Button mBtnSHowAlert;
    TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 : ánh xạ
        mBtnSHowAlert = findViewById(R.id.buttonShow);
        mTvTitle = findViewById(R.id.textviewTitle);

        //3 : chạy code
        // in ra tren may ao thong bao
        //Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
        //int a = 5;
//        a++;
//        Log.d("BBB",String.valueOf(a));
        // ctrl + P : gợi ý tham số truyền vào
        mBtnSHowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();

            }
        });



    }
}
