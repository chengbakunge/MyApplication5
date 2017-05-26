package com.example.administrator.myapplication;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Dialog dialog=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loading(View view){
        dialog=DialogUtil.loadingDialog(this);
        if(dialog!=null&&!dialog.isShowing()){
            dialog.show();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(dialog!=null&&dialog.isShowing()){
            dialog.dismiss();
        }
    }
}
