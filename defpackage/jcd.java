package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jcd  reason: default package */
public final class jcd extends q3 {
    public long a;
    public zv1 b;

    public final boolean a(p3 p3Var) {
        hcd hcd = (hcd) p3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = hcd.x0;
        if (j < hcd.y0) {
            hcd.y0 = j;
        }
        this.a = j;
        return true;
    }

    public final Continuation[] b(p3 p3Var) {
        long j = this.a;
        this.a = -1;
        this.b = null;
        return ((hcd) p3Var).x(j);
    }
}
