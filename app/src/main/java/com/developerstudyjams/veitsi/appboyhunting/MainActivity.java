package com.developerstudyjams.veitsi.appboyhunting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flip2);

    }

    public void order(View view) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.txtStatus);
        quantityTextView.setText("bfgfdgfdgdf");
    }
    public void nextView(View view){
        final ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        viewFlipper.showNext();
    }
}
