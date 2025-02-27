package com.example.StuffyCare.ui.chat_with_experts;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.StuffyCare.R;

public class ChatWithExperts extends Fragment {

    private ChatWithExpertsViewModel mViewModel;

    public static ChatWithExperts newInstance() {
        return new ChatWithExperts();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chat_with_experts_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ChatWithExpertsViewModel.class);
        // TODO: Use the ViewModel
    }

}