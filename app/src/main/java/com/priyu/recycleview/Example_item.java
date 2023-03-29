package com.priyu.recycleview;

public class Example_item {
    private int mImageresources;
    private String mText;
        public Example_item(int imageresource,String text){
             mImageresources=imageresource;
             mText=text;
        }

    public int getmImageresources() {
        return mImageresources;
    }

    public void setmImageresources(int mImageresources) {

            this.mImageresources = mImageresources;
    }

    public String getmText() {

            return mText;
    }

    public void setmText(String mText) {

            this.mText = mText;
    }
}
