package com.mgkct.lr22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DynamicFragment extends Fragment {

    private static final String ARG_LAYOUT_ID = "layout_id";

    public static DynamicFragment newInstance(int layoutId) {
        DynamicFragment fragment = new DynamicFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_LAYOUT_ID, layoutId);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int layoutId = getArguments().getInt(ARG_LAYOUT_ID);

        return inflater.inflate(layoutId, container, false);
    }
}
