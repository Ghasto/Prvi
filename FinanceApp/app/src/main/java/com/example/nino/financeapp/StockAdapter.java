package com.example.nino.financeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nino.financeapp.model.FinanceData;

/**
 * Created by Nino on 23. 05. 2016.
 */
public class StockAdapter extends BaseAdapter {
    private FinanceData[] data;
    private final LayoutInflater inflater;

    public StockAdapter(Context context, FinanceData[] data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null){
            view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        FinanceData item = getItem(position);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);


        return view;
    }

    @Override
    public FinanceData getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
        // ali imajo sploh ask, bid in symbol svoj Id? pri weathercatu je bil to Id mesta


    @Override
    public int getCount() {
        if (data != null) {
            return data.length;
        } else {
            return 0;
        }
    }
    }

