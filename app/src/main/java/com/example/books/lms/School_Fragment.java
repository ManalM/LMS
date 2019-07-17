package com.example.books.lms;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class School_Fragment extends Fragment {


    public School_Fragment() {
        // Required empty public constructor

    }

  ImageView  image_center_obj;
    Animation    anim_image;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle   savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_school_, container, false);
        //image_center_obj=(ImageView) view.findViewById( R.id.image_center);
       // anim_image= AnimationUtils.loadAnimation(getActivity(),R.anim.amage_animi);
        //image_center_obj.startAnimation(anim_image);
        return view;
    }

}
