package com.qoobico.remindme.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobico.remindme.R;

public class ExampleFragment extends Fragment{
    private static final int LAYOUT = R.id.fragment_example;
    private View view;

    public static ExampleFragment getInstance(){
        Bundle agrs = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(agrs);
        return fragment;
    }

    @SuppressLint("ResourceType")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
