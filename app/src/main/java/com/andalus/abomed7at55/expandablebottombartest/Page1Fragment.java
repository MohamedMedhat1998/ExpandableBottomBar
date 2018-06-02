package com.andalus.abomed7at55.expandablebottombartest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * This class represents one page in the view pager used in {@link BottomSheetFragment}
 */
public class Page1Fragment extends Fragment implements View.OnClickListener {
    //ImageViews represent the items in the page
    private ImageView ivNight;
    private ImageView ivNoImage;
    private ImageView ivDownloadFile;
    private ImageView ivBookmark;
    private ImageView ivBookmarkHistory;
    private ImageView ivSavePage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Referring to the fragment layout
        View view = inflater.inflate(R.layout.fragment_page1, container, false);
        //Binding Views
        ivNight = view.findViewById(R.id.iv_night_time);
        ivNoImage = view.findViewById(R.id.iv_no_image);
        ivDownloadFile = view.findViewById(R.id.iv_download);
        ivBookmark = view.findViewById(R.id.iv_bookmark);
        ivBookmarkHistory = view.findViewById(R.id.iv_bookmark_history);
        ivSavePage = view.findViewById(R.id.iv_save_page);
        //setting click listeners
        ivNight.setOnClickListener(this);
        ivNoImage.setOnClickListener(this);
        ivDownloadFile.setOnClickListener(this);
        ivBookmark.setOnClickListener(this);
        ivBookmarkHistory.setOnClickListener(this);
        ivSavePage.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        //A switch-case statement, it launches a function based on the clicked view
        switch (view.getId()) {
            case R.id.iv_night_time:
                nightTime();
                break;
            case R.id.iv_no_image:
                noImage();
                break;
            case R.id.iv_download:
                download();
                break;
            case R.id.iv_bookmark:
                bookmark();
                break;
            case R.id.iv_bookmark_history:
                bookmarkHistory();
                break;
            case R.id.iv_save_page:
                savePage();
                break;
        }
    }

    /**
     * This method should handle Night-Time mode , please implement it and edit this documentation
     */
    private void nightTime() {
        //TODO Implement this method
        Toast.makeText(getContext(), "Test Night", Toast.LENGTH_SHORT).show();
    }
    /**
     * This method should handle No-Image mode , please implement it and edit this documentation
     */
    private void noImage() {
        //TODO Implement this method
        Toast.makeText(getContext(), "Test No Image", Toast.LENGTH_SHORT).show();
    }
    /**
     * This method should handle Download action , please implement it and edit this documentation
     */
    private void download() {
        //TODO Implement this method
        Toast.makeText(getContext(), "Test Download", Toast.LENGTH_SHORT).show();
    }
    /**
     * This method should open the bookmarks page , please implement it and edit this documentation
     */
    private void bookmark() {
        //TODO Implement this method
        Toast.makeText(getContext(), "Test Bookmark", Toast.LENGTH_SHORT).show();
    }
    /**
     * This method should handle bookmarks history , please implement it and edit this documentation
     */
    private void bookmarkHistory() {
        //TODO Implement this method
        Toast.makeText(getContext(), "Test Bookmark History", Toast.LENGTH_SHORT).show();
    }
    /**
     * This method should handle saving pages , please implement it and edit this documentation
     */
    private void savePage() {
        //TODO Implement this method
        Toast.makeText(getContext(), "Test Save Page", Toast.LENGTH_SHORT).show();
    }
}


