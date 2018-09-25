package com.example.user.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    Button bClose;
    Button bAddNote;


    public BlankFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        bClose = v.findViewById(R.id.fbClose);
        bAddNote = v.findViewById(R.id.fbAddNote);


        bClose.setOnClickListener(new View.OnClickListener() { //button closes this fragment
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .remove(BlankFragment.this).commit();
            }
        });


        bAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Test on",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }






}
