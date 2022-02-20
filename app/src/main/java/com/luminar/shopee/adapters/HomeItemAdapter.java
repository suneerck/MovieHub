package com.luminar.shopee.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luminar.shopee.R;
import com.squareup.picasso.Picasso;

/**
 *
 * Created by Suneer CK
 * On February 15 2022
 *
 * http://snrck.in/
 *
 */

public class HomeItemAdapter extends RecyclerView.Adapter<HomeItemAdapter.CustomViewHolder> {

    String[] mName,mImage;
    int[] mPrice;


    public HomeItemAdapter(String[] mName, int[] mPrice, String[] mImage) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.mImage = mImage;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.item_rv_home,parent,false);

        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.tvTitle.setText(mName[position]);
        holder.tvPrice.setText("₹"+mPrice[position]);

        Picasso.get()
                .load(mImage[position])
                .into(holder.iv);

    }

    @Override
    public int getItemCount() {
        return mName.length;
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle,tvPrice;
        ImageView iv;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            iv = itemView.findViewById(R.id.iv);

        }

    }
}
