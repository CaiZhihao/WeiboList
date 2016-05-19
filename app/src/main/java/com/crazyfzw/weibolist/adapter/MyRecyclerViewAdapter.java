package com.crazyfzw.weibolist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crazyfzw.weibolist.R;
import com.crazyfzw.weibolist.model.NineGridTestModel;
import com.crazyfzw.weibolist.viewmodule.NineGridTestLayout;

import java.util.List;


/**
 * Created by Crazyfzw on 2016/5/19.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;
    private List<NineGridTestModel> mList;

    public MyRecyclerViewAdapter(Context context, List<NineGridTestModel> list){

        this.context = context;
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);
        return new CommunityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((CommunityViewHolder)holder).nicePic.setIsShowAll(mList.get(position).isShowAll);
        ((CommunityViewHolder)holder).nicePic.setUrlList(mList.get(position).urlList);
    }

    @Override
    public int getItemCount() {
        return getListSize(mList);
    }


    public class CommunityViewHolder extends RecyclerView.ViewHolder{

        NineGridTestLayout nicePic;
        public CommunityViewHolder(View itemView) {
            super(itemView);
            nicePic = (NineGridTestLayout) itemView.findViewById(R.id.layout_nine_grid);
        }
    }

    private int getListSize(List<NineGridTestModel> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        return list.size();
    }

}
