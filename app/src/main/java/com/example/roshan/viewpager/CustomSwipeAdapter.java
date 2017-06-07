package com.example.roshan.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by roshan on 1/4/17.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    Context ctx;
    LayoutInflater layoutInflater;
    int[] ArrayImage= {R.drawable.hanuman,R.drawable.patan_durbar_square,R.drawable.museum,R.drawable.krishna_mandir,R.drawable.lalitpur,R.drawable.handicraft_house,R.drawable.golden_temple,R.drawable.way_to_banglamukhi,R.drawable.banglamukhi_back_door,R.drawable.banglamukhi_mandrir};

    public  CustomSwipeAdapter (Context ctx){
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return ArrayImage.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (ScrollView)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe,container,false);
        ImageView  imageView = (ImageView) item_view.findViewById(R.id.imageview);
        imageView.setImageResource(ArrayImage[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ScrollView)object);
    }
}
