package com.developerstudyjams.veitsi.appboyhunting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void order(View view) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.txtStatus);
        quantityTextView.setText("bfgfdgfdgdf");
    }
}
