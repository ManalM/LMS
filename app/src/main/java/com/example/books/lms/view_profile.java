package com.example.books.lms;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;


public class view_profile extends Fragment {


    public view_profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_view_profile, container, false);

        User user = ConstantsPref.getUser(getContext());
        if(user == null){
            getActivity().onBackPressed();
            return view;
        }

        final ImageView img = view.findViewById(R.id.imageView2);
        final TextView txtName = view.findViewById(R.id.textView2);
        final TextView txtCountry = view.findViewById(R.id.textView4);
        final TextView txtTown = view.findViewById(R.id.textView5);
        final TextView txtFirstAccess = view.findViewById(R.id.textView9);
        final TextView txtLastAccess = view.findViewById(R.id.textView11);


        txtName.setText(String.valueOf(user.getStudentId()) + " " +user.getName());
        txtCountry.setText(user.getCountry());
        txtTown.setText(user.getTown());
        txtFirstAccess.setText(user.getFirstAccess());
        txtLastAccess.setText(user.getLastAccess());

        return view;
    }
}
