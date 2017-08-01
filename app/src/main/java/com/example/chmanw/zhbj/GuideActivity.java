package com.example.chmanw.zhbj;

import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.LayoutParams;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import static android.view.ViewGroup.*;

public class GuideActivity extends AppCompatActivity {

    private ViewPager mGuidePager;
    private ImageView mRedPoint;
    private LinearLayout mGrayPointLayout;

    private int[] list = new int[]{R.drawable.guide_1, R.drawable.guide_2, R.drawable.guide_3};
    private List<ImageView> mImageArr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        getSupportActionBar().hide();
        initView();
        initImageView();
        GuideAdapter adpater = new GuideAdapter();
        mGuidePager.setAdapter(adpater);
    }

    private void initView() {

        mGuidePager = (ViewPager) findViewById(R.id.guide_pager);
        mGrayPointLayout = (LinearLayout)findViewById(R.id.point_layout) ;
        mRedPoint = (ImageView)findViewById(R.id.red_point);

        mGuidePager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initImageView() {

        for (int i = 0; i < 3; i++) {

            ImageView imgV = new ImageView(this);
            imgV.setBackgroundResource(list[i]);
            mImageArr.add(imgV);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            ImageView point = new ImageView(this);
            point.setLayoutParams(params);
            point.setPadding(0 ,0,10,0);
            point.setImageResource(R.drawable.point_gray);
            mGrayPointLayout.addView(point);
        }
    }

    class GuideAdapter extends PagerAdapter {


        @Override
        public int getCount() {
            return mImageArr.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imgv = mImageArr.get(position);

            container.addView(imgv);
            return imgv;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View)object);
        }
    }
}
