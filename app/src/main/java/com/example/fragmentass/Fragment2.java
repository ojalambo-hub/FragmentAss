package com.example.fragmentass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentass.databinding.Fragment2Binding;

public class Fragment2 extends Fragment {


    TextView textData;


    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment2Binding binding = Fragment2Binding.inflate(inflater,container,false);
        textData = binding.textTv;
        return binding.getRoot();
    }

public void updateText(String message){
        if (textData != null){
            textData.setText(message);
        }
}
}