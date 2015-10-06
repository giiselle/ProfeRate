package com.proferate;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

/**
 * Created by Emmanuel on 10/1/2015.
 */
public class ProfesoresFragmento extends ListFragment {
    String nombresProfesores[] = {"E. Latorre", "E. Valenzuela"};
    int layout = android.R.layout.simple_list_item_1;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, nombresProfesores));
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
//        return inflater.inflate(R.layout.profesores, viewGroup, false);
//    }

    public void onListSelected(int position){

    }
}
