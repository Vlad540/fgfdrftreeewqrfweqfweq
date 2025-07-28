package defpackage;

import java.util.Objects;

/* renamed from: xee  reason: default package */
public final class xee extends v2 {
    public la9 X;
    public bz5 Y;
    public final h96 Z;
    public ope o;

    public xee(h96 h96, ew0 ew0) {
        super(ew0);
        this.Z = h96;
    }

    public final synchronized void h() {
        ope ope = this.o;
        ope.getClass();
        ope.p();
        xee.super.h();
    }

    public final void i() {
        this.o.getClass();
        ope ope = this.o;
        Objects.requireNonNull(ope);
        ((ew0) this.a).v(new mc4(4, ope));
    }

    public final void k(p96 p96) {
        ((ew0) this.a).v(new my1(this, 4, p96));
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l() {
        /*
            r1 = this;
            ope r1 = r1.o
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0012 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0012 }
            int r0 = r0.size()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r0
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        L_0x0012:
            r0 = move-exception
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xee.l():int");
    }

    public final void r(int i, long j) {
        bz5 bz5 = this.Y;
        bz5.getClass();
        this.X.getClass();
        ((ew0) this.a).v(new wee(this, i, bz5, j));
    }

    public final void release() {
    }

    public final void w(bz5 bz5) {
        this.Y = bz5;
    }

    public final void x(la9 la9) {
        this.X = la9;
    }

    public final void y(na4 na4) {
        this.o = new ope(this.Z, na4, (ew0) this.a);
    }

    public final void z() {
        ((ew0) this.a).v(new mc4(3, this));
    }
}
