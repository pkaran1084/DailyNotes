package com.example.karan.dailynotes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.ed1);
        b1=findViewById(R.id.but1);

        sp=getSharedPreferences("SaveData",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("Name",e1.getText().toString());
        editor.apply();
        editor.commit();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),Notes.class);
                in.putExtra("myname",e1.getText().toString());
                startActivity(in);

            }
        });
    }
}
