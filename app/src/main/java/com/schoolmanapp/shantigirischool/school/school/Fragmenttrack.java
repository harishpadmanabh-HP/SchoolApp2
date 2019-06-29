package com.schoolmanapp.shantigirischool.school.school;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.schoolmanapp.shantigirischool.school.R;

import butterknife.ButterKnife;

/**
 * Created by srishtiinnovative on 02/06/17.
 */

public class Fragmenttrack extends android.app.Fragment {

    View view;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.trackbus, container, false);
        ButterKnife.bind(this,view);

        return view;
    }
}