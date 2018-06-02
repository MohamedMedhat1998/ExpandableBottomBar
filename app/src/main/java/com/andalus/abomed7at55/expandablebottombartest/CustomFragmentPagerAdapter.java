package com.andalus.abomed7at55.expandablebottombartest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * This class is an adapter for the view pager in {@link BottomSheetFragment}.
 * It provides it with the pages to be viewed.
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    //The number of pages
    private static final int COUNT = 2;

    /**
     * Constructor for the adapter
     * @param fm this parameter is the fragment manager that is responsible for showing the fragment
     *           and other actions related to it
     */
    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    //TODO add more pages by creating more fragments and put them in this switch-case and increase the COUNT

    /**
     * This method is responsible for binding pages to the view pager.
     * @param position the position in which we want to put the page in.
     * @return a fragment object to be placed in that page.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Page1Fragment();
            case 1:
                return new Page2Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
