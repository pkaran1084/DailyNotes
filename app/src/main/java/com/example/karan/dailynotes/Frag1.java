package com.example.karan.dailynotes;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.karan.dailynotes.R.layout.fragment_frag1;


public class Frag1 extends Fragment {
    //DatabaseReference myref;
    EditText e3,e4,e5,e6;
    Button b3,b4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(fragment_frag1,container,false);

        Toast.makeText(getContext(),"11",Toast.LENGTH_SHORT).show();

        /*SharedPreferences sharedPreferences=this.getActivity().getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        String email=sharedPreferences.getString("Email","Cannot Fetch");
        String pass=sharedPreferences.getString("pass","Pass cannot be fetched");*/

        /*e3=(EditText)v.findViewById(R.id.ed3);
        e4=(EditText)v.findViewById(R.id.ed4);
        e5=(EditText)v.findViewById(R.id.ed5);
        e6=(EditText)v.findViewById(R.id.ed6);
        b3=(Button) v.findViewById(R.id.but3);
        b4=(Button) v.findViewById(R.id.but4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });*/


       return v;
    }

}
