package com.example.sns_project.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Switch;

import com.example.sns_project.R;
import com.example.sns_project.info.ImageInfo;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private Switch aSwitch;
    private Spinner spinner;
    SearchView search;
    ArrayList<ImageInfo> image_itemArrayList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tour_info_list, container, false);
    }
}
