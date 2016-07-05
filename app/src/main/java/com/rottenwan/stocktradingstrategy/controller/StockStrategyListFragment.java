package com.rottenwan.stocktradingstrategy.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rottenwan.stocktradingstrategy.R;

/**
 * Created by hewei on 2016-04-21  .*/
public class StockStrategyListFragment extends Fragment {
    private Button mGridButton;
    private Button mCompoundInterestButton;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_stock_strategy_list, container, false);
        mGridButton = (Button) v.findViewById(R.id.grid_button);
        mGridButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), GridStrategyActivity.class);
                startActivity(i);
            }
        });

        mCompoundInterestButton = (Button) v.findViewById(R.id.compound_interest);
        mCompoundInterestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CompoundInterestActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
