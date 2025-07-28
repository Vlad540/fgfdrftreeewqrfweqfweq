package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ecd  reason: default package */
public final class ecd implements aj4 {
    public final hcd a;
    public final long b;
    public final Object c;
    public final Continuation o;

    public ecd(hcd hcd, long j, Object obj, zv1 zv1) {
        this.a = hcd;
        this.b = j;
        this.c = obj;
        this.o = zv1;
    }

    public final void dispose() {
        hcd hcd = this.a;
        synchronized (hcd) {
            if (this.b >= hcd.r()) {
                Object[] objArr = hcd.w0;
                if (icd.c(objArr, this.b) == this) {
                    icd.d(objArr, this.b, icd.a);
                    hcd.m();
                }
            }
        }
    }
}
