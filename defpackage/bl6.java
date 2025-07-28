package defpackage;

import java.io.IOException;

/* renamed from: bl6  reason: default package */
public final class bl6 extends rde {
    public final /* synthetic */ na1 e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ y5d g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl6(String str, na1 na1, y5d y5d) {
        super(str, true);
        this.e = na1;
        this.g = y5d;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [l7c, java.lang.Object] */
    public final long a() {
        int i;
        long a;
        nl6[] nl6Arr;
        na1 na1 = this.e;
        boolean z = this.f;
        y5d y5d = this.g;
        ? obj = new Object();
        synchronized (((gl6) na1.c).N0) {
            synchronized (((gl6) na1.c)) {
                try {
                    y5d y5d2 = ((gl6) na1.c).H0;
                    if (!z) {
                        y5d y5d3 = new y5d();
                        for (int i2 = 0; i2 < 10; i2++) {
                            if (((1 << i2) & y5d2.a) != 0) {
                                y5d3.b(i2, y5d2.b[i2]);
                            }
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & y5d.a) != 0) {
                                y5d3.b(i3, y5d.b[i3]);
                            }
                        }
                        y5d = y5d3;
                    }
                    obj.a = y5d;
                    a = ((long) y5d.a()) - ((long) y5d2.a());
                    if (a != 0) {
                        if (!((gl6) na1.c).c.isEmpty()) {
                            Object[] array = ((gl6) na1.c).c.values().toArray(new nl6[0]);
                            if (array != null) {
                                nl6Arr = (nl6[]) array;
                                gl6 gl6 = (gl6) na1.c;
                                gl6.H0 = (y5d) obj.a;
                                gl6.z0.c(new zk6(((gl6) na1.c).o + " onSettings", na1, (l7c) obj), 0);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    nl6Arr = null;
                    gl6 gl62 = (gl6) na1.c;
                    gl62.H0 = (y5d) obj.a;
                    gl62.z0.c(new zk6(((gl6) na1.c).o + " onSettings", na1, (l7c) obj), 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ((gl6) na1.c).N0.a((y5d) obj.a);
            } catch (IOException e2) {
                ((gl6) na1.c).a(2, 2, e2);
            }
        }
        nl6[] nl6Arr2 = nl6Arr;
        if (nl6Arr2 == null) {
            return -1;
        }
        for (nl6 nl6 : nl6Arr2) {
            synchronized (nl6) {
                nl6.d += a;
                if (a > 0) {
                    nl6.notifyAll();
                }
            }
        }
        return -1;
    }
}
