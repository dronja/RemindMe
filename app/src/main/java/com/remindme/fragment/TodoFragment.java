package com.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.remindme.R;

public class TodoFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static TodoFragment getInstance(Context context){
        Bundle args = new Bundle();
        TodoFragment exampleFragment = new TodoFragment();
        exampleFragment.setArguments(args);
        exampleFragment.setContext(context);
        exampleFragment.setTitle(context.getString(R.string.todo));
        return exampleFragment;
    }


    public void setContext(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
