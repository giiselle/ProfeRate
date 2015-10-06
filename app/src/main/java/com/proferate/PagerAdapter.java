package com.proferate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Emmanuel on 10/1/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ProfesoresFragmento tab1 = new ProfesoresFragmento();
                return tab1;
            case 1:
                DepartamentosFragment tab2 = new DepartamentosFragment();
                return tab2;
            case 2:
                CursosFragment tab3 = new CursosFragment();
                return tab3;
            default:
                FragmentTest test = new FragmentTest();
                return test;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}