package com.werdpressed.partisan.testnavbuttonmenu;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class NavMenuAdapter extends RecyclerView.Adapter<NavMenuAdapter.NavMenuViewHolder> {

    @Override
    public NavMenuViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(NavMenuViewHolder navMenuViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NavMenuViewHolder extends RecyclerView.ViewHolder {

        public NavMenuViewHolder(View itemView) {
            super(itemView);
        }
    }
}
