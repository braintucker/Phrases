package com.briantucker.phrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void buttonTapped(View view){

        int id = view.getId();
        String thisId = "";

        thisId = view.getResources().getResourceEntryName(id);

        Log.i("button tapped", thisId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
