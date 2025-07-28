package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;

public final class ConfirmationDialog extends DialogFragment {
    public boolean F1;

    public final Dialog i1() {
        int i;
        int i2;
        int i3;
        int i4;
        Bundle U0 = U0();
        String string = U0.getString("ru.ok.tamtam.extra.TITLE");
        CharSequence charSequence = U0.getCharSequence("ru.ok.tamtam.extra.CONTENT");
        String string2 = U0.getString("ru.ok.tamtam.extra.POSITIVE_TEXT");
        String string3 = U0.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT");
        if (TextUtils.isEmpty(string) && (i4 = U0.getInt("ru.ok.tamtam.extra.TITLE_RES_ID")) != 0) {
            string = i0(i4);
        }
        if (TextUtils.isEmpty(charSequence) && (i3 = U0.getInt("ru.ok.tamtam.extra.CONTENT_RES_ID")) != 0) {
            charSequence = i0(i3);
        }
        if (TextUtils.isEmpty(string2) && (i2 = U0.getInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID")) != 0) {
            string2 = i0(i2);
        }
        if (TextUtils.isEmpty(string3) && (i = U0.getInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID")) != 0) {
            string3 = i0(i);
        }
        ov7 e = new ov7(V0()).e(string);
        pc pcVar = e.a;
        pcVar.f = charSequence;
        nc3 nc3 = new nc3(this, 0);
        pcVar.g = string2;
        pcVar.h = nc3;
        nc3 nc32 = new nc3(this, 1);
        pcVar.k = string3;
        pcVar.l = nc32;
        return e.create();
    }

    public final void m1() {
        if (!this.F1) {
            Bundle bundle = this.Z;
            Bundle bundle2 = bundle != null ? bundle.getBundle("ru.ok.tamtam.extra.DATA") : null;
            g0().e0("ConfirmationDialog:request_key", jjd.j(new wia[]{new wia("NEGATIVE", pc3.b)}));
            oc3 j0 = j0(true);
            if (j0 == null) {
                oc3 c0 = c0();
                if (c0 instanceof oc3) {
                    c0.getClass();
                } else if (c0 instanceof r5) {
                    Intent intent = new Intent();
                    intent.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                    ((r5) c0).onActivityResult(k0(), 0, intent);
                }
            } else if (j0 instanceof oc3) {
                oc3 oc3 = j0;
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                j0.t0(k0(), 0, intent2);
            }
            this.F1 = true;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m1();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ConfirmationDialog.super.onDismiss(dialogInterface);
        m1();
    }
}
