package com.luminar.shopee.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.luminar.shopee.homeFragments.HomeFragment;
import com.luminar.shopee.homeFragments.NotificationFragment;
import com.luminar.shopee.homeFragments.ProfileFragment;

/**
 *
 * Created by Suneer CK
 * On February 15 2022
 *
 * http://snrck.in/
 *
 */

public class TabsAdapter extends FragmentStatePagerAdapter {

    int tabsCount;

    public TabsAdapter(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        tabsCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case  0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                NotificationFragment notificationFragment = new NotificationFragment();
                return notificationFragment;
            case 2:
                ProfileFragment profileFragment =new ProfileFragment();
                return  profileFragment;
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return tabsCount;
    }
}
