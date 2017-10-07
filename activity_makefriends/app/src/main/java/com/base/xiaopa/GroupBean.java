package com.base.xiaopa;

import java.util.List;

/**
 * Created by Satellite Wu on 2017/10/3.
 */
public class GroupBean {

    private String groupName;
    private List<ChildBean> children;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<ChildBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildBean> children) {
        this.children = children;
    }

    public GroupBean(String groupName, List<ChildBean> children) {
        this.groupName = groupName;
        this.children = children;
    }

    public GroupBean() {
    }

}

