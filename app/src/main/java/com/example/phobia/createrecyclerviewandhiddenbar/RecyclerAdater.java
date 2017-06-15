package com.example.phobia.createrecyclerviewandhiddenbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Phobia on 6/14/2017.
 */

public class RecyclerAdater extends RecyclerView.Adapter<MainActivity.ViewHolder> {

    ArrayList<String> mContacts;

    public RecyclerAdater(ArrayList<String> mContacts) {
        this.mContacts = mContacts;
    }

    @Override
    public MainActivity.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new MainActivity.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainActivity.ViewHolder holder, int position) {
        holder.mTextView.setText(mContacts.get(position));
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
