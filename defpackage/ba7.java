package defpackage;

import java.util.TreeSet;

/* renamed from: ba7  reason: default package */
public final class ba7 {
    public final TreeSet a = new TreeSet(new xb4(6));
    public long b;

    public final void a(bv0 bv0, long j) {
        while (this.b + j > 104857600 && !this.a.isEmpty()) {
            vv0 vv0 = (vv0) this.a.first();
            lgd lgd = (lgd) bv0;
            synchronized (lgd) {
                lgd.j(vv0);
            }
        }
    }

    public final void b(bv0 bv0, vv0 vv0) {
        this.a.add(vv0);
        this.b += vv0.c;
        a(bv0, 0);
    }
}
