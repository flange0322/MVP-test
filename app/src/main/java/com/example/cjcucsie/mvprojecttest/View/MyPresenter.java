package com.example.cjcucsie.mvprojecttest.View;

public class MyPresenter {
    private MyModel mModel;
    private MyViewinterface mView;
    public MyPresenter(MyViewinterface mView){
        mModel = new MyModel();
        this.mView = mView;
    }

    public void saveData(int number_left,int number_right){
        mModel.setNumber_Left(number_left);
        mModel.setNumber_Right(number_right);
    }
    public void updateData(){
        mView.setSum(mModel.getSum());
    }
}
