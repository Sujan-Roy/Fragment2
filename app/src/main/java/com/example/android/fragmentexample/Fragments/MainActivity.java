package com.example.android.fragmentexample.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.fragmentexample.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
      Button fragment1,fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1= (Button) findViewById(R.id.btn1);
        fragment2= (Button) findViewById(R.id.btn2);

        fragment1.setOnClickListener(this);
        fragment2.setOnClickListener(this);

        Fragment fragment=new Main_Fragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragmenrcontainer,fragment);
        ft.commit();
    }

    @Override
    public void onClick(View view) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.btn1:
                ft.replace(R.id.fragmenrcontainer,new Main_Fragment()).commit();

                break;
            case R.id.btn2:
                ft.replace(R.id.fragmenrcontainer,new Second_fragment()).commit();

        }

    }
}
