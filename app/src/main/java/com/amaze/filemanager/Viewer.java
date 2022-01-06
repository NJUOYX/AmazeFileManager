package com.amaze.filemanager;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Viewer extends Activity {
    int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.format("%d",cnt));
        Button button = (Button) findViewById(R.id.button);
        button.setText("Add");

    }

    public void click(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.format("%d",++cnt));
    }
}