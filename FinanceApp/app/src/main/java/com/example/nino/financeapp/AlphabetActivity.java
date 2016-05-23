package com.example.nino.financeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.nino.financeapp.model.FinanceData;

public class AlphabetActivity extends AppCompatActivity {

    private StockAdapter adapter;

    public static final FinanceData[] APPLE_STOCKS = new FinanceData[] {
            new FinanceData(3239318, 139.31),
            new FinanceData(3239318, 137.84),
            new FinanceData(3239318, 136.12),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        adapter = new StockAdapter(this);
        adapter.setItems(APPLE_STOCKS);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
}
}
