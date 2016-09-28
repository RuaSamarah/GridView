package com.example.ruaasamara.gridview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridView;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridView gridView = new GridView(this);
        gridView.setVerticalSpacing(2);
        gridView.setHorizontalSpacing(2);
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        gridView.setNumColumns(3);
        gridView.setGravity(Gravity.CENTER);
        gridView.setBackgroundColor(Color.BLACK);
        gridView.setLayoutParams(new GridView.LayoutParams(GridLayout.LayoutParams.MATCH_PARENT,GridLayout.LayoutParams.MATCH_PARENT));
        gridView.setAdapter(new ImageAdapter(this));

        setContentView(gridView);


    }
}
