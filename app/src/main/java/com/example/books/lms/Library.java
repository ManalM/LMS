package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.example.books.lms.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library extends AppCompatActivity {

    private List<Book> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        final GridView gridView = findViewById(R.id.gridView);

        BooksAdapter adapter = new BooksAdapter ();
        gridView.setAdapter(adapter);
    }

    class BooksAdapter extends BaseAdapter
    {

        public BooksAdapter ( )
        {
            list = new ArrayList<>();
            list.add(new Book("C++", 730));
            list.add(new Book("JAVA", 987));
            list.add(new Book("Computer Intro", 155));
            list.add(new Book("Data Structure", 488));
            list.add(new Book("Software Engineering", 558));
            list.add(new Book("Network ", 888));
            list.add(new Book("ASP.NET MVC", 654));
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder = new ViewHolder();

            if(convertView == null)
            {
                convertView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.row_book, parent, false);

                viewHolder.txtTitle = convertView.findViewById(R.id.txtTitle);
                viewHolder.txtAuthor = convertView.findViewById(R.id.txtAuthor);

                convertView.setTag(viewHolder);

            }
            else {
                viewHolder = (ViewHolder)convertView.getTag();
            }

            viewHolder.txtTitle.setText(list.get(position).getName());
            viewHolder.txtAuthor.setText(String.valueOf(list.get(position).getPages()));
            return convertView;
        }

        private class ViewHolder{
            private TextView txtTitle, txtAuthor;
        }

    }
}
