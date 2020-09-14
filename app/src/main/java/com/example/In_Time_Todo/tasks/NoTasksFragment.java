package com.example.In_Time_Todo.tasks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.In_Time_Todo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoTasksFragment extends Fragment {

    public NoTasksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_no_tasks, container, false);
    }
}
