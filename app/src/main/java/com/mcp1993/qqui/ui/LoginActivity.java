package com.mcp1993.qqui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mcp1993.qqui.MainActivity;
import com.mcp1993.qqui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/11/24 0024.
 */

public class LoginActivity  extends AppCompatActivity {

    @BindView(R.id.et_number)
    EditText etNumber;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.loginBtn)
    Button loginBtn;
    @BindView(R.id.tv_change_password)
    TextView changePas;
    @BindView(R.id.tv_problem)
    TextView showProblem;
    @BindView(R.id.tv_regist)
    TextView regist;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    //单个点击
    @OnClick(R.id.loginBtn)
    public void login(){

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    //多个点击
    @OnClick({R.id.tv_regist,R.id.tv_problem})
    public void dothis(View v){
        switch (v.getId()){
            case R.id.tv_regist:
                Toast.makeText(LoginActivity.this,"前往注册",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_problem:
                Toast.makeText(LoginActivity.this,"登陆遇到问题",Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
