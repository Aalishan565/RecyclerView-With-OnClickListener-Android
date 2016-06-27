package com.recyclerviewwithonclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRvNames;
    private String[] names;
    CustomAdapter mCustomAdapter;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        names = new String[]{"Aalishan", "Ankur", "Aakash", "Aman", "Nigam"};
        setContentView(R.layout.activity_main);
        mRvNames = (RecyclerView) findViewById(R.id.rv_names);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRvNames.setLayoutManager(linearLayoutManager);
        mCustomAdapter = new CustomAdapter(this, names);
        mRvNames.setAdapter(mCustomAdapter);

    }
}
