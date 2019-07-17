package com.example.books.lms;

import android.content.ContentValues;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.NewsM;
import com.example.books.lms.Model.SQLiteModel;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by farouk muharram on 4/20/2019.
 */

public class FragUnivNews extends Fragment {
    private List<NewsM> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_news, container, false);

        list = new ArrayList<>();

        String name = "";
        if (getArguments() != null) {
            name = getArguments().getString("name");
        }

        TextView txt = view.findViewById(R.id.txt);

        if(name.equals("site") ){
            initSiteNews();
            txt.setText(getResources().getString(R.string.site_news));
        }else {
            initKsaNews();
            txt.setText(getResources().getString(R.string.ksa_news));
        }

        ListView listView = view.findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(getLayoutInflater());
        listView.setAdapter(adapter);

        return view;
    }

    private void initKsaNews(){
        NewsM newsM = new NewsM();
        newsM.setId(1);
        newsM.setContent( "honor the winners of the Excellence Award in e-Learning at its fourth session");
        newsM.setDate( "2019/1/2");
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "The University actively participates in the work of the exhibition and the International Conference on Higher Education in Riyadh");
        newsM.setDate("2019/3/4");
        newsM.setId(2);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "The Medical Clinics Complex at the University organizes a lecture entitled \"IS IT APPENDICITIS?\"");
        newsM.setDate("2019/1/15");
        newsM.setId(3);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Deanship of Library Affairs invites to a session entitled \"Reading the art of self-development\"");
        newsM.setDate("2019/1/18");
        newsM.setId(4);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Faculty of Business Administration organizes a workshop entitled \"The intellectual balance in financial and economic transactions\"");
        newsM.setDate("2019/3/11");
        newsM.setId(5);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Deanship of Student Affairs concludes the health awareness exhibition \"strong heart\"");
        newsM.setDate("2019/2/2");
        newsM.setId(6);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Deanship of Library Affairs invites students to attend a training course entitled \"Treatment of anxiety tests\"");
        newsM.setDate("2019/1/21");
        newsM.setId(7);
    }

    private void initSiteNews(){
        NewsM newsM = new NewsM();
        newsM.setId(1);
        newsM.setContent( "honor the winners of the Excellence Award in e-Learning at its fourth session");
        newsM.setDate( "2019/1/2");
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "The University actively participates in the work of the exhibition and the International Conference on Higher Education in Riyadh");
        newsM.setDate("2019/3/4");
        newsM.setId(2);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "The Medical Clinics Complex at the University organizes a lecture entitled \"IS IT APPENDICITIS?\"");
        newsM.setDate("2019/1/15");
        newsM.setId(3);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Deanship of Library Affairs invites to a session entitled \"Reading the art of self-development\"");
        newsM.setDate("2019/1/18");
        newsM.setId(4);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Faculty of Business Administration organizes a workshop entitled \"The intellectual balance in financial and economic transactions\"");
        newsM.setDate("2019/3/11");
        newsM.setId(5);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Deanship of Student Affairs concludes the health awareness exhibition \"strong heart\"");
        newsM.setDate("2019/2/2");
        newsM.setId(6);
        list.add(newsM);

        newsM = new NewsM();
        newsM.setContent( "Deanship of Library Affairs invites students to attend a training course entitled \"Treatment of anxiety tests\"");
        newsM.setDate("2019/1/21");
        newsM.setId(7);
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
            ListAdapter.ViewHolder holder;
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.row_news, null);
                holder = new ListAdapter.ViewHolder();
                holder.txt =  convertView.findViewById(R.id.btn_cour_announ);

                convertView.setTag(holder);
            } else {
                holder = (ListAdapter.ViewHolder) convertView.getTag();
            }

            holder.txt.setText(list.get(position).getContent() + " data: " + list.get(position).getDate());
            return convertView;
        }

        class ViewHolder {
            Button txt;
        }
    }
}
