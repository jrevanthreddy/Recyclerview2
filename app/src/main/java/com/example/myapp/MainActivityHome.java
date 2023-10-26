package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.myapp.Adapter.MyCustonAdapter;
import com.example.myapp.model.Fashion;

import java.util.ArrayList;
import java.util.List;

public class MainActivityHome extends AppCompatActivity {

    List<Fashion> fashionList;
    MyCustonAdapter myCustonAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        recyclerView=findViewById(R.id.recyclerview);

        fashionList=new ArrayList<>();
        Fashion fashion=new Fashion("men",R.drawable.men);
        Fashion fashion1=new Fashion("Women",R.drawable.women);
        Fashion fashion2=new Fashion("Kids",R.drawable.kids);
        Fashion fashion3=new Fashion("Foot wear",R.drawable.footwear);
        Fashion fashion4=new Fashion("Beauty",R.drawable.beauty);
        Fashion fashion5=new Fashion("Sports & fitness",R.drawable.sportsandfitness);
        Fashion fashion6=new Fashion("Luxury Brands",R.drawable.luxurybrands);

        fashionList.add(fashion);
        fashionList.add(fashion1);
        fashionList.add(fashion2);
        fashionList.add(fashion3);
        fashionList.add(fashion4);
        fashionList.add(fashion5);
        fashionList.add(fashion6);

        myCustonAdapter=new MyCustonAdapter(fashionList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(myCustonAdapter);


    }
}