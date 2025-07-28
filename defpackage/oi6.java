package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: oi6  reason: default package */
public final class oi6 extends yh0 implements ej6 {
    public final wh6 h;
    public final c68 i;
    public final e3 j;
    public final lu7 k;
    public final mo4 l;
    public final lk9 m;
    public final boolean n;
    public final int o;
    public final boolean p = false;
    public final f84 q;
    public final long r;
    public final j68 s;
    public y58 t;
    public bqe u;

    static {
        a55.a("goog.exo.hls");
    }

    public oi6(j68 j68, e3 e3Var, gf6 gf6, lu7 lu7, mo4 mo4, lk9 lk9, f84 f84, long j2, boolean z, int i2) {
        c68 c68 = j68.b;
        c68.getClass();
        this.i = c68;
        this.s = j68;
        this.t = j68.c;
        this.j = e3Var;
        this.h = gf6;
        this.k = lu7;
        this.l = mo4;
        this.m = lk9;
        this.q = f84;
        this.r = j2;
        this.n = z;
        this.o = i2;
    }

    public static di6 p(long j2, List list) {
        di6 di6 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            di6 di62 = (di6) list.get(i2);
            long j3 = di62.X;
            if (j3 <= j2 && di62.A0) {
                di6 = di62;
            } else if (j3 > j2) {
                break;
            }
        }
        return di6;
    }

    public final r88 a(re8 re8, l34 l34, long j2) {
        af8 af8 = new af8((CopyOnWriteArrayList) this.c.d, 0, re8, 0);
        eo4 eo4 = new eo4(this.d.c, 0, re8);
        bqe bqe = this.u;
        bza bza = this.g;
        swb.i(bza);
        return new bi6(this.h, this.q, this.j, bqe, this.l, eo4, this.m, af8, l34, this.k, this.n, this.o, this.p, bza);
    }

    public final j68 f() {
        return this.s;
    }

    public final void g() {
        f84 f84 = this.q;
        jj7 jj7 = (jj7) f84.A0;
        if (jj7 != null) {
            jj7.c();
        }
        Uri uri = f84.X;
        if (uri != null) {
            d84 d84 = (d84) f84.b.get(uri);
            d84.b.c();
            IOException iOException = d84.y0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void i(bqe bqe) {
        this.u = bqe;
        mo4 mo4 = this.l;
        mo4.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        bza bza = this.g;
        swb.i(bza);
        mo4.c(myLooper, bza);
        af8 af8 = new af8((CopyOnWriteArrayList) this.c.d, 0, (re8) null, 0);
        Uri uri = this.i.a;
        f84 f84 = this.q;
        f84.getClass();
        f84.o = mze.m((Handler.Callback) null);
        f84.z0 = af8;
        f84.B0 = this;
        mja mja = new mja(((mz3) ((e3) f84.w0).a).a(), uri, 4, ((aj6) f84.x0).b());
        swb.h(((jj7) f84.A0) == null);
        jj7 jj7 = new jj7("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        f84.A0 = jj7;
        int i2 = mja.c;
        af8.k(new xi7(mja.a, mja.b, jj7.G(mja, f84, ((lk9) f84.y0).h(i2))), i2, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void k(r88 r88) {
        bi6 bi6 = (bi6) r88;
        bi6.b.c.remove(bi6);
        for (oj6 oj6 : bi6.I0) {
            if (oj6.S0) {
                for (mj6 mj6 : oj6.K0) {
                    mj6.i();
                    yn4 yn4 = mj6.h;
                    if (yn4 != null) {
                        yn4.f(mj6.e);
                        mj6.h = null;
                        mj6.g = null;
                    }
                }
            }
            oj6.y0.F(oj6);
            oj6.G0.removeCallbacksAndMessages((Object) null);
            oj6.W0 = true;
            oj6.H0.clear();
        }
        bi6.F0 = null;
    }

    public final void m() {
        f84 f84 = this.q;
        f84.X = null;
        f84.D0 = null;
        f84.C0 = null;
        f84.Z = -9223372036854775807L;
        ((jj7) f84.A0).F((hj7) null);
        f84.A0 = null;
        HashMap hashMap = f84.b;
        for (d84 d84 : hashMap.values()) {
            d84.b.F((hj7) null);
        }
        f84.o.removeCallbacksAndMessages((Object) null);
        f84.o = null;
        hashMap.clear();
        this.l.release();
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [kk9, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.mi6 r42) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            boolean r2 = r1.p
            long r5 = r1.h
            if (r2 == 0) goto L_0x0010
            long r7 = defpackage.mze.M(r5)
            r12 = r7
            goto L_0x0015
        L_0x0010:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0015:
            r2 = 1
            r7 = 2
            int r8 = r1.d
            if (r8 == r7) goto L_0x0024
            if (r8 != r2) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0025
        L_0x0024:
            r10 = r12
        L_0x0025:
            kk9 r25 = new kk9
            f84 r9 = r0.q
            java.lang.Object r14 = r9.C0
            ui6 r14 = (defpackage.ui6) r14
            r14.getClass()
            r25.<init>()
            yh6 r26 = new yh6
            java.util.List r15 = r14.k
            boolean r7 = r14.c
            java.lang.String r2 = r14.a
            java.util.List r3 = r14.b
            java.util.List r4 = r14.e
            r20 = r12
            java.util.List r12 = r14.f
            java.util.List r13 = r14.g
            r39 = r10
            java.util.List r10 = r14.h
            java.util.List r11 = r14.i
            r22 = r8
            vu5 r8 = r14.j
            java.util.Map r0 = r14.l
            java.util.List r14 = r14.m
            r27 = r2
            r28 = r3
            r29 = r4
            r30 = r12
            r31 = r13
            r32 = r10
            r33 = r11
            r34 = r8
            r35 = r15
            r36 = r7
            r37 = r0
            r38 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            boolean r0 = r9.Y
            long r2 = r1.u
            ws6 r4 = r1.r
            boolean r10 = r1.g
            long r11 = r1.e
            if (r0 == 0) goto L_0x01bd
            long r13 = r9.Z
            long r28 = r5 - r13
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x0086
            long r13 = r28 + r2
            r14 = r13
            goto L_0x008b
        L_0x0086:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x008b:
            boolean r9 = r1.p
            if (r9 == 0) goto L_0x00a0
            r13 = r41
            long r7 = r13.r
            long r7 = defpackage.mze.t(r7)
            long r7 = defpackage.mze.D(r7)
            long r5 = r5 + r2
            long r7 = r7 - r5
            r32 = r7
            goto L_0x00a4
        L_0x00a0:
            r13 = r41
            r32 = 0
        L_0x00a4:
            y58 r5 = r13.t
            long r5 = r5.a
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            li6 r7 = r1.v
            if (r9 == 0) goto L_0x00ba
            long r5 = defpackage.mze.D(r5)
            r30 = r5
            goto L_0x00e7
        L_0x00ba:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00c6
            long r8 = r2 - r11
            goto L_0x00e3
        L_0x00c6:
            long r8 = r7.d
            int r18 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r18 == 0) goto L_0x00d7
            r18 = r8
            long r8 = r1.n
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00d7
            r8 = r18
            goto L_0x00e3
        L_0x00d7:
            long r8 = r7.c
            int r26 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r26 == 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            r5 = 3
            long r8 = r1.m
            long r8 = r8 * r5
        L_0x00e3:
            long r8 = r8 + r32
            r30 = r8
        L_0x00e7:
            long r2 = r2 + r32
            r34 = r2
            long r5 = defpackage.mze.k(r30, r32, r34)
            j68 r8 = r13.s
            y58 r8 = r8.c
            float r9 = r8.o
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            r27 = 0
            if (r9 != 0) goto L_0x0117
            float r8 = r8.X
            int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            long r8 = r7.c
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            long r7 = r7.d
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
            r7 = 1
            goto L_0x0119
        L_0x0117:
            r7 = r27
        L_0x0119:
            long r5 = defpackage.mze.M(r5)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x0124
            r37 = r8
            goto L_0x012a
        L_0x0124:
            y58 r9 = r13.t
            float r9 = r9.o
            r37 = r9
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            r38 = r8
            goto L_0x0135
        L_0x012f:
            y58 r7 = r13.t
            float r7 = r7.X
            r38 = r7
        L_0x0135:
            y58 r7 = new y58
            r35 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r30 = r7
            r31 = r5
            r33 = r35
            r30.<init>(r31, r33, r35, r37, r38)
            r13.t = r7
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            long r5 = defpackage.mze.D(r5)
            long r11 = r2 - r5
        L_0x0157:
            if (r10 == 0) goto L_0x015e
            r2 = r11
        L_0x015a:
            r5 = r22
        L_0x015c:
            r4 = 2
            goto L_0x0191
        L_0x015e:
            ws6 r2 = r1.s
            di6 r2 = p(r11, r2)
            if (r2 == 0) goto L_0x0169
            long r2 = r2.X
            goto L_0x015a
        L_0x0169:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0174
            r5 = r22
            r2 = 0
            goto L_0x015c
        L_0x0174:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 1
            int r2 = defpackage.mze.e(r2, r4, r3)
            java.lang.Object r2 = r4.get(r2)
            hi6 r2 = (defpackage.hi6) r2
            ws6 r3 = r2.B0
            di6 r3 = p(r11, r3)
            if (r3 == 0) goto L_0x018e
            long r2 = r3.X
            goto L_0x015a
        L_0x018e:
            long r2 = r2.X
            goto L_0x015a
        L_0x0191:
            if (r5 != r4) goto L_0x019a
            boolean r4 = r1.f
            if (r4 == 0) goto L_0x019a
            r24 = 1
            goto L_0x019c
        L_0x019a:
            r24 = r27
        L_0x019c:
            cid r4 = new cid
            r5 = 1
            r23 = r0 ^ 1
            y58 r0 = r13.t
            r27 = r0
            r22 = 1
            j68 r0 = r13.s
            r26 = r0
            long r0 = r1.u
            r16 = r0
            r9 = r4
            r10 = r39
            r0 = r13
            r12 = r20
            r18 = r28
            r20 = r2
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
            goto L_0x020b
        L_0x01bd:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r41
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01ea
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x01cf
            goto L_0x01ea
        L_0x01cf:
            if (r10 != 0) goto L_0x01e8
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01d6
            goto L_0x01e8
        L_0x01d6:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 1
            int r2 = defpackage.mze.e(r2, r4, r3)
            java.lang.Object r2 = r4.get(r2)
            hi6 r2 = (defpackage.hi6) r2
            long r2 = r2.X
            goto L_0x01ec
        L_0x01e8:
            r2 = r11
            goto L_0x01ec
        L_0x01ea:
            r2 = 0
        L_0x01ec:
            cid r4 = new cid
            r9 = r4
            j68 r5 = r0.s
            r26 = r5
            r27 = 0
            long r5 = r1.u
            r14 = r5
            r16 = r5
            r18 = 0
            r22 = 1
            r23 = 0
            r24 = 1
            r10 = r39
            r12 = r20
            r20 = r2
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
        L_0x020b:
            r0.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi6.q(mi6):void");
    }
}
