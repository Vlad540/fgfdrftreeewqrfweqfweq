package defpackage;

import java.util.TreeSet;

/* renamed from: ca7  reason: default package */
public final class ca7 implements kv0 {
    public final long a;
    public final TreeSet b = new TreeSet(new xb4(7));
    public long c;

    public ca7(long j) {
        this.a = j;
    }

    public final void a(av0 av0, wv0 wv0) {
        this.b.remove(wv0);
        this.c -= wv0.c;
    }

    public final void b(av0 av0, wv0 wv0) {
        this.b.add(wv0);
        this.c += wv0.c;
        e(av0, 0);
    }

    public final void c(av0 av0, String str, long j, long j2) {
        if (j2 != -1) {
            e(av0, j2);
        }
    }

    public final void d(av0 av0, wv0 wv0, pgd pgd) {
        a(av0, wv0);
        b(av0, pgd);
    }

    public final void e(av0 av0, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            wv0 wv0 = (wv0) this.b.first();
            mgd mgd = (mgd) av0;
            synchronized (mgd) {
                mgd.m(wv0);
            }
        }
    }
}
