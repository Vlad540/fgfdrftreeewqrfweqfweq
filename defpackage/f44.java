package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: f44  reason: default package */
public final class f44 implements gya, bf8, go4 {
    public final SparseArray X;
    public oz2 Y;
    public u2 Z;
    public final y7e a;
    public final pje b;
    public final sje c;
    public final oz2 o;
    public boolean w0;

    /* JADX WARNING: type inference failed for: r0v2, types: [oz2, java.lang.Object] */
    public f44(y7e y7e) {
        y7e.getClass();
        this.a = y7e;
        int i = mze.a;
        Looper myLooper = Looper.myLooper();
        this.Y = new oz2(myLooper == null ? Looper.getMainLooper() : myLooper, y7e, new t34(8));
        pje pje = new pje();
        this.b = pje;
        this.c = new sje();
        ? obj = new Object();
        obj.b = pje;
        po5 po5 = ws6.b;
        obj.a = e8c.X;
        obj.c = j8c.w0;
        this.o = obj;
        this.X = new SparseArray();
    }

    public final void A(int i, re8 re8) {
        Q(O(i, re8), 1027, new t34(16));
    }

    public final void B(j68 j68, int i) {
        Q(a(), 1, new t34(0));
    }

    public final void C(iya iya, iya iya2, int i) {
        if (i == 1) {
            this.w0 = false;
        }
        u2 u2Var = this.Z;
        u2Var.getClass();
        oz2 oz2 = this.o;
        oz2.d = oz2.g(u2Var, (ws6) oz2.a, (re8) oz2.e, (pje) oz2.b);
        Q(a(), 11, new z34(0));
    }

    public final void D(int i, re8 re8, i78 i78) {
        Q(O(i, re8), 1004, new no3(24));
    }

    public final void E(int i, re8 re8, i78 i78) {
        Q(O(i, re8), 1005, new t34(26));
    }

