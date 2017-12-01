package com.segproject.niflheimr.projectapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Niflheimr on 2017-12-01.
 */

public class ResourcesFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.people_fragment, container, false);

        return rootView;
    }

}
