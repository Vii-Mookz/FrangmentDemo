package com.example.vipavee.frangmentdemo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    private static final String TAG = FragmentB.class.getSimpleName();
    private TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        txtResult = (TextView) view.findViewById(R.id.txtResult);

        return view;

    }

    public void addTwoNumbersInFragmentB(int x,int y) {

        int result = x + y;
        txtResult.setText("Result : " + result);

    }
}
