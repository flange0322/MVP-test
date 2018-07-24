package com.example.cjcucsie.mvprojecttest.View;

public class MyModel implements MyModelInterface {

    private int mNumber_Left;
    private int mNumber_Right;
    private int mSum;
    @Override
    public void setNumber_Left(int number) {
        mNumber_Left = number;
    }

    @Override
    public void setNumber_Right(int number) {
        mNumber_Right = number;
    }

    @Override
    public void add(int number_left, int number_right) {
        mSum += number_left+number_right;
    }

    @Override
    public int getSum() {
        return mSum;
    }
}
