package com.example.books.lms;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;


public class started extends Fragment {


    public started() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_started, container, false);

        final Button btnsearch = view.findViewById(R.id.btn_search);
        final Button btn_languag = view.findViewById(R.id.btn_languag);
        final Button  search = view.findViewById(R.id.search);
        final EditText edtSearch = view.findViewById(R.id.edtSearch);
        final LinearLayout searchLayout = view.findViewById(R.id.searchLayout);

        final RadioGroup rg = view.findViewById(R.id.group);

        btn_languag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg.setVisibility(View.VISIBLE);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.ar:{
                        Locale myLocale = new Locale("ar");
                        Locale.setDefault(myLocale);
                        android.content.res.Configuration config = new android.content.res.Configuration();
                        config.locale = myLocale;
                        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
                        getActivity().recreate();

                    } break;
                    case R.id.en:{
                        Locale myLocale = new Locale("en");
                        Locale.setDefault(myLocale);
                        android.content.res.Configuration config = new android.content.res.Configuration();
                        config.locale = myLocale;
                        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
                        getActivity().recreate();

                    } break;
                }
            }
        });



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtSearch.getText().toString().trim().isEmpty())
                    return;

                Intent intent = new Intent(getContext(), AllCourses.class);
                intent.putExtra("name", edtSearch.getText().toString());
                startActivity(intent);
            }
        });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchLayout.setVisibility(View.VISIBLE);
                btnsearch.setVisibility(View.GONE);
            }
        });

        return  view;
    }

    }
