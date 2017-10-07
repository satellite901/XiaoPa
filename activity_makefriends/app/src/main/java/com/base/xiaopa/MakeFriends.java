package com.base.xiaopa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MakeFriends extends FragmentActivity {
    ImageView    iv_search;
    ImageView    iv_sf;
    ImageView    iv_lm;
    TextView     tv_addf;

    NoScrollViewPager vp_pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_friends);
        fragmentpage();
    }

    /****页面翻转****/
public void fragmentpage()
{
    final ArrayList<Fragment> list =new ArrayList<Fragment>();
    list.add(new F_search());
    list.add(new F_schoolfriends());
    list.add(new F_linkman());
   FragmentStatePagerAdapter adapter_f=new FragmentStatePagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public void finishUpdate(ViewGroup container) {
            super.finishUpdate(container);

            iv_search= (ImageView) findViewById(R.id.ivsearch);
            iv_sf= (ImageView) findViewById(R.id.ivsf);
            iv_lm= (ImageView) findViewById(R.id.ivlm);
            tv_addf= (TextView) findViewById(R.id.tvaddf);
        if(vp_pager.getCurrentItem()==0)
        {
            iv_search.setBackgroundResource(R.drawable.btexplore_orange);
            iv_sf.setBackgroundResource(R.drawable.btschool_gray);
            iv_lm.setBackgroundResource(R.drawable.btlinkman_gray);
            tv_addf.setVisibility(View.GONE);
        }else if(vp_pager.getCurrentItem()==1)
        {
            iv_search.setBackgroundResource(R.drawable.btexplore_gray);
            iv_sf.setBackgroundResource(R.drawable.btschool_orange);
            iv_lm.setBackgroundResource(R.drawable.btlinkman_gray);
            tv_addf.setVisibility(View.GONE);

        }else if(vp_pager.getCurrentItem()==2)
        {
            iv_search.setBackgroundResource(R.drawable.btexplore_gray);
            iv_sf.setBackgroundResource(R.drawable.btschool_gray);
            iv_lm.setBackgroundResource(R.drawable.btlinkman_orange);
            tv_addf.setVisibility(View.VISIBLE);
        }


        }
    };
    vp_pager= (NoScrollViewPager) findViewById(R.id.vp_mf);
    vp_pager.setAdapter(adapter_f);
}

    public void ocsearch(View v)
    {
        vp_pager.setCurrentItem(0,true);

    }
    public void ocsf(View v)
    {
        vp_pager.setCurrentItem(1,true);

    }
    public void oclm(View v)
    {
        vp_pager.setCurrentItem(2,true);
    }
    /*****翻转页面end****/
}
