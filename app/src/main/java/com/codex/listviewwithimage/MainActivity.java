package com.codex.listviewwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ModelAdapter modelAdapter;
    List<Model> modelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list_View_with_image);
        testData();
        modelAdapter=new ModelAdapter(this,modelList);
        listView.setAdapter(modelAdapter);


    }
    public void testData(){
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));
        modelList.add(new Model("Doctor Strange","medicine","12/12/12",R.drawable.pic));


    }
}