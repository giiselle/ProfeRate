package com.proferate;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Emmanuel on 10/1/2015.
 */
public class CursosFragment extends ListFragment {
    String nombresCursos[] = {"CCOM 4401", "CCOM 3041"};
    int layout = android.R.layout.simple_list_item_1;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, nombresCursos));
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.cursos, container, false);
//    }
}