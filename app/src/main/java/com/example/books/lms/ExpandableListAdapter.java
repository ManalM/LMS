package com.example.books.lms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter{
    private Context context;
    private List<headeritem> listdataheder;
    private HashMap<List<headeritem>,List<imageitem>>listdatachild;

    public ExpandableListAdapter(Context context, List<headeritem> listdataheder, HashMap<List<headeritem>, List<imageitem>> listdatachild) {
        this.context = context;
        this.listdataheder = listdataheder;
        this.listdatachild = listdatachild;
    }

    @Override
    public int getGroupCount() {
        return this.listdataheder.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listdatachild.get(this.listdataheder.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listdataheder.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.listdatachild.get(this.listdataheder.get(groupPosition)).get(childPosition);
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
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        headeritem h=(headeritem) getGroup(groupPosition);

        LayoutInflater inflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.list_group,null);
        TextView txtheader=(TextView)convertView.findViewById(R.id.txt_title);
        txtheader.setText(h.title);
        ImageView img=(ImageView)convertView.findViewById(R.id.img_titel);
        img.setImageResource(h.image_titel);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        imageitem s=(imageitem)getChild(groupPosition,childPosition);
        LayoutInflater inflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.list_item,null);
        TextView textView=(TextView)convertView.findViewById(R.id.textView);
        textView.setText(s.name);
        ImageView img=(ImageView)convertView.findViewById(R.id.imgchangel);
        img.setImageResource(s.imageurl);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {

        return true;
    }
}
