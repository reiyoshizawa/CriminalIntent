package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        this.mTitle = title;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date date) {
        this.mDate = date;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean solved) {
        this.mSolved = solved;
    }
}
