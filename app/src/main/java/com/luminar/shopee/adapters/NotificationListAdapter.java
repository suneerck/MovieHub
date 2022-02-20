package com.luminar.shopee.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luminar.shopee.R;
import com.luminar.shopee.transform.CircleTransform;
import com.squareup.picasso.Picasso;

public class NotificationListAdapter extends RecyclerView.Adapter<HomeItemAdapter.CustomViewHolder> {

    String[] nTitle,nMsg,nTime;
    TextView tvTitle,tvMsg,tvTime;
    ImageView ivDp;

    public NotificationListAdapter(String[] nTitle, String[] nMsg, String[] nTime) {

        this.nTitle = nTitle;
        this.nMsg = nMsg;
        this.nTime = nTime;

    }

    @NonNull
    @Override
    public HomeItemAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_rv_notification,parent,false);

        tvTitle = view.findViewById(R.id.tvTitle);
        tvMsg = view.findViewById(R.id.tvDescription);
        tvTime = view.findViewById(R.id.tvTime);
        ivDp = view.findViewById(R.id.dp);

        return new HomeItemAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeItemAdapter.CustomViewHolder holder, int position) {
        tvTitle.setText(nTitle[position]);
        tvMsg.setText(nMsg[position]);
        tvTime.setText(nTime[position]);

        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6voYewn01nH8yWVbBPs2idp3GaMbGvZHF9Q&usqp=CAU")
                .transform(new CircleTransform())
                .into(ivDp);
    }

    @Override
    public int getItemCount() {
        return nTitle.length;
    }
}
