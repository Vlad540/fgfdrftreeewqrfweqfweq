package defpackage;

import java.util.Iterator;

/* renamed from: e52  reason: default package */
public final /* synthetic */ class e52 implements r3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ t52 b;

    public /* synthetic */ e52(t52 t52, int i) {
        this.a = i;
        this.b = t52;
    }

    public final Object get() {
        Long l;
        switch (this.a) {
            case 0:
                t52 t52 = this.b;
                i22 i22 = t52.a;
                if (i22 != null) {
                    return i22;
                }
                j2b j2b = (j2b) t52.n;
                if (j2b.a.s() != -1) {
                    p62 M = t52.M(j2b.a.s());
                    t52.d.put(Long.valueOf(M.b), M);
                    i22 g = t52.g(M, (vo8) null);
                    t52.a = g;
                    return g;
                }
                throw new IllegalStateException("no user id");
            case 1:
                return this.b.a;
            default:
                try {
                    Iterator it = this.b.D(t52.I).iterator();
                    if (!it.hasNext()) {
                        l = null;
                    } else {
                        Long valueOf = Long.valueOf(((i22) it.next()).b.k);
                        while (it.hasNext()) {
                            Long valueOf2 = Long.valueOf(((i22) it.next()).b.k);
                            if (valueOf.compareTo(valueOf2) > 0) {
                                valueOf = valueOf2;
                            }
                        }
                        l = valueOf;
                    }
                    return Long.valueOf(l != null ? l.longValue() : 0);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
        }
    }
}
