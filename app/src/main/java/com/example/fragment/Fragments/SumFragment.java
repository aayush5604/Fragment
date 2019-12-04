package com.example.fragment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment {
    private Button btnCalculate;
    private EditText etfirstnumber,etsecondnumber;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first,container,false);
        etfirstnumber = view.findViewById(R.id.etfirstnumber);
        etsecondnumber = view.findViewById(R.id.etsecondnumber);
        btnCalculate = view.findViewById(R.id.btncalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnumber = Integer.parseInt(etfirstnumber.getText().toString());
                int secondnumber = Integer.parseInt(etsecondnumber.getText().toString());
                int calculate = firstnumber+secondnumber;
                Toast.makeText(getActivity(),"Sum is :"+ calculate,Toast.LENGTH_SHORT).show();
            }
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sum, container, false);
    }

}
