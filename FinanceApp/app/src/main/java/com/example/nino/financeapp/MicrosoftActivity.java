package com.example.nino.financeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.nino.financeapp.model.FinanceData;

public class MicrosoftActivity extends AppCompatActivity {

    private StockAdapter adapter;

    public static final FinanceData[] MICROSOFT_STOCKS = new FinanceData[] {
            new FinanceData(3239318, 139.31),
            new FinanceData(3239318, 137.84),
            new FinanceData(3239318, 136.12),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);

        adapter = new StockAdapter(this);
        adapter.setItems(MICROSOFT_STOCKS);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
