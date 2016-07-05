package com.rottenwan.stocktradingstrategy.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.rottenwan.stocktradingstrategy.R;
import com.rottenwan.stocktradingstrategy.model.GridStrategyData;
import com.rottenwan.stocktradingstrategy.utils.LogUtil;

/**
 * Created by hewei on 2016-04-21  .*/
public class GridStrategyFragment extends Fragment{
    private RadioGroup mRadioGroupGrid;
    private EditText mInvestmentAmount;
    private EditText mInitialPrice;
    private Button mGainGridTable;
    private GridStrategyData mGridStrategyData;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGridStrategyData = GridStrategyData.getInstance();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid_strategy, container, false);
        mRadioGroupGrid = (RadioGroup) v.findViewById(R.id.radio_group_grid);
        mRadioGroupGrid.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.little_grid:
                        mGridStrategyData.setBuyGrid(0.03);
                        mGridStrategyData.setSellGrid(0.05);
                        break;
                    case R.id.small_grid:
                        mGridStrategyData.setBuyGrid(0.05);
                        mGridStrategyData.setSellGrid(0.1);
                        break;
                    case R.id.middle_grid:
                        mGridStrategyData.setBuyGrid(0.08);
                        mGridStrategyData.setSellGrid(0.15);
                        break;
                    case R.id.big_grid:
                        mGridStrategyData.setBuyGrid(0.12);
                        mGridStrategyData.setSellGrid(0.2);
                        break;
                    default:
                        break;
                }
            }
        });

        mInvestmentAmount = (EditText) v.findViewById(R.id.investment_amount);
        mInvestmentAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mGridStrategyData.setInvestmentAmount(Double.parseDouble(s.toString()));
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        mInitialPrice = (EditText) v.findViewById(R.id.initial_price);
        mInitialPrice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mGridStrategyData.setInitialPrice(Double.parseDouble(s.toString()));
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        mGainGridTable = (Button) v.findViewById(R.id.gain_grid_table);
        mGainGridTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double buyGrid = mGridStrategyData.getBuyGrid();
                double sellGrid = mGridStrategyData.getSellGrid();
                double investmentAmount = mGridStrategyData.getInvestmentAmount() * 10000;
                double initialPrice = mGridStrategyData.getInitialPrice();

                LogUtil.d("buyGrid = " + buyGrid + ", sellGrid = " + sellGrid
                    + ", investmentAmount = " + investmentAmount + ", initialPrice = " + initialPrice);
            }
        });

        return v;
    }
}
