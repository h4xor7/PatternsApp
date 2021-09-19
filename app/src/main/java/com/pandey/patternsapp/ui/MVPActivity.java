package com.pandey.patternsapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pandey.patternsapp.R;

//model = My model class

//Presenter = AppPresenter

//View = MVP Activity


public class MVPActivity extends AppCompatActivity  implements AppView{

    AppPresenter appPresenter;
    Button button;
    TextView mvpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpactivity);

        appPresenter = new AppPresenter(this);
        button = findViewById(R.id.button2);
        mvpText = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appPresenter.getAppName();
            }
        });
    }

    @Override
    public void onGetAppName(String appName) {
        mvpText.setText(appName);

    }
}