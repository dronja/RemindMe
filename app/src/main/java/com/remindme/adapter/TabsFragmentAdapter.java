package com.remindme.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.remindme.dto.RemindDTO;
import com.remindme.fragment.AbstractTabFragment;
import com.remindme.fragment.BirthdayFragment;
import com.remindme.fragment.HistoryFragment;
import com.remindme.fragment.IdeasFragment;
import com.remindme.fragment.TodoFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    HistoryFragment historyFragment;

    private List<RemindDTO> data;

    public void setData(List<RemindDTO> data) {
        this.data = data;
        historyFragment.refreshData();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        this.data = new ArrayList<>();
        initTabs();

    }

    private void initTabs() {
        tabs = new HashMap<>();
        historyFragment = HistoryFragment.getInstance(context, data);
        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
