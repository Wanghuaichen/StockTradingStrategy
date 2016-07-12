package com.rottenwan.stocktradingstrategy.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hewei on 2016-06-21
 * .*/

public class GridDBHelper extends SQLiteOpenHelper {

    public static final String CREATE_GRID = "create table Grid(" +
            "id integer primary key," +
            "buyB real," +
            "buyA real," +
            "initPrice real," +
            "sellA real," +
            "sellB real)";

    private  Context mContext;

	public GridDBHelper(Context context, String name, CursorFactory factory,
						int version) {
		super(context, name, factory, version);
        mContext = context;
	}

	/**
	 * 用户第一次使用软件时调用的操作，用于获取数据库创建语句（SW）,然后创建数据库 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_GRID);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
}