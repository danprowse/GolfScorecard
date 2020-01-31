package com.example.golfscorecard;

public class Hole {
    private String mLabel;
    private int mStrokeCount;

    public Hole(String mLabel, int mStrokeCount) {
        this.mLabel = mLabel;
        this.mStrokeCount = mStrokeCount;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    public int getStrokeCount() {
        return mStrokeCount;
    }

    public void setStrokeCount(int mStrokeCount) {
        this.mStrokeCount = mStrokeCount;
    }
}
