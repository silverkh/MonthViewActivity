package com.example.monthviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private  GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        gridView = (GridView)findViewById(R.id.gridview2);

        String[] items = {"","","","","","1", "2", "3", "4", "5", "6", "7", "8","9","10","11",
                "12","13","14","15","16","17","18","19","20","21","22","23","24","25",
                "26","27","28","29","30",""};
        //어댑터 준비 (배열 객체 이용, simple_list_item_1 리소스 사용
        ArrayAdapter<String> adapt
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                items);
        // id를 바탕으로 화면 레이아웃에 정의된 GridView 객체 로딩
        GridView gridview = (GridView) findViewById(R.id.gridview2);
        // 어댑터를 GridView 객체에 연결
        gridview.setAdapter(adapt);

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);
                finish();
            }
        });

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(ThirdActivity.this,
                        "4월" + (position -4) + "일",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

}