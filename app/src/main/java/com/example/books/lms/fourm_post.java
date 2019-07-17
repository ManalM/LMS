package com.example.books.lms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fourm_post extends Fragment {

    public fourm_post() {}

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_fourm_post, container, false);

        Button btnPost = view.findViewById(R.id.btnPost);
        Button btnDa = view.findViewById(R.id.btnDa);

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ForumAct.class);
                intent.putExtra("name", "post");
                startActivity(intent);
            }
        });

        btnDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ForumAct.class);
                intent.putExtra("name", "da");
                startActivity(intent);
            }
        });

        return view;
    }
}
