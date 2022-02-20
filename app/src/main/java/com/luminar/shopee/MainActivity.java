package com.luminar.shopee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.luminar.shopee.adapters.TabsAdapter;
import java.util.Objects;

/**
 * Created by Suneer CK
 * On February 15 2022
 * <p>
 * http://snrck.in/
 */

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager vp;
    TabLayout tbL;
    ImageView ivMenu,navIv;
    DrawerLayout drawer;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        navigationView.setNavigationItemSelectedListener(this);

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        tbL.addTab(tbL.newTab().setIcon(R.drawable.ic_home));
        tbL.addTab(tbL.newTab().setIcon(R.drawable.ic_notification));
        tbL.addTab(tbL.newTab().setIcon(R.drawable.ic_profile));
        tbL.setTabGravity(TabLayout.GRAVITY_FILL);

        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), tbL.getTabCount());
        vp.setAdapter(tabsAdapter);

        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tbL));

        TabLayout.Tab tab = tbL.getTabAt(0);
        int iconColor = ContextCompat.getColor(getApplicationContext(), R.color.white);
        assert tab != null;
        Objects.requireNonNull(tab.getIcon()).setColorFilter(iconColor, PorterDuff.Mode.SRC_IN);

        tbL.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int iconColor = ContextCompat.getColor(getApplicationContext(), R.color.white);
                Objects.requireNonNull(tab.getIcon()).setColorFilter(iconColor, PorterDuff.Mode.SRC_IN);

                int tabPosition = tab.getPosition();

                vp.setCurrentItem(tabPosition);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int iconColor = ContextCompat.getColor(getApplicationContext(), R.color.pinkLite);
                Objects.requireNonNull(tab.getIcon()).setColorFilter(iconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void init() {
        vp = findViewById(R.id.vp);
        tbL = findViewById(R.id.tbL);
        ivMenu = findViewById(R.id.ivMenu);
        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navIv = findViewById(R.id.navIv);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        Log.e("=========="," menuItem: "+id);
        int id2 = R.id.nav_profile;
        Log.e("=========="," profile: "+id2);

        if (menuItem.isChecked()) {
            drawer.closeDrawer(GravityCompat.START);
            return false;
        }

        if (id == R.id.nav_profile)
            vp.setCurrentItem(2);
        else if (id == R.id.nav_home)
            vp.setCurrentItem(0);
        else if (id == R.id.nav_notifications)
            vp.setCurrentItem(1);

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}