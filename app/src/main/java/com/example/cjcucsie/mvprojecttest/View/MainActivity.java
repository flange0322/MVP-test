package com.example.cjcucsie.mvprojecttest.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cjcucsie.mvprojecttest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener ,MyViewinterface{

    MyPresenter presenter;
    EditText mEditText_number_left,mEditText_number_right;
    TextView mTextView_add,mTextView_sum;
    Button mButton_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        presenter = new MyPresenter(this);
    }

    public void initView(){
        mEditText_number_left = findViewById(R.id.editText_number1);
        mEditText_number_right = findViewById(R.id.editText_number2);
        mTextView_add = findViewById(R.id.textView_add);
        mTextView_sum = findViewById(R.id.textView_sum);
        mButton_send = findViewById(R.id.button_send);
        mButton_send.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_send :
                presenter.saveData(getNumber_Left(),getNumber_Right());
                presenter.updateData();
                break;
            default:
                break;
        }
    }

    @Override
    public void setSum(int sum) {
        mTextView_sum.setText(String.valueOf(sum));
    }
    @Override
    public int getNumber_Left() {
        return new Integer(mEditText_number_left.getText().toString());
    }

    @Override
    public int getNumber_Right() {
        return new Integer(mEditText_number_right.getText().toString());
    }
}
