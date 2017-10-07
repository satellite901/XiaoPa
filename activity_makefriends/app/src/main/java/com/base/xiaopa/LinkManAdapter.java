package com.base.xiaopa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Satellite Wu on 2017/10/3.
 */
public class LinkManAdapter extends BaseExpandableListAdapter {
    private List<GroupBean> list;
    private Context context;

   public  LinkManAdapter(List<GroupBean> list,Context context)
   {
       this.list=list;
       this.context=context;
   }
    public LinkManAdapter(){

    }
    @Override
    public int getGroupCount() {
        return list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return list.get(groupPosition).getChildren().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return list.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return list.get(groupPosition).getChildren().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {

        GroupHolder holder;
        if(convertView==null)
        {
            holder=new GroupHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_group,null);
            holder.title= (TextView) convertView.findViewById(R.id.group_title);
            holder.iv= (ImageView) convertView.findViewById(R.id.group_icon);
            convertView.setTag(holder);
        }else{
            holder= (GroupHolder) convertView.getTag();
        }
        holder.title.setText(list.get(groupPosition).getGroupName()); //获取名字
        if(isExpanded)  //判断是否展开
        {
            holder.iv.setImageResource(R.drawable.arrowdown);
        }
        else
        {
            holder.iv.setImageResource(R.drawable.arrowright);
        }

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild
            , View converView, ViewGroup partent) {
       ChildHolder holder;
        if(converView==null)
        {
            holder=new ChildHolder();
            converView=LayoutInflater.from(context).inflate(R.layout.item_child,null);
            holder.ivhead= (ImageView) converView.findViewById(R.id.child_head);
            holder.name= (TextView) converView.findViewById(R.id.child_name);
            converView.setTag(holder);
        }else{
            holder= (ChildHolder) converView.getTag();
        }
        ChildBean cb=list.get(groupPosition).getChildren().get(childPosition);
        holder.name.setText(cb.getName());
        holder.ivhead.setBackgroundResource(cb.getHead());
        return converView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
    class GroupHolder{
        TextView title;
        ImageView iv;

    }
    class ChildHolder{
        ImageView ivhead;
        TextView name;

    }

}
