package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationuiux.MyAdapter;
import com.example.myapplicationuiux.MyList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyList> myLists;
    RecyclerView rv;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rec);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new GridLayoutManager(this, 2));

        myLists = new ArrayList<>();
        getData();

        adapter = new MyAdapter(myLists, this);
        rv.setAdapter(adapter);
    }

    private void getData() {
        // Menambahkan item ke dalam daftar
        myLists.add(new MyList(R.drawable.work));
        myLists.add(new MyList(R.drawable.education));
        myLists.add(new MyList(R.drawable.settings));
        myLists.add(new MyList(R.drawable.startup));
        myLists.add(new MyList(R.drawable.profile));
        myLists.add(new MyList(R.drawable.info));
        myLists.add(new MyList(R.drawable.calendar));
        myLists.add(new MyList(R.drawable.notes));
    }
}
