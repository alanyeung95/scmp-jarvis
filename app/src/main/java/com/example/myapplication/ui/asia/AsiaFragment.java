package com.example.myapplication.ui.asia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class AsiaFragment extends Fragment {

    private AsiaViewModel asiaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        asiaViewModel =
                ViewModelProviders.of(this).get(AsiaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_china, container, false);
        final TextView textView = root.findViewById(R.id.text_china);
        asiaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}