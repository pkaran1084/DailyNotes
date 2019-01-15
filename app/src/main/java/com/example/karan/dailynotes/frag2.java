package com.example.karan.dailynotes;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.karan.dailynotes.R.layout.fragment_frag1;


public class frag2 extends Fragment {
    TextView t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_frag2, container, false);
        View v=inflater.inflate(fragment_frag1,container,false);

        /*SharedPreferences sharedPreferences=this.getActivity().getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        String email=sharedPreferences.getString("Email","Cannot Fetch");
        String pass=sharedPreferences.getString("pass","Pass cannot be fetched");

        t=(TextView)v.findViewById(R.id.txt);
        t.setText(email);*/
        return v;
    }

}
