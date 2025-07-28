package defpackage;

import android.widget.PopupWindow;

/* renamed from: xz0  reason: default package */
public final /* synthetic */ class xz0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz0 b;

    public /* synthetic */ xz0(zz0 zz0, int i) {
        this.a = i;
        this.b = zz0;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.U0 = null;
                return;
            case 1:
                zz0 zz0 = this.b;
                l31 l31 = zz0.T0;
                if (l31 != null) {
                    boolean z = l31 instanceof h31;
                    dgc dgc = zz0.M0;
                    if (z) {
                        h31 h31 = (h31) l31;
                        zz0.x(dgc, h31.c, h31.f);
                        return;
                    }
                    zz0.A(dgc, l31.a(), l31.getContentDescription());
                    return;
                }
                return;
            default:
                zz0.x(this.b.P0, phc.s0, new hge(ftb.call_more_accessibility));
                return;
        }
    }
}
