package com.proferate;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Emmanuel on 10/1/2015.
 */
public class DepartamentosFragment extends ListFragment {
    String nombresDepartamentos[] = {"ADEM", "BIOL", "CCOM", "CISO", "COMU", "EDFU", "ENFE", "ESPA",
                                        "TEQU", "HUMA", "INGL", "MATE", "SOFI"};

    int layout = android.R.layout.simple_list_item_1;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, nombresDepartamentos));
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id){
        if(position == 2){
            Snackbar.make(view,"El mejor dept!", Snackbar.LENGTH_LONG).show();
        }
        else
            Snackbar.make(view, "hola", Snackbar.LENGTH_SHORT).show();
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
//        return inflater.inflate(R.layout.departamentos, viewGroup, false);
//    }
}
