package defpackage;

import android.widget.AutoCompleteTextView;

/* renamed from: jp4  reason: default package */
public final /* synthetic */ class jp4 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ kp4 a;

    public /* synthetic */ jp4(kp4 kp4) {
        this.a = kp4;
    }

    public final void onDismiss() {
        kp4 kp4 = this.a;
        kp4.m = true;
        kp4.o = System.currentTimeMillis();
        kp4.t(false);
    }
}
