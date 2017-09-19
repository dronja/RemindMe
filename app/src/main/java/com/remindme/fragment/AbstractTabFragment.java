package com.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;


public abstract class AbstractTabFragment extends Fragment {

    private String title;
    protected View view;
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
