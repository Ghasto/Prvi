package com.example.nino.financeapp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Nino on 23. 05. 2016.
 */
public class Main implements Parcelable{
// sploh ne vem če imam lahko dva floata v classu Main ali moram za vsak float narediti čisto nov class?
    private float ask;
    private float bid;

    public Main(float ask, float bid) {
        this.ask = ask;
        this.bid = bid;
    }

    public float getAsk() {
        return ask;
    }

    public float getBid() {
        return bid;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(ask);
        dest.writeFloat(bid);
    }

    public static final Creator<Main> CREATOR = new Creator<Main>() {
        @Override
        public Main createFromParcel(Parcel in) {
            return new Main(in);
        }

        @Override
        public Main[] newArray(int size) {
            return new Main[size];
        }
    };

    }
}