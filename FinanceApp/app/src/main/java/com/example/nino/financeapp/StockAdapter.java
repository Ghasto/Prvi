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
    private FinanceData[] items;
    private final LayoutInflater inflater;

    public StockAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }

    public void setItems(FinanceData[] items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null){
            view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        FinanceData item = getItem(position);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        double price = item.getPrice();
        String pricetoString = String.valueOf(price);
        textView.setText(pricetoString);

        return view;
    }

    @Override
    public FinanceData getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public int getCount() {
        if (items == null){
            return 0;
        } else {
            return items.length;
        }
    }
}
