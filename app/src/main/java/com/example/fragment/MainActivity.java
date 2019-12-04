package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.Fragments.FirstFragment;
import com.example.fragment.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnFragment;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment= findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                if(status){
                    FirstFragment firstFragment = new FirstFragment();
                    fragmentTransaction.replace(R.id.btnFragmentContainer,firstFragment);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load Second Fragment");
                    status = false;
                }else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.btnFragmentContainer,secondFragment);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load First Fragment");
                    status = true;

                }
            }
        });

    }
}
