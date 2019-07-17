package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.books.lms.Model.CourseContentM;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

import java.util.List;

public class CourseCalender extends AppCompatActivity {

    private List<CourseContentM> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_calender);

        User user = ConstantsPref.getUser(this);

        String name = getIntent().getStringExtra("name");

        Log.e("nameee", name + " " + user.getId());
        list = MyDb.getInstance(this).getCourseContent(name.trim());


        ListView listView = findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(getLayoutInflater());
        listView.setAdapter(adapter);
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
                holder = (ListAdapter.ViewHolder) convertView.getTag();
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
