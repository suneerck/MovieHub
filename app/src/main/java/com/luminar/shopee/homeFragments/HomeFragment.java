package com.luminar.shopee.homeFragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.luminar.shopee.R;
import com.luminar.shopee.adapters.HomeItemAdapter;

/**
 *
 * Created by Suneer CK
 * On February 15 2022
 *
 * http://snrck.in/
 *
 */

public class HomeFragment extends Fragment {

    RecyclerView rv;
    String[] mName, mImage;
    int[] mPrice;
//    DrawerLayout drawerLayout;
//    ImageView ivMenu;
    Boolean mSlideState = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);



        mName = new String[]{
                "Thor: \nThe Dark World", "Pushpa: \nThe Rise", "Jai Bhim \n  ",
                "Minnal Murali \n  ", "Kurup \n  ", "Master \n  ",
                "Venom 2 \n", "Joker \n  ", "K.G.F: \nChapter 1",
                "Thor: \nThe Dark World", "Pushpa: \nThe Rise", "Jai Bhim \n  ",
                "Minnal Murali \n  ", "Kurup \n  ", "Master \n  ",
                "Venom 2 \n", "Joker \n  ", "K.G.F: \nChapter 1",
                "Thor: \nThe Dark World", "Pushpa: \nThe Rise", "Jai Bhim \n  ",
                "Minnal Murali \n  ", "Kurup \n  ", "Master \n  ",
                "Venom 2 \n", "Joker \n  ", "K.G.F: \nChapter 1"
        };

        mPrice = new int[]{
                170, 200, 130,
                110, 120, 150,
                210, 180, 190,
                170, 200, 130,
                110, 120, 150,
                210, 180, 190,
                170, 200, 130,
                110, 120, 150,
                210, 180, 190
        };

        mImage = new String[]{
                "https://m.media-amazon.com/images/I/51Gl0SXKRHL._SY445_.jpg",
                "https://upload.wikimedia.org/wikipedia/en/7/75/Pushpa_-_The_Rise_%282021_film%29.jpg",
                "https://upload.wikimedia.org/wikipedia/en/a/ad/Jai_Bhim_film_poster.jpg",
                "https://m.media-amazon.com/images/M/MV5BNzllYTM0ZDgtZTk4NS00YjYzLTliNjktMjZmNTZmNGZlNzI4XkEyXkFqcGdeQXVyMjkxNzQ1NDI@._V1_.jpg",
                "https://i2.extraimage.info/pix/2021/12/14/4d4fb71c2ba2279711f2754ea89e9991.jpg",
                "https://static.toiimg.com/photo/msid-79192759/79192759.jpg",
                "https://d9nvuahg4xykp.cloudfront.net/1046805305274495772/3731203306032565242.jpg",
                "https://www.sideshow.com/storage/product-images/906436/the-joker_dc-comics_gallery_5ec485640b7db.jpg",
                "https://images-na.ssl-images-amazon.com/images/I/81ol8zsbMfL._RI_.jpg",
                "https://m.media-amazon.com/images/I/51Gl0SXKRHL._SY445_.jpg",
                "https://upload.wikimedia.org/wikipedia/en/7/75/Pushpa_-_The_Rise_%282021_film%29.jpg",
                "https://upload.wikimedia.org/wikipedia/en/a/ad/Jai_Bhim_film_poster.jpg",
                "https://m.media-amazon.com/images/M/MV5BNzllYTM0ZDgtZTk4NS00YjYzLTliNjktMjZmNTZmNGZlNzI4XkEyXkFqcGdeQXVyMjkxNzQ1NDI@._V1_.jpg",
                "https://i2.extraimage.info/pix/2021/12/14/4d4fb71c2ba2279711f2754ea89e9991.jpg",
                "https://static.toiimg.com/photo/msid-79192759/79192759.jpg",
                "https://d9nvuahg4xykp.cloudfront.net/1046805305274495772/3731203306032565242.jpg",
                "https://www.sideshow.com/storage/product-images/906436/the-joker_dc-comics_gallery_5ec485640b7db.jpg",
                "https://images-na.ssl-images-amazon.com/images/I/81ol8zsbMfL._RI_.jpg",
                "https://m.media-amazon.com/images/I/51Gl0SXKRHL._SY445_.jpg",
                "https://upload.wikimedia.org/wikipedia/en/7/75/Pushpa_-_The_Rise_%282021_film%29.jpg",
                "https://upload.wikimedia.org/wikipedia/en/a/ad/Jai_Bhim_film_poster.jpg",
                "https://m.media-amazon.com/images/M/MV5BNzllYTM0ZDgtZTk4NS00YjYzLTliNjktMjZmNTZmNGZlNzI4XkEyXkFqcGdeQXVyMjkxNzQ1NDI@._V1_.jpg",
                "https://i2.extraimage.info/pix/2021/12/14/4d4fb71c2ba2279711f2754ea89e9991.jpg",
                "https://static.toiimg.com/photo/msid-79192759/79192759.jpg",
                "https://d9nvuahg4xykp.cloudfront.net/1046805305274495772/3731203306032565242.jpg",
                "https://www.sideshow.com/storage/product-images/906436/the-joker_dc-comics_gallery_5ec485640b7db.jpg",
                "https://images-na.ssl-images-amazon.com/images/I/81ol8zsbMfL._RI_.jpg"
        };

        rv = v.findViewById(R.id.rv);

        rv.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        rv.setAdapter(new HomeItemAdapter(mName, mPrice, mImage));

//        drawerLayout = v.findViewById(R.id.drawer_layout);
//        ivMenu = v.findViewById(R.id.ivMenu);

//        ivMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                drawer();
//                drawerClick();
//            }
//        });

        return v;

    }

//    private void drawer() {
//        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
//            @Override
//            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
//
//            }
//
//            @Override
//            public void onDrawerOpened(@NonNull View drawerView) {
//                mSlideState = true;
//            }
//
//            @Override
//            public void onDrawerClosed(@NonNull View drawerView) {
//                mSlideState = false;
//            }
//
//            @Override
//            public void onDrawerStateChanged(int newState) {
//
//            }
//        });
//    }

//    void drawerClick(){
//        if (mSlideState){
//            drawerLayout.closeDrawer(GravityCompat.END);
//        } else {
//            drawerLayout.openDrawer(GravityCompat.END);
//        }
//    }

}