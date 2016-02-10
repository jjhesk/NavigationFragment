package com.dmcapps.navigationfragmentexample.MasterDetailExample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dmcapps.navigationfragmentexample.R;
import com.dmcapps.navigationfragmentexample.SingleStackExample.SampleFragment;
import com.dmcapps.navigationfragment.fragments.NavigationFragment;

public class MasterFragment extends NavigationFragment {

    public static MasterFragment newInstance() {
        MasterFragment fragment = new MasterFragment();
        return fragment;
    }

    public MasterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_master, container, false);

        ((Button)view.findViewById(R.id.master_btn_add)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MasterFragment.this.presentFragment(SampleFragment.newInstance("Fragment added to the Stack"));
            }
        });

        ((Button)view.findViewById(R.id.master_btn_replace)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MasterFragment.this.replaceRootFragment(SampleFragment.newInstance("This is a replaced root Fragment"));
            }
        });

        ((Button)view.findViewById(R.id.master_btn_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MasterFragment.this.dismissFragment();
            }
        });

        return view;
    }
}