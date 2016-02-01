
package com.handsomezhou.qwertysearchdemo.dialog;

import android.app.ProgressDialog;
import android.content.Context;

import com.handsomezhou.qwertysearchdemo.R;

public class BaseProgressDialog extends ProgressDialog {
    public BaseProgressDialog(Context context) {
        super(context, R.style.progress_dialog);

        setCanceledOnTouchOutside(true);
    }

    public void show(String message) {
        this.setMessage(message);
        this.show();
    }

    public void hide() {
        this.dismiss();

    }

}
