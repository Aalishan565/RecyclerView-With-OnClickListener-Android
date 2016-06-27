package com.recyclerviewwithonclicklistener;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by aalishan on 27/6/16.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    String names[];
    Context ctx;
    private LayoutInflater inflater;

    public CustomAdapter(Context ctx, String[] names) {
        this.names = names;
        this.ctx = ctx;
        inflater = LayoutInflater.from(ctx);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_row_name, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvName.setText(names[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mTvName;

        public ViewHolder(View itemView) {
            super(itemView);
            mTvName = (TextView) itemView.findViewById(R.id.tv_name);
            mTvName.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(ctx, "item clicked" + names[getAdapterPosition()], Toast.LENGTH_SHORT).show();

        }
    }
}
