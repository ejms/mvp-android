package com.valmaraz.mvp.view.component;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

import com.valmaraz.mvp.Environment;


public class UIMessage {

    public static void showMessage(View parent, String message) {
        if (Environment.useSnackbar) {
            Snackbar.make(parent, message, Snackbar.LENGTH_LONG).show();
        } else {
            Toast.makeText(parent.getContext(), message, Toast.LENGTH_LONG).show();
        }
    }
}
