package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: g44  reason: default package */
public final class g44 implements hya, cf8, ho4 {
    public final SparseArray X;
    public qh7 Y;
    public kya Z;
    public final z7e a;
    public final qje b;
    public final tje c = new tje();
    public final yd3 o;
    public h8e w0;
    public boolean x0;

    /* JADX WARNING: type inference failed for: r0v2, types: [yd3, java.lang.Object] */
    public g44(z7e z7e) {
        z7e.getClass();
        this.a = z7e;
        this.Y = new qh7(oze.w(), z7e, new t34(3));
        qje qje = new qje();
        this.b = qje;
        ? obj = new Object();
        obj.a = qje;
        po5 po5 = ws6.b;
        obj.b = e8c.X;
        obj.c = j8c.w0;
        this.o = obj;
        this.X = new SparseArray();
    }

    public final void A(int i, se8 se8, i78 i78) {
        gd G = G(i, se8);
        J(G, 1005, new d44(G, i78, 0));
    }

    public final void B(int i, se8 se8) {
        gd G = G(i, se8);
        J(G, 1026, new u34(G, 4));
    }

    public final void C(int i, se8 se8) {
        gd G = G(i, se8);
        J(G, 1023, new u34(G, 6));
    }

    public final void D(int i, se8 se8) {
        gd G = G(i, se8);
        J(G, 1027, new u34(G, 3));
    }

    public final void E(int i, se8 se8, i78 i78) {
        gd G = G(i, se8);
        J(G, 1004, new d44(G, i78, 1));
    }

    public final gd F(vje vje, int i, se8 se8) {
        long j;
        vje vje2 = vje;
        int i2 = i;
        se8 se82 = vje.q() ? null : se8;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = vje2.equals(this.Z.x0()) && i2 == this.Z.p0();
        long j2 = 0;
        if (se82 == null || !se82.b()) {
            if (z) {
                j = this.Z.b0();
                return new gd(elapsedRealtime, vje, i, se82, j, this.Z.x0(), this.Z.p0(), (se8) this.o.d, this.Z.k(), this.Z.q());
            } else if (!vje.q()) {
                j2 = oze.h0(vje2.n(i2, this.c, 0).l);
            }
        } else if (z && this.Z.o0() == se82.b && this.Z.O() == se82.c) {
            j2 = this.Z.k();
        }
        j = j2;
        return new gd(elapsedRealtime, vje, i, se82, j, this.Z.x0(), this.Z.p0(), (se8) this.o.d, this.Z.k(), this.Z.q());
    }

    public final gd G(int i, se8 se8) {
        this.Z.getClass();
        if (se8 != null) {
            return ((vje) ((zs6) this.o.c).get(se8)) != null ? e(se8) : F(vje.a, i, se8);
        }
        vje x02 = this.Z.x0();
        if (i >= x02.p()) {
            x02 = vje.a;
        }
        return F(x02, i, (se8) null);
    }

    public final void H(int i, l68 l68) {
        gd a2 = a();
        J(a2, 1, new p34(a2, l68, i));
    }

    public final gd I() {
        return e((se8) this.o.f);
    }

    public final void J(gd gdVar, int i, lh7 lh7) {
        this.X.put(i, gdVar);
        this.Y.f(i, lh7);
    }

    public final void K(kya kya, Looper looper) {
        oyb.k(this.Z == null || ((ws6) this.o.b).isEmpty());
        this.Z = kya;
        this.w0 = this.a.a(looper, (Handler.Callback) null);
        qh7 qh7 = this.Y;
        Looper looper2 = looper;
        this.Y = new qh7(qh7.d, looper2, qh7.a, new j9(this, 23, kya), qh7.i);
    }

    public final void O(boolean z) {
        gd a2 = a();
        J(a2, 9, new n34(a2, z, 2));
    }

    public final void S(vw3 vw3) {
        J(a(), 27, new t34(21));
    }

    public final void X(spe spe) {
        gd a2 = a();
        J(a2, 2, new j9(a2, 25, spe));
    }

    public final void Y(kya kya, fya fya) {
    }

    public final gd a() {
        return e((se8) this.o.d);
    }

    public final void a0(long j) {
        J(a(), 16, new z34(15));
    }

    public final void b(int i) {
        gd a2 = a();
        J(a2, 6, new p34(a2, i, 0));
    }

    public final void b0(z78 z78) {
        J(a(), 14, new z34(8));
    }

    public final void c(boolean z) {
        gd a2 = a();
        J(a2, 3, new n34(a2, z, 3));
    }

    public final void c0(z78 z78) {
        J(a(), 15, new z34(6));
    }

    public final void d(int i, boolean z) {
        gd a2 = a();
        J(a2, 5, new s34(a2, z, i));
    }

    public final void d0(long j) {
        J(a(), 17, new z34(18));
    }

    public final gd e(se8 se8) {
        this.Z.getClass();
        vje vje = se8 == null ? null : (vje) ((zs6) this.o.c).get(se8);
        if (se8 != null && vje != null) {
            return F(vje, vje.h(se8.a, this.b).c, se8);
        }
        int p0 = this.Z.p0();
        vje x02 = this.Z.x0();
        if (p0 >= x02.p()) {
            x02 = vje.a;
        }
        return F(x02, p0, (se8) null);
    }

