package com.pandey.patternsapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pandey.patternsapp.R;
import com.pandey.patternsapp.model.MyModel;

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

    public MyModel getAppFromModel(){

        return new MyModel("Pattern App",400,5);
    }

    public void displayText(View view) {
        textView.setText(getAppFromModel().getAppName()+"Downloads"+getAppFromModel().getAppDownloads()+"Ratings"+getAppFromModel().getAppRating() );
    }
}