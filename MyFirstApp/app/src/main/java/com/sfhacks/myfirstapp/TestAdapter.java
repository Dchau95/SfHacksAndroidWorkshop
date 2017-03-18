package com.sfhacks.myfirstapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by david on 3/18/17.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<String> mName;
    private Context context;


    public TestAdapter(List<String> name, Context context) {
        mName = name;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return mName.size();
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.name.setText(mName.get(position));
        final int currentPosition = position;

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "I clicked on "+mName.get(currentPosition), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_template, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView date;
        View view;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            name = (TextView) view.findViewById(R.id.name);
            date = (TextView) view.findViewById(R.id.dateTime);
        }
    }
}
