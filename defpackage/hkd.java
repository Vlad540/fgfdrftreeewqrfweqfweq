package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: hkd  reason: default package */
public final /* synthetic */ class hkd implements View.OnKeyListener {
    public final /* synthetic */ jkd a;
    public final /* synthetic */ int b;

    public /* synthetic */ hkd(jkd jkd, int i) {
        this.a = jkd;
        this.b = i;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        hc3 hc3 = (hc3) this.a.K0;
        int i2 = this.b;
        int i3 = i2 - 1;
        hx6 H0 = hc3.H0(i2);
        String A = H0 != null ? ((jkd) H0).A() : null;
        if (A == null || A.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            hx6 H02 = hc3.H0(i3);
            if (H02 != null) {
                jkd jkd = (jkd) H02;
                jkd.B("");
                jkd.L0.requestFocus();
            }
        } else if (H0 != null) {
            ((jkd) H0).B("");
        }
        return true;
    }
}
