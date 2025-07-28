package defpackage;

import android.view.View;

/* renamed from: tz2  reason: default package */
public final /* synthetic */ class tz2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                wz2 wz2 = (wz2) this.b;
                wz2.t(wz2.u());
                return;
            case 1:
                kp4 kp4 = (kp4) this.b;
                kp4.l = z;
                kp4.q();
                if (!z) {
                    kp4.t(false);
                    kp4.m = false;
                    return;
                }
                return;
            default:
                if (!z) {
                    ((y7a) this.b).w0 = false;
                    return;
                }
                return;
        }
    }
}
