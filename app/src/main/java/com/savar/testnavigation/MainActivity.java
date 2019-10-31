package com.savar.testnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button btnOpen = findViewById(R.id.btnOpen);

            RecyclerView recycler = findViewById(R.id.recycler);
            RecyclerAdapter adapter = new RecyclerAdapter();
            recycler.setAdapter(adapter);
            recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false));
    }
}
