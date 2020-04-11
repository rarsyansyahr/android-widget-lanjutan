package com.android.if18s;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Items[] Dataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public RelativeLayout relativeLayout;

        public ViewHolder(View v) {
            super(v);
            this.textView = (TextView) v.findViewById(R.id.textView);
            this.relativeLayout = (RelativeLayout) v.findViewById(R.id.relativeLayout);
        }
    }

    public ItemAdapter(Items[] dataset) {
        Dataset = dataset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;*/

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.item, parent, false);
        ViewHolder vh = new ViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Items items = Dataset[position];
        holder.textView.setText(items.getLanguage());
    }

    @Override
    public int getItemCount() {
        return Dataset.length;
    }

}
