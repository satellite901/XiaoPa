package com.base.xiaopa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Satellite Wu on 2017/10/3.
 */
public class F_linkman extends Fragment {
    View v;
    private ExpandableListView mListView;
    private LinkManAdapter adapter;
    private List<GroupBean> list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.f_linkman,container,false);
        initData();
        mListView= (ExpandableListView) v.findViewById(R.id.elvlm);
        adapter=new LinkManAdapter(list,getContext());
        mListView.setAdapter(adapter);
        mListView.setGroupIndicator(null);




        return v;

    }

    public void initData()
    {
        list=new ArrayList<GroupBean>();
        /***分组1****/
        {
            List<ChildBean> list1=new ArrayList<ChildBean>();
            ChildBean cb1 = new ChildBean("时光荏苒", R.drawable.shiguang);
            ChildBean cb2 = new ChildBean("鱼的第八秒是重生", R.drawable.yude);
            ChildBean cb3 = new ChildBean("尘世人间", R.drawable.chenshi);
            list1.add(cb1);
            list1.add(cb2);
            list1.add(cb3);
            GroupBean gb1=new GroupBean("分组1",list1);
            list.add(gb1);
        }
        /***分组2****/
        {
            List<ChildBean> list1=new ArrayList<ChildBean>();
            ChildBean cb1 = new ChildBean("小黄人", R.drawable.xiaohuangren);
            ChildBean cb2 = new ChildBean("云光舒卷", R.drawable.yunguang);
            ChildBean cb3 = new ChildBean("月半小夜曲", R.drawable.yeban);
            ChildBean cb4 = new ChildBean("省略了对白", R.drawable.shenglue);
            ChildBean cb5 = new ChildBean("black", R.drawable.black);
            list1.add(cb1);
            list1.add(cb2);
            list1.add(cb3);
            list1.add(cb4);
            list1.add(cb5);
            GroupBean gb1=new GroupBean("分组2",list1);
            list.add(gb1);
        }
        /***分组3****/
        {
            List<ChildBean> list1=new ArrayList<ChildBean>();
            ChildBean cb1 = new ChildBean("时光荏苒", R.drawable.shiguang);
            ChildBean cb2 = new ChildBean("鱼的第八秒是重生", R.drawable.yude);
            ChildBean cb3 = new ChildBean("尘世人间", R.drawable.chenshi);
            list1.add(cb1);
            list1.add(cb2);
            list1.add(cb3);
            GroupBean gb1=new GroupBean("分组3",list1);
            list.add(gb1);
        }
        /***分组4****/
        {
            List<ChildBean> list1=new ArrayList<ChildBean>();
            ChildBean cb1 = new ChildBean("时光荏苒", R.drawable.shiguang);
            ChildBean cb2 = new ChildBean("鱼的第八秒是重生", R.drawable.yude);
            ChildBean cb3 = new ChildBean("尘世人间", R.drawable.chenshi);
            list1.add(cb1);
            list1.add(cb2);
            list1.add(cb3);
            GroupBean gb1=new GroupBean("分组4",list1);
            list.add(gb1);
        }

    }

}
