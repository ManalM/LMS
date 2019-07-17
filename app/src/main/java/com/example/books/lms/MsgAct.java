package com.example.books.lms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.books.lms.Model.MyDb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class MsgAct extends AppCompatActivity {

    private EditText edtMsg;
    private Context context;
    private final String tag = "Chat";
    private List<MessageM> list;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
        context = this;
        list = new ArrayList<>();

        ListView listView = findViewById(R.id.listView);
        list = new ArrayList<>();
        adapter = new ListAdapter(getLayoutInflater());
        listView.setAdapter(adapter);

        edtMsg = findViewById(R.id.edtMsg);
        ImageView img = findViewById(R.id.imgSend);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    public class MessageM{
        private String content;
        private String date;

        public MessageM( String content, String date) {
            this.content = content;
            this.date = date;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public void sendMessage() {
            if (edtMsg != null && edtMsg.getText().length() > 0) {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm a" , Locale.ENGLISH);
                Calendar calendar = Calendar.getInstance();
                Date now = calendar.getTime();
                String s =  simpleDateFormat.format(now);

                MessageM msg = new MessageM(edtMsg.getText().toString(), s);
                list.add(msg);
                adapter.notifyDataSetChanged();

                edtMsg.setText("");
            }
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
                convertView = inflater.inflate(R.layout.row_message, null);
                holder = new ListAdapter.ViewHolder();
                holder.txtContent =  convertView.findViewById(R.id.txtContent);
                holder.txtDate =  convertView.findViewById(R.id.txtDate);

                convertView.setTag(holder);
            } else {
                holder = (ListAdapter.ViewHolder) convertView.getTag();
            }

            holder.txtContent.setText(String.valueOf(list.get(position).getContent()));
            holder.txtDate.setText(list.get(position).getDate());
            return convertView;
        }

        class ViewHolder {
            TextView txtContent, txtDate;
        }
    }

}
