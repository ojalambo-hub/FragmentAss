package com.example.fragmentass;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fragmentass.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnFragmentListener{

    ActivityMainBinding binding;

    Fragment2 fragment2;
    public Fragment2 getFragment2() {
        return fragment2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fragment2 = new Fragment2();



        MyAdapter  adapter = new MyAdapter(this);
        binding.vP2.setAdapter(adapter);


        new TabLayoutMediator(binding.TL, binding.vP2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0){
                    tab.setText("Tab-1");
                }else tab.setText("Tab-2");

            }
        }).attach();



    }

    @Override
    public void onEdit(String name) {
        fragment2.updateText(name);
        binding.vP2.setCurrentItem(1,true);
    }
}