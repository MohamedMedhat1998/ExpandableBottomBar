package com.andalus.abomed7at55.expandablebottombartest;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * This class represents the fragment that plays the role of the expandable navigation bar.
 * The fragment pops up from the bottom of the screen when a toggle button -set in the target activity-
 * is pressed.
 */
public class BottomSheetFragment extends BottomSheetDialogFragment{

    /**
     * Default Constructor
     */
    public BottomSheetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Referring to the fragment layout
        View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        //Control buttons
        Button btnClose = view.findViewById(R.id.btn_close);
        Button btnSettings = view.findViewById(R.id.btn_settings);
        Button btnPower = view.findViewById(R.id.btn_power);
        //A view pager object to hold the fragment pages that contain the items
        ViewPager viewPager = view.findViewById(R.id.view_pager);
        //Creating and setting an adapter for the view pager
        CustomFragmentPagerAdapter customFragmentPagerAdapter =
                new CustomFragmentPagerAdapter(getChildFragmentManager());/*ChildFragmentManager is used because we will use a nested Fragment*/
        viewPager.setAdapter(customFragmentPagerAdapter);
        //An indicator for the view pager
        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        //Make the tab layout follow the view pager
        tabLayout.setupWithViewPager(viewPager, true);
        //Click events
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Close the fragment (bar)
                onDestroyView();
            }
        });
        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                power();
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settings();
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    /**
     * This method should move the user to the Settings , please implement it and edit this documentation
     */
    private void settings() {
        //TODO Implement this method
    }

    /**
     * This method should handle power , please implement it and edit this documentation
     */
    private void power() {
        //TODO Implement this method
    }

}
