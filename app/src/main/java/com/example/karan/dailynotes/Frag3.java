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
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Frag3 extends Fragment {
    EditText e1,e2,e3,e4;
    Button bSave,bNew;
    TextView t;
    int a=2;
    String d1="$",d2="$",d3="$",d4="";
    DatabaseReference myref= FirebaseDatabase.getInstance().getReference();
    DatabaseReference save1=myref.child("1");
    DatabaseReference save2=myref.child("2");
    DatabaseReference save3=myref.child("3");
    DatabaseReference save4=myref.child("4");
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_frag3, container, false);
        e1=v.findViewById(R.id.edd1);
        e2=v.findViewById(R.id.edd2);
        e3=v.findViewById(R.id.edd3);
        e4=v.findViewById(R.id.edd4);
        bSave=v.findViewById(R.id.butSave);
        bNew=v.findViewById(R.id.butNew);
        t=v.findViewById(R.id.ttt);
        SharedPreferences res= getActivity().getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        String name=res.getString("Name","Dats Not Available");
        t.setText(name);

        if(save1!=null){
            save1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    d1=dataSnapshot.getValue(String.class);
                    e1.setText(d1);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
        if(save2!=null){
            save2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    e2.setVisibility(View.VISIBLE);
                    d2=dataSnapshot.getValue(String.class);
                    if(d2.equals("$")){e2.setVisibility(View.GONE);}
                    //else {e2.setVisibility(View.VISIBLE);}
                    e2.setText(d2);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
        if(save3!=null){
            save3.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    e3.setVisibility(View.VISIBLE);
                    d3=dataSnapshot.getValue(String.class);
                    if(d3.equals("$")){e3.setVisibility(View.GONE); }
                    //else {e3.setVisibility(View.VISIBLE);}
                    e3.setText(d3);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
        if(save4!=null){
            save4.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    e4.setVisibility(View.VISIBLE);
                    d4=dataSnapshot.getValue(String.class);
                    if(d4.equals("$")){e4.setVisibility(View.GONE); }
                    //else {e4.setVisibility(View.VISIBLE)};
                    e4.setText(d4);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }





        bNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a==2){
                e2.setVisibility(View.VISIBLE);}
                if (a==3){
                    e3.setVisibility(View.VISIBLE);}
                if (a==4){
                    e4.setVisibility(View.VISIBLE);}
                a++;
            }
        });
        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
                if (e2.getText().toString().equals("") || e2.getText().toString().equals("$"))
                {
                    save2.setValue("$");
                }
                else
                {
                    save2.setValue(e2.getText().toString());
                }
                if (e3.getText().toString().equals("") || e3.getText().toString().equals("$"))
                {
                    save3.setValue("$");
                }
                else
                {
                    save3.setValue(e3.getText().toString());
                }
                if (e4.getText().toString().equals("") || e4.getText().toString().equals("$"))
                {
                    save4.setValue("$");
                }
                else
                {
                    save4.setValue(e4.getText().toString());
                }
                save1.setValue(e1.getText().toString());

            }
        });



        return v;
    }

}