    public final void F(int i, re8 re8) {
        Q(O(i, re8), 1025, new z34(21));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [re8, v88] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((com.google.android.exoplayer2.ExoPlaybackException) r3).w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(com.google.android.exoplayer2.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0014
            com.google.android.exoplayer2.ExoPlaybackException r3 = (com.google.android.exoplayer2.ExoPlaybackException) r3
            v88 r3 = r3.w0
            if (r3 == 0) goto L_0x0014
            re8 r0 = new re8
            r0.<init>(r3)
            fd r3 = r2.M(r0)
            goto L_0x0018
        L_0x0014:
            fd r3 = r2.a()
        L_0x0018:
            t34 r0 = new t34
            r1 = 18
            r0.<init>((int) r1)
            r1 = 10
            r2.Q(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f44.G(com.google.android.exoplayer2.PlaybackException):void");
    }

    public final void H(int i, re8 re8) {
        Q(O(i, re8), 1026, new z34(14));
    }

    public final void I(voe voe, epe epe) {
        Q(a(), 2, new z34(2));
    }

    public final void J(dya dya) {
        Q(a(), 13, new t34(2));
    }

    public final void K(int i, re8 re8, xi7 xi7, i78 i78) {
        Q(O(i, re8), 1001, new no3(19));
    }

    public final void L(int i, re8 re8, xi7 xi7, i78 i78) {
        Q(O(i, re8), 1000, new t34(24));
    }

    public final fd M(re8 re8) {
        this.Z.getClass();
        uje uje = re8 == null ? null : (uje) ((zs6) this.o.c).get(re8);
        if (re8 != null && uje != null) {
            return N(uje, uje.h(re8.a, this.b).c, re8);
        }
        int p0 = this.Z.p0();
        uje O1 = this.Z.O1();
        if (p0 >= O1.p()) {
            O1 = uje.a;
        }
        return N(O1, p0, (re8) null);
    }

    public final fd N(uje uje, int i, re8 re8) {
        long j;
        uje uje2 = uje;
        int i2 = i;
        re8 re82 = uje.q() ? null : re8;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = uje2.equals(this.Z.O1()) && i2 == this.Z.p0();
        long j2 = 0;
        if (re82 == null || !re82.a()) {
            if (z) {
                j = this.Z.b0();
                return new fd(elapsedRealtime, uje, i, re82, j, this.Z.O1(), this.Z.p0(), (re8) this.o.d, this.Z.k(), this.Z.q());
            } else if (!uje.q()) {
                j2 = mze.M(uje2.n(i2, this.c, 0).B0);
            }
        } else if (z && this.Z.o0() == re82.b && this.Z.O() == re82.c) {
            j2 = this.Z.k();
        }
        j = j2;
        return new fd(elapsedRealtime, uje, i, re82, j, this.Z.O1(), this.Z.p0(), (re8) this.o.d, this.Z.k(), this.Z.q());
    }

    public final fd O(int i, re8 re8) {
        this.Z.getClass();
        uje uje = uje.a;
        if (re8 != null) {
            return ((uje) ((zs6) this.o.c).get(re8)) != null ? M(re8) : N(uje, i, re8);
        }
        uje O1 = this.Z.O1();
        if (i < O1.p()) {
            uje = O1;
        }
        return N(uje, i, (re8) null);
    }

    public final fd P() {
        return M((re8) this.o.f);
    }

    public final void Q(fd fdVar, int i, kh7 kh7) {
        this.X.put(i, fdVar);
        this.Y.m(i, kh7);
    }

    public final void R(u2 u2Var, Looper looper) {
        swb.h(this.Z == null || ((ws6) this.o.a).isEmpty());
        u2Var.getClass();
        this.Z = u2Var;
        this.a.a(looper, (Handler.Callback) null);
        oz2 oz2 = this.Y;
        this.Y = new oz2((CopyOnWriteArraySet) oz2.d, looper, (y7e) oz2.b, new zx1(this, u2Var));
    }

    public final fd a() {
        return M((re8) this.o.d);
    }

    public final void b(int i) {
        Q(a(), 6, new t34(20));
    }

    public final void c(boolean z) {
        fd a2 = a();
        Q(a2, 3, new z34(a2, z));
    }

    public final void d(int i, boolean z) {
        Q(a(), 5, new no3(14));
    }

    public final void e(int i, re8 re8, xi7 xi7, i78 i78) {
        Q(O(i, re8), 1002, new z34(23));
    }

    public final void f(float f) {
        Q(P(), 22, new z34(7));
    }

    public final void g(int i, re8 re8, Exception exc) {
        Q(O(i, re8), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new t34(28));
    }

    public final void h(int i) {
        Q(a(), 4, new t34(7));
    }

    public final void i(int i, boolean z) {
        Q(a(), 30, new z34(11));
    }

    public final void j(boolean z) {
        Q(P(), 23, new z34(17));
    }

    public final void k(List list) {
        Q(a(), 27, new t34(17));
    }

    public final void l(int i, boolean z) {
        Q(a(), -1, new no3(20));
    }

    public final void m(int i, int i2) {
        Q(P(), 24, new no3(25));
    }

    public final void n(boolean z) {
        Q(a(), 7, new z34(25));
    }

    public final void o(sf4 sf4) {
        Q(a(), 29, new z34(9));
    }

    public final void onRepeatModeChanged(int i) {
        Q(a(), 8, new t34(13));
    }

    public final void p() {
        Q(a(), -1, new no3(23));
    }

    public final void q(y78 y78) {
        Q(a(), 14, new no3(16));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [re8, v88] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((com.google.android.exoplayer2.ExoPlaybackException) r3).w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(com.google.android.exoplayer2.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0015
            r0 = r3
            com.google.android.exoplayer2.ExoPlaybackException r0 = (com.google.android.exoplayer2.ExoPlaybackException) r0
            v88 r0 = r0.w0
            if (r0 == 0) goto L_0x0015
            re8 r1 = new re8
            r1.<init>(r0)
            fd r0 = r2.M(r1)
            goto L_0x0019
        L_0x0015:
            fd r0 = r2.a()
        L_0x0019:
            r34 r1 = new r34
            r1.<init>((defpackage.fd) r0, (com.google.android.exoplayer2.PlaybackException) r3)
            r3 = 10
            r2.Q(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f44.r(com.google.android.exoplayer2.PlaybackException):void");
    }

    public final void s(y29 y29) {
        Q(a(), 28, new z34(12));
    }

    public final void t(upe upe) {
        Q(a(), 2, new no3(27));
    }

    public final void u(int i, re8 re8, xi7 xi7, i78 i78, IOException iOException, boolean z) {
        fd O = O(i, re8);
        Q(O, 1003, new q34(O, xi7, i78, iOException, z));
    }

    public final void v(int i, re8 re8) {
        Q(O(i, re8), 1023, new z34(19));
    }

    public final void w(int i, re8 re8, int i2) {
        fd O = O(i, re8);
        Q(O, 1022, new z34(O, i2));
    }

    public final void x(vxa vxa) {
        Q(a(), 12, new no3(17));
    }

    public final void y(int i) {
        u2 u2Var = this.Z;
        u2Var.getClass();
        oz2 oz2 = this.o;
        oz2.d = oz2.g(u2Var, (ws6) oz2.a, (re8) oz2.e, (pje) oz2.b);
        oz2.n(u2Var.O1());
        Q(a(), 0, new z34(4));
    }

    public final void z(q8f q8f) {
        fd P = P();
        Q(P, 25, new c44(P, q8f));
    }
}
