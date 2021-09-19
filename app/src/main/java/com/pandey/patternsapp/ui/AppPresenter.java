package com.pandey.patternsapp.ui;

//this will act as a presenter

import com.pandey.patternsapp.model.MyModel;

import java.security.PublicKey;

/**
 * the link b/w presenter and view is  done by interface
 */
public class AppPresenter {
    AppView appview;

    public AppPresenter(AppView appView) {
        this.appview = appView;
    }


    //Linkage b/w Presenter and Model
    public MyModel getAppFromModel(){
        return  new MyModel("MVP App",76,4);
    }

    //Linkage b/w presenter and MVP Activity(using interface)

    public  void  getAppName(){
        appview.onGetAppName(getAppFromModel().getAppName());
    }


}
