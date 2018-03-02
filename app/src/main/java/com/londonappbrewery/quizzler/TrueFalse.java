package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int mQuestionID;

    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse)

    {
        mQuestionID= questionResourceID;
        mAnswer= trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}

