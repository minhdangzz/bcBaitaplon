package com.example.bcbaitaplon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Category.Category;
import Category.CategoryAdapter;
import demo.demo;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    private Button btn1;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeView();
            }
        });



        rcvCategory = findViewById(R.id.rcv_demo);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);


        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);



    }

    public void openHomeView(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<demo> listdemo = new ArrayList<>();
        listdemo.add(new demo(R.drawable.ts1, "book1"));
        listdemo.add(new demo(R.drawable.ts1, "book1"));
        listdemo.add(new demo(R.drawable.ts1, "book1"));
        listdemo.add(new demo(R.drawable.ts1, "book1"));

        listdemo.add(new demo(R.drawable.ts1, "Chứng khoán hôm nay Chứng khoán hôm nay"));
        listdemo.add(new demo(R.drawable.ts1, "book2"));
        listdemo.add(new demo(R.drawable.ts1, "book3"));
        listdemo.add(new demo(R.drawable.ts1, "book4"));

        listCategory.add(new Category("THỜI SỰ", listdemo));
        listCategory.add(new Category("THỂ THAO", listdemo));
        listCategory.add(new Category("Category 1", listdemo));
        listCategory.add(new Category("Category 1", listdemo));

        return listCategory;
    }

}







