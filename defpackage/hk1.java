package defpackage;

import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: hk1  reason: default package */
public final class hk1 implements dd1 {
    public final /* synthetic */ ik1 a;

    public hk1(ik1 ik1) {
        this.a = ik1;
    }

    public final void G(le1 le1) {
        Object value;
        gk1 gk1 = this.a.c1;
        if (gk1 != null) {
            smc smc = CallScreen.T0;
            grd grd = ((yg1) gk1).a.z0().c.n;
            do {
                value = grd.getValue();
            } while (!grd.b(value, lm1.a((lm1) value, (le1) null, (le1) null, le1, (raf) null, false, (vye) null, 123)));
        }
    }

    public final void P() {
        gk1 gk1 = this.a.c1;
        if (gk1 != null) {
            smc smc = CallScreen.T0;
            ((yg1) gk1).a.z0().Z.c();
        }
    }

    public final void S(le1 le1) {
        gk1 gk1 = this.a.c1;
        if (gk1 != null) {
            smc smc = CallScreen.T0;
            ((yg1) gk1).a.z0().v(le1);
        }
    }

    public final void v(le1 le1, Point point) {
        gk1 gk1 = this.a.c1;
        if (gk1 != null) {
            smc smc = CallScreen.T0;
            ((yg1) gk1).a.z0().x(le1, point);
        }
    }

    public final void y(le1 le1) {
        gk1 gk1 = this.a.c1;
        if (gk1 != null) {
            smc smc = CallScreen.T0;
            yl1 yl1 = ((yg1) gk1).a.z0().Z;
            yl1.getClass();
            if (!le1.equals(le1.c)) {
                po1 po1 = yl1.b;
                if (((zw3) po1.b().getValue()).h) {
                    po1.h(le1, false);
                }
            }
        }
    }
}
