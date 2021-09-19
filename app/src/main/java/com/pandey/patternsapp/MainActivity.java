package com.pandey.patternsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;
/**
 * Model is MyModel
 * View is our xml
 * Activity is our controller*/

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        textView= findViewById(R.id.textView);


    }

    public  MyModel getAppFromModel(){

        return new MyModel("Pattern App",400,5);
    }

    public void displayText(View view) {
        textView.setText(getAppFromModel().appName+"Downloads"+getAppFromModel().appDownloads+"Ratings"+getAppFromModel().appRating );
    }
}