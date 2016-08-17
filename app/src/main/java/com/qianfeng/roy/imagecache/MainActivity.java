package com.qianfeng.roy.imagecache;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        String abc ="http://192.168.0.99:8080/androidoo/q3.jpg";
//        String a = "abc811";
//        String b ="abc812";
//        Log.e("print", StringUtils.getMD5Str32byte(abc));

        //你好
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.lv);
        List<String> data = new ArrayList<>();
        for (int i = 0; i <40 ; i++) {
            data.add(i+">>>");
        }
        MyAdapter adapter = new MyAdapter(this,data);
        lv.setAdapter(adapter);
    }
}
