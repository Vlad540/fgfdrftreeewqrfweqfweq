package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public class ProgressDialog extends FrgDlgBase {
    public igb J1;

    public final Dialog i1() {
        String string = this.Z.getString("ru.ok.tamtam.extra.TITLE");
        boolean z = this.Z.getBoolean("ru.ok.tamtam.extra.CANCELABLE");
        String string2 = this.Z.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT", "");
        boolean z2 = this.Z.getBoolean("ru.ok.tamtam.extra.INDETERMINATE");
        this.v1 = z;
        Dialog dialog = this.A1;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        if (string2 == null || string2.isEmpty()) {
            Context e0 = e0();
            ov7 ov7 = new ov7(e0);
            ov7.a.m = z;
            udd.N(e0, string, ov7, z2);
            return ov7.create();
        }
        Context e02 = e0();
        ov7 ov72 = new ov7(e02);
        pc pcVar = ov72.a;
        pcVar.m = z;
        h00 h00 = new h00(1);
        pcVar.k = string2;
        pcVar.l = h00;
        udd.N(e02, string, ov72, z2);
        return ov72.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        igb igb = this.J1;
        if (igb != null) {
            igb.b();
        }
    }
}
