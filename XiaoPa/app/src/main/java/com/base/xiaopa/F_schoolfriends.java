package com.base.xiaopa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Satellite Wu on 2017/10/3.
 */
public class F_schoolfriends extends Fragment {
    private TextView tvchange1;
    private View v;
    private RecyclerView sfRecyclerView;
    private RecyclerView sfRecyclerView1;
    private RecyclerView sfRecyclerView2;
    private List<sf_IT> mDatas;
    private SFAdapter adapter;

    private int head[]={R.drawable.xiaohuangren,R.drawable.black,R.drawable.shiguang,
                        R.drawable.yude,R.drawable.yunguang,R.drawable.yeban,R.drawable.chenshi};
    private String name[]={"小黄人","black","时光荏苒","鱼的第八秒是重生","云光舒卷","夜半小夜曲","尘世人间"};

    private int head1[]={R.drawable.qidai,R.drawable.douya,R.drawable.zhengzai,R.drawable.summer,R.drawable.jiangge};
    private String name1[]={"期待","豆芽","正在通话中","summer","讲个笑话纪念我"};
    int flag=1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate( R.layout.f_schoolfriends,container,false);
        initdatas();

       /**同专业**/
        sfRecyclerView= (RecyclerView) v.findViewById(R.id.rvsf);
        sfRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),5));
        sfRecyclerView.setAdapter(adapter =new SFAdapter(getContext()));
        tvchange1= (TextView) v.findViewById(R.id.change1);
        tvchange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag%2==1)
                {
                    mDatas = new ArrayList<sf_IT>();
                    for(int i=0;i< name1.length;i++)
                    {
                        sf_IT data=new sf_IT();
                        data.setSf_head(head1[i]);
                        data.setSf_name(name1[i]);
                        mDatas.add(data);

                    }
                    sfRecyclerView.setAdapter(adapter);
                    flag++;
                }
                else if(flag%2==0)
                {
                    mDatas = new ArrayList<sf_IT>();

                    for(int i=0;i< name.length;i++)
                    {
                        sf_IT data=new sf_IT();
                        data.setSf_head(head[i]);
                        data.setSf_name(name[i]);
                        mDatas.add(data);
                    }
                    sfRecyclerView.setAdapter(adapter);
                    flag++;
                }
            }
        });

        /***同学院***/
        sfRecyclerView1= (RecyclerView) v.findViewById(R.id.rvsf1);
        sfRecyclerView1.setLayoutManager(new GridLayoutManager(getContext(),5));
        sfRecyclerView1.setAdapter(adapter =new SFAdapter(getContext()));
        tvchange1= (TextView) v.findViewById(R.id.change2);
        tvchange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag%2==1)
                {
                    mDatas = new ArrayList<sf_IT>();
                    for(int i=0;i< name1.length;i++)
                    {
                        sf_IT data=new sf_IT();
                        data.setSf_head(head1[i]);
                        data.setSf_name(name1[i]);
                        mDatas.add(data);

                    }
                    sfRecyclerView1.setAdapter(adapter);
                    flag++;
                }
                else if(flag%2==0)
                {
                    mDatas = new ArrayList<sf_IT>();

                    for(int i=0;i< name.length;i++)
                    {
                        sf_IT data=new sf_IT();
                        data.setSf_head(head[i]);
                        data.setSf_name(name[i]);
                        mDatas.add(data);
                    }
                    sfRecyclerView1.setAdapter(adapter);
                    flag++;
                }
            }
        });

        /***同学校****/
        sfRecyclerView2= (RecyclerView) v.findViewById(R.id.rvsf2);
        sfRecyclerView2.setLayoutManager(new GridLayoutManager(getContext(),5));
        sfRecyclerView2.setAdapter(adapter =new SFAdapter(getContext()));
        tvchange1= (TextView) v.findViewById(R.id.change3);
        tvchange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag%2==1)
                {
                    mDatas = new ArrayList<sf_IT>();
                    for(int i=0;i< name1.length;i++)
                    {
                        sf_IT data=new sf_IT();
                        data.setSf_head(head1[i]);
                        data.setSf_name(name1[i]);
                        mDatas.add(data);

                    }
                    sfRecyclerView2.setAdapter(adapter);
                    flag++;
                }
                else if(flag%2==0)
                {
                    mDatas = new ArrayList<sf_IT>();

                    for(int i=0;i< name.length;i++)
                    {
                        sf_IT data=new sf_IT();
                        data.setSf_head(head[i]);
                        data.setSf_name(name[i]);
                        mDatas.add(data);
                    }
                    sfRecyclerView2.setAdapter(adapter);
                    flag++;
                }
            }
        });

        return v;
    }

    protected  void initdatas()
    {
        mDatas = new ArrayList<sf_IT>();

        for(int i=0;i< name.length;i++)
        {
            sf_IT data=new sf_IT();
            data.setSf_head(head[i]);
            data.setSf_name(name[i]);
            mDatas.add(data);
        }
    }
    class SFAdapter extends RecyclerView.Adapter<SFAdapter.MyViewHolder> {
        private final Context context;

        public SFAdapter(Context context)
        {

            this.context = context;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder =new MyViewHolder(LayoutInflater.
                    from(context).inflate(R.layout.item_schoolfriends,parent,false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.sf_head.setBackgroundResource(mDatas.get(position).getSf_head());
            holder.sf_name.setText(mDatas.get(position).getSf_name());
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }


        class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView sf_head;
            TextView sf_name;
            public MyViewHolder(View itemView) {
                super(itemView);
                sf_head= (ImageView) itemView.findViewById(R.id.ivsf_head);
                sf_name= (TextView) itemView.findViewById(R.id.tvsf_name);
            }
        }
    }

}
