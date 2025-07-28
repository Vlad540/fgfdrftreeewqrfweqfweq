package defpackage;

import java.util.Queue;

/* renamed from: g1d  reason: default package */
public final class g1d extends f1d {
    public final Queue D0;
    public f1d E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g1d(defpackage.g0d r20) {
        /*
            r19 = this;
            r15 = r19
            r0 = r20
            long r1 = r0.a
            java.lang.Object r3 = r0.m
            r13 = r3
            java.util.Queue r13 = (java.util.Queue) r13
            java.lang.Object r3 = r13.peek()
            f1d r3 = (defpackage.f1d) r3
            sq8 r3 = r3.o
            java.lang.Object r4 = r13.peek()
            f1d r4 = (defpackage.f1d) r4
            vw6 r4 = r4.X
            long r5 = r0.d
            boolean r7 = r0.e
            java.lang.Object r8 = r13.peek()
            f1d r8 = (defpackage.f1d) r8
            int r8 = r8.x0
            java.lang.String r9 = r0.h
            java.lang.Object r10 = r13.peek()
            f1d r10 = (defpackage.f1d) r10
            long r10 = r10.z0
            java.lang.Object r12 = r13.peek()
            f1d r12 = (defpackage.f1d) r12
            java.lang.String r12 = r12.A0
            java.lang.Object r14 = r13.peek()
            f1d r14 = (defpackage.f1d) r14
            r16 = r13
            long r13 = r14.B0
            nd4 r0 = r0.k
            r17 = r0
            r0 = r19
            r18 = r16
            r15 = r17
            r0.<init>(r1, r3, r4, r5, r7, r8, r9, r10, r12, r13, r15)
            r3 = r18
            r0.D0 = r3
            java.lang.Object r1 = r3.poll()
            f1d r1 = (defpackage.f1d) r1
            r0.E0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1d.<init>(g0d):void");
    }

    public final void x() {
        super.x();
        Queue queue = this.D0;
        if (!queue.isEmpty()) {
            g0d g0d = new g0d(this.c, queue, 2);
            g0d.d = this.y0;
            g0d.f = this.B0;
            g0d.e = this.Z;
            g0d.h = this.w0;
            g0d.k = this.C0;
            u().a(new g1d(g0d));
        }
    }

    public final uo8 y() {
        f1d f1d = this.E0;
        f1d.a = this.a;
        uo8 y = f1d.y();
        y.H = this.E0.C0;
        return y;
    }

    public final long z(long j, i22 i22) {
        f1d f1d = this.E0;
        f1d.a = this.a;
        boolean z = f1d instanceof d1d;
        nd4 nd4 = this.C0;
        String str = this.A0;
        long j2 = this.z0;
        long j3 = i22.a;
        if (z) {
            d1d d1d = (d1d) f1d;
            c1d c1d = new c1d(j3, d1d.F0);
            c1d.m = d1d.D0;
            c1d.n = d1d.E0;
            c1d.b = d1d.o;
            c1d.c = d1d.X;
            c1d.e = d1d.Z;
            c1d.o = d1d.G0;
            c1d.h = d1d.w0;
            c1d.d = d1d.Y;
            c1d.i = j2;
            c1d.j = str;
            c1d.g = d1d.x0;
            c1d.f = d1d.B0;
            c1d.k = nd4;
            d1d d1d2 = new d1d(c1d);
            this.E0 = d1d2;
            d1d2.a = this.a;
            return d1d2.z(j, i22);
        } else if (!(f1d instanceof i1d)) {
            return super.z(j, i22);
        } else {
            i1d i1d = (i1d) f1d;
            h1d h1d = new h1d(j3, i1d.D0, i1d.E0);
            h1d.b = i1d.o;
            h1d.c = i1d.X;
            h1d.e = i1d.Z;
            h1d.h = i1d.w0;
            h1d.d = i1d.Y;
            h1d.i = j2;
            h1d.j = str;
            h1d.g = i1d.x0;
            h1d.n = i1d.F0;
            h1d.f = i1d.B0;
            h1d.k = nd4;
            i1d i1d2 = new i1d(h1d);
            this.E0 = i1d2;
            i1d2.a = this.a;
            return i1d2.z(j, i22);
        }
    }
}
