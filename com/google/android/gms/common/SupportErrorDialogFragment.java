package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog F1;
    public DialogInterface.OnCancelListener G1;
    public AlertDialog H1;

    public final Dialog i1() {
        Dialog dialog = this.F1;
        if (dialog != null) {
            return dialog;
        }
        this.w1 = false;
        if (this.H1 == null) {
            Context e0 = e0();
            a24.o(e0);
            this.H1 = new AlertDialog.Builder(e0).create();
        }
        return this.H1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.G1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
