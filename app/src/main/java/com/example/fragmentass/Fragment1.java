package com.example.fragmentass;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentass.databinding.Fragment1Binding;

public class Fragment1 extends Fragment {

    OnFragmentListener listener;

    @Override
    public void onAttach(@NonNull Context context) {


        super.onAttach(context);
            try {
                listener = (OnFragmentListener) getActivity();
            }catch (ClassCastException e){
            throw new ClassCastException("Error in data");
            }
    }



    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment1Binding binding = Fragment1Binding.inflate(inflater,container,false);
        binding.sendBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onEdit(binding.wordET.getText().toString());
            }
        });

        return binding.getRoot();
    }
}