package com.proferate;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Emmanuel on 10/1/2015.
 */
public class FragmentTest extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        return inflater.inflate(R.layout.test, viewGroup, false);
    }

}
