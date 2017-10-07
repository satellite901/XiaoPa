package com.base.xiaopa;

/**
 * Created by Satellite Wu on 2017/10/3.
 */
public class ChildBean {


        private String name;
        private int head;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHead() {
            return head;
        }

        public void setHead(int head) {
            this.head = head;
        }

        public ChildBean(String name, int head) {
            this.name = name;
            this.head = head;
        }

        public ChildBean() {
        }

    }

