package com.example.administrator.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

/**
 * Created by Administrator on 2017/5/26.
 */

public class DialogUtil {
    public  static Dialog loadingDialog(Context context){
        Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.loading_dialog_view);
        dialog.setCancelable(false);
        return dialog;
    }
}
