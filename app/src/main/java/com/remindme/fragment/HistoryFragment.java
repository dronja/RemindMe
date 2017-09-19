package com.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.remindme.R;
import com.remindme.adapter.RemindListAdapter;
import com.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_history;
    private List<RemindDTO> data;

    private RemindListAdapter adapter;

    public static HistoryFragment getInstance(Context context, List<RemindDTO> data){
        Bundle args = new Bundle();
        HistoryFragment exampleFragment = new HistoryFragment();

        exampleFragment.setArguments(args);
        exampleFragment.setData(data);
        exampleFragment.setContext(context);
        exampleFragment.setTitle(context.getString(R.string.history));
        return exampleFragment;
    }

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);

        RecyclerView rv = view.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RemindListAdapter(data);
        rv.setAdapter(adapter);
        return view;
    }

    /*private List<RemindDTO> createMockRemindData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));

        return data;
    }*/

    public void setContext(Context context) {
        this.context = context;
    }

    public void refreshData(List<RemindDTO> list){
        adapter.setData(list);
        adapter.notifyDataSetChanged();
    }
}