    public final void f(float f) {
        gd I = I();
        J(I, 22, new a44(I, f));
    }

    public final void f0(vje vje, int i) {
        kya kya = this.Z;
        kya.getClass();
        yd3 yd3 = this.o;
        yd3.d = yd3.d(kya, (ws6) yd3.b, (se8) yd3.e, (qje) yd3.a);
        yd3.f(kya.x0());
        gd a2 = a();
        J(a2, 0, new p34(a2, i, 5));
    }

    public final void g(int i, se8 se8, yi7 yi7, i78 i78, IOException iOException, boolean z) {
        gd G = G(i, se8);
        J(G, 1003, new q34(G, yi7, i78, iOException, z));
    }

    public final void h(int i) {
        gd a2 = a();
        J(a2, 4, new p34(a2, i, 2));
    }

    public final void i(int i, boolean z) {
        J(a(), 30, new no3(29));
    }

    public final void i0() {
    }

    public final void j(boolean z) {
        gd I = I();
        J(I, 23, new n34(I, z, 1));
    }

    public final void k(List list) {
        J(a(), 27, new t34(1));
    }

    public final void l(int i, boolean z) {
        J(a(), -1, new no3(18));
    }

    public final void m(int i, int i2) {
        gd I = I();
        J(I, 24, new y34(i, i2, I));
    }

    public final void n(boolean z) {
        gd a2 = a();
        J(a2, 7, new n34(a2, z, 0));
    }

    public final void o(boolean z) {
    }

    public final void onRepeatModeChanged(int i) {
        gd a2 = a();
        J(a2, 8, new p34(a2, i, 3));
    }

    public final void p(int i) {
    }

    public final void p0(wxa wxa) {
        gd a2 = a();
        J(a2, 12, new j9(a2, 22, wxa));
    }

    public final void q(jya jya, jya jya2, int i) {
        if (i == 1) {
            this.x0 = false;
        }
        kya kya = this.Z;
        kya.getClass();
        yd3 yd3 = this.o;
        yd3.d = yd3.d(kya, (ws6) yd3.b, (se8) yd3.e, (qje) yd3.a);
        gd a2 = a();
        J(a2, 11, new ic0(a2, i, jya, jya2));
    }

    public final void q0(eya eya) {
        J(a(), 13, new z34(1));
    }

    public final void r(int i, se8 se8, yi7 yi7, i78 i78) {
        gd G = G(i, se8);
        J(G, 1002, new z34(G, yi7, i78, 22));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((androidx.media3.exoplayer.ExoPlaybackException) r3).D0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r0(androidx.media3.common.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r0 == 0) goto L_0x000f
            androidx.media3.exoplayer.ExoPlaybackException r3 = (androidx.media3.exoplayer.ExoPlaybackException) r3
            se8 r3 = r3.D0
            if (r3 == 0) goto L_0x000f
            gd r3 = r2.e(r3)
            goto L_0x0013
        L_0x000f:
            gd r3 = r2.a()
        L_0x0013:
            no3 r0 = new no3
            r1 = 28
            r0.<init>(r1)
            r1 = 10
            r2.J(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g44.r0(androidx.media3.common.PlaybackException):void");
    }

    public final void s(int i, se8 se8, Exception exc) {
        gd G = G(i, se8);
        J(G, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new e44(G, 0, exc));
    }

    public final void s0(a39 a39) {
        gd a2 = a();
        J(a2, 28, new j9(a2, 24, a39));
    }

    public final void t(int i, se8 se8, yi7 yi7, i78 i78) {
        gd G = G(i, se8);
        J(G, 1001, new z34(G, yi7, i78, 24));
    }

    public final void t0(uf4 uf4) {
        J(a(), 29, new t34(9));
    }

    public final void u(int i, se8 se8, int i2) {
        gd G = G(i, se8);
        J(G, 1022, new p34(G, i2, 4));
    }

    public final void u0(long j) {
        J(a(), 18, new z34(16));
    }

    public final void v(k20 k20) {
        gd I = I();
        J(I, 20, new j9(I, 28, k20));
    }

    public final void w(r8f r8f) {
        gd I = I();
        J(I, 25, new j9(I, 29, r8f));
    }

    public final void x(int i, se8 se8, yi7 yi7, i78 i78) {
        gd G = G(i, se8);
        J(G, 1000, new z34(G, yi7, i78, 20));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.media3.exoplayer.ExoPlaybackException) r4).D0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x0(androidx.media3.common.PlaybackException r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r0 == 0) goto L_0x0010
            r0 = r4
            androidx.media3.exoplayer.ExoPlaybackException r0 = (androidx.media3.exoplayer.ExoPlaybackException) r0
            se8 r0 = r0.D0
            if (r0 == 0) goto L_0x0010
            gd r0 = r3.e(r0)
            goto L_0x0014
        L_0x0010:
            gd r0 = r3.a()
        L_0x0014:
            j9 r1 = new j9
            r2 = 26
            r1.<init>(r0, r2, r4)
            r4 = 10
            r3.J(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g44.x0(androidx.media3.common.PlaybackException):void");
    }

    public final void y(int i, se8 se8) {
        gd G = G(i, se8);
        J(G, 1025, new u34(G, 5));
    }

    public final void z(mpe mpe) {
        J(a(), 19, new t34(27));
    }
}
