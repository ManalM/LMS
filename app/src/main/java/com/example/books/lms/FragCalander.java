package com.example.books.lms;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.books.lms.Model.*;
import java.util.List;

/**
 * Created by farouk muharram on 4/20/2019.
 */

public class FragCalander extends Fragment {
    private List<CourseContentM> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.frag_calander, container, false);


        ListView listView1 = view.findViewById(R.id.listView1);
        ListView listView2 = view.findViewById(R.id.listView2);
        ListView listView3 = view.findViewById(R.id.listView3);

        list = MyDb.getInstance(getContext()).getCourseContent("GR100");
        ListAdapter adapter1 = new ListAdapter(getLayoutInflater());
        listView1.setAdapter(adapter1);

        list = MyDb.getInstance(getContext()).getCourseContent("Ed531");
        ListAdapter adapter2 = new ListAdapter(getLayoutInflater());
        listView2.setAdapter(adapter2);

        list = MyDb.getInstance(getContext()).getCourseContent("Ed433");
        ListAdapter adapter3 = new ListAdapter(getLayoutInflater());
        listView3.setAdapter(adapter3);

        return view;
    }

    public class ListAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public ListAdapter( LayoutInflater inflater) {
            this.inflater = inflater;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.row_calender, null);
                holder = new ViewHolder();
                holder.txtWeek =  convertView.findViewById(R.id.txtWeek);
                holder.txtBlock =  convertView.findViewById(R.id.txtBlock);
                holder.txtTitle =  convertView.findViewById(R.id.txtTitle);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.txtWeek.setText(String.valueOf(list.get(position).getWeek()));
            holder.txtBlock.setText(list.get(position).getBlock());
            holder.txtTitle.setText(list.get(position).getTitle());
            return convertView;
        }

        class ViewHolder {
            TextView txtWeek, txtBlock, txtTitle;
        }
    }

}
