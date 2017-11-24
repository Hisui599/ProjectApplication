package com.segproject.niflheimr.projectapplication;

/**
 * Created by Niflheimr on 2017-11-24.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tab1People extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1People, container, false);

        return rootView;
    }

}
