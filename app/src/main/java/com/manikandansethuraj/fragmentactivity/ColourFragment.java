package com.manikandansethuraj.fragmentactivity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-06-28.
 */
public class ColourFragment extends Fragment {

    RadioGroup radioGroup;
    onClickItemChanged onClickedItemChanged;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_layout,container,false);

        radioGroup = (RadioGroup)view.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.blue_id:
                        onClickedItemChanged.onClickChange("BLUE");
                        break;
                    case R.id.green_id:
                        onClickedItemChanged.onClickChange("GREEN");
                        break;
                    case R.id.red_id:
                        onClickedItemChanged.onClickChange("RED");
                        break;

                }
            }
        });


        return view;



    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onClickedItemChanged = (onClickItemChanged)activity;
    }

    public  interface onClickItemChanged{

        public void onClickChange(String onCheck);

    }
}
