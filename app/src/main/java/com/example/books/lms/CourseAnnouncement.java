package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.books.lms.Model.CourseM;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseAnnouncement extends AppCompatActivity {

    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_announcement);

        User user = ConstantsPref.getUser(this);

        String name = getIntent().getStringExtra("name");

        Log.e("nameee", name + " " + user.getId());
        CourseM courseM = MyDb.getInstance(this).getCourse(user.getId(), name.trim());


        list = new ArrayList<>(Arrays.asList(courseM.getCourseAnnouncement().split(" , ")));
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
                convertView = inflater.inflate(R.layout.row_announcement, null);
                holder = new ViewHolder();
                holder.spinnerValue =  convertView.findViewById(R.id.btn_cour_announ);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.spinnerValue.setText(list.get(position));
            return convertView;
        }

        class ViewHolder {
            Button spinnerValue;
        }
    }

}
