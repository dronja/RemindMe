package com.remindme.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.remindme.R;
import com.remindme.dto.RemindDTO;

import java.util.List;

public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemindViewHolder>{

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }

    private List<RemindDTO> data;

    public RemindListAdapter(List<RemindDTO> data) {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item,parent,false);
        return new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position) {
        holder.title.setText(data.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class RemindViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView title;

        public RemindViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            title = itemView.findViewById(R.id.title);
        }
    }
}
