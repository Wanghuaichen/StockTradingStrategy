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
import android.widget.TextView;

import com.rottenwan.stocktradingstrategy.R;
import com.rottenwan.stocktradingstrategy.model.CompoundInterestData;
import com.rottenwan.stocktradingstrategy.utils.LogUtil;

import java.text.DecimalFormat;

/**
 * Created by hewei on 2016-04-04  .*/
public class CompoundInterestFragment extends Fragment{
    private TextView mCompoundInterestResult;

    private CompoundInterestData mCompoundInterestData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCompoundInterestData = CompoundInterestData.getInstance();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_compound_interest, container, false);

        EditText compoundInterestPrincipal = (EditText) v.findViewById(R.id.compound_interest_principal);
        compoundInterestPrincipal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCompoundInterestData.setPrincipal(Integer.parseInt(s.toString()));
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        EditText compoundInterestYear = (EditText) v.findViewById(R.id.compound_interest_year);
        compoundInterestYear.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCompoundInterestData.setYear(Integer.parseInt(s.toString()));
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        EditText compoundInterestRate = (EditText) v.findViewById(R.id.compound_interest_rate);
        compoundInterestRate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCompoundInterestData.setRate(Integer.parseInt(s.toString()));
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        mCompoundInterestResult = (TextView) v.findViewById(R.id.compound_interest_result);
        Button compoundInterestCompute = (Button) v.findViewById(R.id.compound_interest_compute);
        compoundInterestCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int principal = mCompoundInterestData.getPrincipal() * 10000;
                int year = mCompoundInterestData.getYear();
                float rate = (mCompoundInterestData.getRate())/100;
                DecimalFormat df = new DecimalFormat("#.00");
                String sum = df.format(principal * Math.pow((1 + rate), year));

                LogUtil.d("principal = " + principal + ", year = " + year + ", rate = " + rate + ", sum = " +sum);
                mCompoundInterestResult.setText(sum);
            }
        });

        return v;
    }
}
