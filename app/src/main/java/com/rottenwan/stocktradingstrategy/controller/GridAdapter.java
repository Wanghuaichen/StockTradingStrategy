package com.rottenwan.stocktradingstrategy.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rottenwan.stocktradingstrategy.R;
import com.rottenwan.stocktradingstrategy.model.GridStrategyData;
import com.rottenwan.stocktradingstrategy.utils.StockStrategyApplication;

import java.util.List;

/**
 * Created by hewei on 2016-06-21
 * 自定义Adapter.*/

public class GridAdapter extends BaseAdapter {

	private List<GridStrategyData> list;
	private LayoutInflater inflater;

	public GridAdapter(Context context, List<GridStrategyData> list) {
		inflater = LayoutInflater.from(context);
		this.list = list;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.grid_items, new LinearLayout(StockStrategyApplication.getContext()));
            holder.stock = (TextView) convertView.findViewById(R.id.stock);
			holder.buyB = (TextView) convertView.findViewById(R.id.buyB);
			holder.buyA = (TextView) convertView.findViewById(R.id.buyA);
			holder.initPrice = (TextView) convertView.findViewById(R.id.initPrice);
			holder.sellA = (TextView) convertView.findViewById(R.id.sellA);
			holder.sellB = (TextView) convertView.findViewById(R.id.sellB);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		GridStrategyData mGridStrategyData = list.get(position);
        holder.stock.setText(mGridStrategyData.getStockName());
		holder.buyB.setText(String.valueOf(mGridStrategyData.getBuyB()));
		holder.buyA.setText(String.valueOf(mGridStrategyData.getBuyA()));
		holder.initPrice.setText(String.valueOf(mGridStrategyData.getInitialPrice()));
		holder.sellA.setText(String.valueOf(mGridStrategyData.getSellA()));
		holder.sellB.setText(String.valueOf(mGridStrategyData.getSellB()));
		return convertView;
	}

	public class ViewHolder {
		TextView stock, buyB, buyA, initPrice, sellA, sellB;
	}
}
