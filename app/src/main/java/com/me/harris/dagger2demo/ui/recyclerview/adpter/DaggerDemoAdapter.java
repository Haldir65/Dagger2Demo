package com.me.harris.dagger2demo.ui.recyclerview.adpter;

import android.support.annotation.LayoutRes;

import com.me.harris.dagger2demo.databinding.ItemCardsBinding;
import com.me.harris.dagger2demo.ui.recyclerview.viewholder.DataBoundViewHolder;

import java.util.List;

/**
 * Created by Fermi on 2016/9/25.
 */

public class DaggerDemoAdapter extends DataBoundAdapter<ItemCardsBinding> {



    /**
     * Creates a DataBoundAdapter with the given item layout
     *
     * @param layoutId The layout to be used for items. It must use data binding.
     */
    public DaggerDemoAdapter(@LayoutRes int layoutId) {
        super(layoutId);
    }

    @Override
    protected void bindItem(DataBoundViewHolder<ItemCardsBinding> holder, int position, List<Object> payloads) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
