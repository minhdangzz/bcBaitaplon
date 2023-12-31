package com.example.bcbaitaplon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import demo.bxh;
import demo.bxhAdapter;

public class home extends AppCompatActivity {

    private RecyclerView rcvBXH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rcvBXH = findViewById(R.id.rcv_bxh);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvBXH.setLayoutManager(linearLayoutManager);

        bxhAdapter adapter = new bxhAdapter(getListbxh());
        rcvBXH.setAdapter(adapter);
    }

    private List<bxh> getListbxh(){
        List<bxh> list = new ArrayList<>();
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        return list;
    }
}