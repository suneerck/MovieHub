package com.luminar.shopee.homeFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luminar.shopee.R;
import com.luminar.shopee.adapters.NotificationListAdapter;

/**
 *
 * Created by Suneer CK
 * On February 15 2022
 *
 * http://snrck.in/
 *
 */

public class NotificationFragment extends Fragment {

    RecyclerView rv;
    String[] nTitle,nMsg,nTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_notification, container, false);

        nTitle = new String[]{
                "Releasing Today",
                "Released",
                "Buy Now",
                "Releasing Today",
                "Released",
                "Buy Now",
                "Releasing Today",
                "Released",
                "Buy Now",
                "Releasing Today",
                "Released",
                "Buy Now",
        };

        nMsg = new String[]{
                "Thor: The Dark World",
                "Pushpa: The Rise",
                "The Hitman's Bodyguard",
                "Thor: The Dark World",
                "Pushpa: The Rise",
                "The Hitman's Bodyguard",
                "Thor: The Dark World",
                "Pushpa: The Rise",
                "The Hitman's Bodyguard",
                "Thor: The Dark World",
                "Pushpa: The Rise",
                "The Hitman's Bodyguard"
        };

        nTime = new String[]{
                "Today 07:45 AM",
                "Yesterday 08:00 PM",
                "8 Feb. 18 03:45 PM",
                "Today 07:45 AM",
                "Yesterday 08:00 PM",
                "8 Feb. 18 03:45 PM",
                "Today 07:45 AM",
                "Yesterday 08:00 PM",
                "8 Feb. 18 03:45 PM",
                "Today 07:45 AM",
                "Yesterday 08:00 PM",
                "8 Feb. 18 03:45 PM"
        };

        rv = v.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new NotificationListAdapter(nTitle,nMsg,nTime));

        // Inflate the layout for this fragment
        return v;
    }
}