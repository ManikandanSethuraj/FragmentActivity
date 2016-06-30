package com.manikandansethuraj.fragmentactivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements ColourFragment.onClickItemChanged {

    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout)findViewById(R.id.relative_layout);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ColourFragment colourFragment = new ColourFragment();
        fragmentTransaction.add(R.id.fragment_container,colourFragment);
        fragmentTransaction.commit();


    }

    @Override
    public void onClickChange(String onCheck) {

        if (onCheck.equals("RED")){
            relativeLayout.setBackgroundColor(Color.RED);
        }
        if (onCheck.equals("BLUE")){
            relativeLayout.setBackgroundColor(Color.BLUE);
        }
        if (onCheck.equals("GREEN")){
            relativeLayout.setBackgroundColor(Color.GREEN);
        }


    }
}
