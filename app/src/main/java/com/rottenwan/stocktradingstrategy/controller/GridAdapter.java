package com.rottenwan.stocktradingstrategy.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rottenwan.stocktradingstrategy.R;
import com.rottenwan.stocktradingstrategy.model.GridStrategyData;

import java.util.List;

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

	public void changeList(List<GridStrategyData> list) {
		this.list = list;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.grid_items, null);
			holder.buyB = (TextView) convertView.findViewById(R.id.buy_B);
			holder.buyA = (TextView) convertView.findViewById(R.id.buy_A);
			holder.initPrice = (TextView) convertView.findViewById(R.id.initial_price);
			holder.sellA = (TextView) convertView.findViewById(R.id.sell_A);
			holder.sellB = (TextView) convertView.findViewById(R.id.sell_B);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		GridStrategyData mGridStrategyData = list.get(position);
		holder.buyB.setText(String.valueOf(mGridStrategyData.getBuyB()));
		holder.buyA.setText(String.valueOf(mGridStrategyData.getBuyA()));
		holder.initPrice.setText(String.valueOf(mGridStrategyData.getInitialPrice()));
		holder.sellA.setText(String.valueOf(mGridStrategyData.getSellA()));
		holder.sellB.setText(String.valueOf(mGridStrategyData.getSellB()));
		return convertView;
	}

	public class ViewHolder {
		ImageView icon;
		TextView buyB, buyA, initPrice, sellA, sellB;
	}
}
