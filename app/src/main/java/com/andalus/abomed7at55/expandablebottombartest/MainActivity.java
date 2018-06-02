package com.andalus.abomed7at55.expandablebottombartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Toggle Button to open the bar
    private Button btnOpenMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding the toggle button
        btnOpenMenu = findViewById(R.id.btn_open_menu);
        //Handling click event to open the bar
        btnOpenMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheet();
            }
        });

    }

    /**
     * This method should be called whenever you want to open the bar
     */
    private void showBottomSheet(){
        //Bottom sheet fragment declaration
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        //Showing the fragment. This method requires two parameters
        //The first is the Fragment Manager which will handle the transaction and other actions
        //The second is a tag (name) associated with the target fragment
        bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());
    }

}
