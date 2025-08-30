package com.example.fragmentass;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStateAdapter {

private FragmentActivity fa;
    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.fa =fragmentActivity;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0)
            return new Fragment1();
        else return ((MainActivity)fa).getFragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
