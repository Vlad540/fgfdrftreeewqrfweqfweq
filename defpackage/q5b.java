package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: q5b  reason: default package */
public final class q5b {
    public final r7e a = new r7e(new qga(23));

    public final xeb a(int i, CharSequence charSequence, boolean z) {
        int t = hr1.t(i);
        if (t == 0 || t == 1) {
            jge jge = new jge(l8a.n1, cs.g0(new Object[]{charSequence}));
            lg7 c = hwf.c();
            c.add(new kc3(j8a.R, new hge(l8a.m1), 1, false));
            c.add(new kc3(j8a.y, new hge(l8a.l1), 3, false));
            return new xeb(jge, (mge) null, hwf.a(c), (Bundle) null);
        } else if (t == 2) {
            jge jge2 = new jge(l8a.j1, cs.g0(new Object[]{charSequence}));
            hge hge = z ? new hge(l8a.g1) : null;
            lg7 c2 = hwf.c();
            c2.add(new kc3(j8a.R, new hge(l8a.h1), 1, false));
            c2.add(new kc3(j8a.y, new hge(l8a.l1), 3, false));
            return new xeb(jge2, hge, hwf.a(c2), (Bundle) null);
        } else if (t == 3) {
            return c();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final kc3 b() {
        return (kc3) this.a.getValue();
    }

    public final xeb c() {
        lge lge = new lge("Unsupported chat type");
        lg7 c = hwf.c();
        c.add(new kc3(j8a.B, new hge(l8a.K0), 1, false));
        c.add(b());
        return new xeb(lge, (mge) null, hwf.a(c), (Bundle) null);
    }
}
