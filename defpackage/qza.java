package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: qza  reason: default package */
public final class qza implements kya {
    public eya X;
    public final kya a;
    public final Bundle b;
    public ws6 c;
    public w1d o;

    /* JADX WARNING: type inference failed for: r1v0, types: [kya, n45] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qza(defpackage.n45 r1, defpackage.e8c r2, defpackage.w1d r3, defpackage.eya r4, android.os.Bundle r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.o = r3
            r0.X = r4
            r0.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qza.<init>(n45, e8c, w1d, eya, android.os.Bundle):void");
    }

    public final long A() {
        A1();
        return this.a.A();
    }

    public final void A0(int i, l68 l68) {
        A1();
        a1(i, l68);
    }

    public final void A1() {
        oyb.k(Looper.myLooper() == this.a.z1());
    }

    public final int B() {
        A1();
        return this.a.B();
    }

    public final r8f B0() {
        return this.a.C();
    }

    public final r8f C() {
        A1();
        return B0();
    }

    public final void C0(l68 l68) {
        A1();
        p1(l68);
    }

    public final void D() {
        A1();
        j1();
    }

    public final void D0() {
        A1();
        M0();
    }

    public final void E() {
        A1();
        e1();
    }

    public final boolean E0() {
        A1();
        return this.a.E0();
    }

    public final k20 F() {
        A1();
        return this.a.F();
    }

    public final mpe F0() {
        A1();
        return y0();
    }

    public final jya G() {
        boolean t1 = t1(16);
        boolean t12 = t1(17);
        int p0 = t12 ? p0() : 0;
        l68 R0 = t1 ? R0() : null;
        int B = t12 ? B() : 0;
        long j = 0;
        long k = t1 ? k() : 0;
        if (t1) {
            j = b0();
        }
        return new jya((Object) null, p0, R0, (Object) null, B, k, j, t1 ? o0() : -1, t1 ? O() : -1);
    }

    public final long G0() {
        A1();
        return this.a.G0();
    }

    public final void H(int i, boolean z) {
        A1();
        k1(i, z);
    }

    public final void H0(int i, long j, List list) {
        A1();
        this.a.H0(i, j, list);
    }

    public final uf4 I() {
        A1();
        return this.a.I();
    }

    public final void I0(int i) {
        A1();
        m1(i);
    }

    public final void J() {
        A1();
        P();
    }

    public final void J0() {
        A1();
        g1();
    }

    public final n2d K() {
        boolean t1 = t1(16);
        jya G = G();
        int i = 0;
        boolean z = t1 && n();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -9223372036854775807L;
        long c2 = t1 ? c() : -9223372036854775807L;
        long e0 = t1 ? e0() : 0;
        if (t1) {
            i = x();
        }
        int i2 = i;
        long q = t1 ? q() : 0;
        long p = t1 ? p() : -9223372036854775807L;
        if (t1) {
            j = A();
        }
        return new n2d(G, z, elapsedRealtime, c2, e0, i2, q, p, j, t1 ? G0() : 0);
    }

    public final void K0() {
        A1();
        c1();
    }

    public final boolean K1() {
        A1();
        return this.a.K1();
    }

    public final void L(int i, int i2) {
        A1();
        o1(i, i2);
    }

    public final void L0() {
        A1();
        b1();
    }

    public final boolean M() {
        A1();
        return this.a.M();
    }

    public final void M0() {
        this.a.D0();
    }

    public final void N(int i) {
        A1();
        Q0(i);
    }

    public final z78 N0() {
        A1();
        return this.a.N0();
    }

    public final int O() {
        A1();
        return this.a.O();
    }

    public final void O0(List list) {
        A1();
        this.a.O0(list);
    }

    public final void P() {
        this.a.J();
    }

    public final long P0() {
        A1();
        return this.a.P0();
    }

    public final void Q(mpe mpe) {
        A1();
        w1(mpe);
    }

    public final void Q0(int i) {
        this.a.N(i);
    }

    public final void R(int i) {
        this.a.g0(i);
    }

    public final l68 R0() {
        A1();
        return this.a.R0();
    }

    public final void S(int i) {
        A1();
        Z0(i);
    }

    public final boolean S0() {
        return this.a.z0();
    }

    public final vw3 T() {
        return this.a.l0();
    }

    public final boolean T0() {
        return t1(23) && z0();
    }

    public final void U(int i, int i2) {
        A1();
        this.a.U(i, i2);
    }

    public final void U0(int i, int i2) {
        this.a.t0(i, i2);
    }

    public final void V() {
        A1();
        i1();
    }

    public final void V0() {
        this.a.pause();
    }

    public final l68 W() {
        if (t1(16)) {
            return R0();
        }
        return null;
    }

    public final void W0() {
        this.a.prepare();
    }

    public final PlaybackException X() {
        A1();
        return this.a.X();
    }

    public final void X0() {
        this.a.release();
    }

    public final void Y(boolean z) {
        A1();
        this.a.Y(z);
    }

    public final void Y0(hya hya) {
        this.a.r0(new vw5(this, hya));
    }

    public final void Z(int i) {
        A1();
        f1(i);
    }

    public final void Z0(int i) {
        this.a.S(i);
    }

    public final boolean a() {
        A1();
        return this.a.a();
    }

    public final long a0() {
        A1();
        return this.a.a0();
    }

    public final void a1(int i, l68 l68) {
        this.a.A0(i, l68);
    }

    public final boolean b() {
        A1();
        return this.a.b();
    }

    public final long b0() {
        A1();
        return this.a.b0();
    }

    public final void b1() {
        this.a.L0();
    }

    public final long c() {
        A1();
        return this.a.c();
    }

    public final vje c0() {
        return t1(17) ? x0() : t1(16) ? new pza(this) : vje.a;
    }

    public final void c1() {
        this.a.K0();
    }

    public final wxa d() {
        A1();
        return this.a.d();
    }

    public final void d0(int i, List list) {
        A1();
        this.a.d0(i, list);
    }

    public final void d1(int i, long j) {
        this.a.r(i, j);
    }

    public final float e() {
        A1();
        return this.a.e();
    }

    public final long e0() {
        A1();
        return this.a.e0();
    }

    public final void e1() {
        this.a.E();
    }

    public final void f(wxa wxa) {
        A1();
        this.a.f(wxa);
    }

    public final void f0() {
        A1();
        h1();
    }

    public final void f1(int i) {
        this.a.Z(i);
    }

    public final void g(float f) {
        A1();
        this.a.g(f);
    }

    public final void g0(int i) {
        A1();
        R(i);
    }

    public final void g1() {
        this.a.J0();
    }

    public final int getPlaybackState() {
        A1();
        return this.a.getPlaybackState();
    }

    public final int getRepeatMode() {
        A1();
        return this.a.getRepeatMode();
    }

    public final void h(List list) {
        this.a.w0(list);
    }

    public final spe h0() {
        A1();
        return this.a.h0();
    }

    public final void h1() {
        this.a.f0();
    }

    public final void i() {
        this.a.v();
    }

    public final z78 i0() {
        return t1(18) ? N0() : z78.J;
    }

    public final void i1() {
        this.a.V();
    }

    public final cya j() {
        int i;
        PlaybackException X2 = X();
        int o2 = qa7.o(this);
        eya s = am7.s(this.X, s());
        long j = 128;
        int i2 = 0;
        while (true) {
            long j2 = 0;
            if (i2 < s.e()) {
                int d = s.d(i2);
                if (d == 1) {
                    j2 = 518;
                } else if (d == 2) {
                    j2 = PlaybackStateCompat.ACTION_PREPARE;
                } else if (d == 3) {
                    j2 = 1;
                } else if (d != 31) {
                    switch (d) {
                        case 5:
                            j2 = 256;
                            break;
                        case 6:
                        case 7:
                            j2 = 16;
                            break;
                        case 8:
                        case 9:
                            j2 = 32;
                            break;
                        case 10:
                            j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                            break;
                        case 11:
                            j2 = 8;
                            break;
                        case 12:
                            j2 = 64;
                            break;
                        case 13:
                            j2 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                            break;
                        case 14:
                            j2 = 2621440;
                            break;
                        case 15:
                            j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                            break;
                    }
                } else {
                    j2 = 240640;
                }
                j |= j2;
                i2++;
            } else {
                long j3 = -1;
                long p = t1(17) ? qa7.p(p0()) : -1;
                float f = d().a;
                float f2 = a() ? f : 0.0f;
                Bundle bundle = new Bundle();
                Bundle bundle2 = this.b;
                if (bundle2 != null && !bundle2.isEmpty()) {
                    bundle.putAll(bundle2);
                }
                bundle.putFloat("EXO_SPEED", f);
                l68 W = W();
                if (W != null) {
                    String str = W.a;
                    if (!BuildConfig.FLAVOR.equals(str)) {
                        bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
                    }
                }
                boolean t1 = t1(16);
                if (t1) {
                    j3 = k();
                }
                if (t1) {
                    j2 = e0();
                }
                aya aya = new aya();
                aya.h(o2, j3, f2, SystemClock.elapsedRealtime());
                aya.c(j);
                aya.d(p);
                aya.e(j2);
                aya.g(bundle);
                for (int i3 = 0; i3 < this.c.size(); i3++) {
                    t33 t33 = (t33) this.c.get(i3);
                    v1d v1d = t33.a;
                    if (v1d != null && t33.h && v1d.a == 0 && t33.c(t33, this.o, this.X)) {
                        int i4 = t33.c;
                        Bundle bundle3 = v1d.c;
                        if (i4 != 0) {
                            Bundle bundle4 = new Bundle(bundle3);
                            bundle4.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i4);
                            bundle3 = bundle4;
                        }
                        ci9 ci9 = new ci9(v1d.b, t33.f, t33.d);
                        ci9.i(bundle3);
                        aya.a(ci9.c());
                    }
                }
                if (X2 != null) {
                    int i5 = X2.a;
                    if (i5 == -110) {
                        i = 8;
                    } else if (i5 == -109) {
                        i = 11;
                    } else if (i5 != -6) {
                        i = 1;
                        if (i5 != -2) {
                            if (i5 != 1) {
                                switch (i5) {
                                    case -107:
                                        i = 9;
                                        break;
                                    case -106:
                                        i = 7;
                                        break;
                                    case -105:
                                        i = 6;
                                        break;
                                    case -104:
                                        i = 5;
                                        break;
                                    case -103:
                                        i = 4;
                                        break;
                                    case -102:
                                        i = 3;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                            } else {
                                i = 10;
                            }
                        }
                    } else {
                        i = 2;
                    }
                    aya.f(i, X2.getMessage());
                }
                return aya.b();
            }
        }
    }

    public final boolean j0() {
        A1();
        return this.a.j0();
    }

    public final void j1() {
        this.a.D();
    }

    public final long k() {
        A1();
        return this.a.k();
    }

    public final z78 k0() {
        A1();
        return this.a.k0();
    }

    public final void k1(int i, boolean z) {
        this.a.H(i, z);
    }

    public final int l() {
        A1();
        return this.a.l();
    }

    public final vw3 l0() {
        A1();
        return T();
    }

    public final void l1(boolean z) {
        this.a.q0(z);
    }

    public final void m(Surface surface) {
        A1();
        this.a.m(surface);
    }

    public final void m0(k20 k20, boolean z) {
        this.a.m0(k20, z);
    }

    public final void m1(int i) {
        this.a.I0(i);
    }

    public final boolean n() {
        A1();
        return this.a.n();
    }

    public final void n0(z78 z78) {
        A1();
        s1(z78);
    }

    public final boolean n1() {
        A1();
        return this.a.n1();
    }

    public final fza o() {
        return new fza(X(), 0, K(), G(), G(), 0, d(), getRepeatMode(), E0(), C(), c0(), 0, t1(18) ? k0() : z78.J, t1(22) ? e() : 0.0f, t1(21) ? F() : k20.g, t1(28) ? l0() : vw3.c, I(), t1(23) ? l() : 0, T0(), u(), 1, v0(), getPlaybackState(), a(), b(), i0(), P0(), a0(), y(), t1(30) ? h0() : spe.b, F0());
    }

    public final int o0() {
        A1();
        return this.a.o0();
    }

    public final void o1(int i, int i2) {
        this.a.L(i, i2);
    }

    public final long p() {
        A1();
        return this.a.p();
    }

    public final int p0() {
        A1();
        return this.a.p0();
    }

    public final void p1(l68 l68) {
        this.a.C0(l68);
    }

    public final void pause() {
        A1();
        V0();
    }

    public final void play() {
        A1();
        this.a.play();
    }

    public final void prepare() {
        A1();
        W0();
    }

    public final long q() {
        A1();
        return this.a.q();
    }

    public final void q0(boolean z) {
        A1();
        l1(z);
    }

    public final void q1(l68 l68, long j) {
        this.a.t(l68, j);
    }

    public final void r(int i, long j) {
        A1();
        d1(i, j);
    }

    public final void r0(hya hya) {
        A1();
        Y0(hya);
    }

    public final void r1(float f) {
        this.a.setPlaybackSpeed(f);
    }

    public final void release() {
        A1();
        X0();
    }

    public final eya s() {
        A1();
        return this.a.s();
    }

    public final void s0(List list, int i, int i2) {
        A1();
        this.a.s0(list, i, i2);
    }

    public final void s1(z78 z78) {
        this.a.n0(z78);
    }

    public final void seekTo(long j) {
        A1();
        this.a.seekTo(j);
    }

    public final void setPlaybackSpeed(float f) {
        A1();
        r1(f);
    }

    public final void setRepeatMode(int i) {
        A1();
        u1(i);
    }

    public final void stop() {
        A1();
        x1();
    }

    public final void t(l68 l68, long j) {
        A1();
        q1(l68, j);
    }

    public final void t0(int i, int i2) {
        A1();
        U0(i, i2);
    }

    public final boolean t1(int i) {
        A1();
        return this.a.t1(i);
    }

    public final boolean u() {
        A1();
        return this.a.u();
    }

    public final void u0(int i, int i2, int i3) {
        A1();
        this.a.u0(i, i2, i3);
    }

    public final void u1(int i) {
        this.a.setRepeatMode(i);
    }

    public final void v() {
        A1();
        i();
    }

    public final int v0() {
        A1();
        return this.a.v0();
    }

    public final void v1(boolean z) {
        this.a.w(z);
    }

    public final void w(boolean z) {
        A1();
        v1(z);
    }

    public final void w0(List list) {
        A1();
        h(list);
    }

    public final void w1(mpe mpe) {
        this.a.Q(mpe);
    }

    public final int x() {
        A1();
        return this.a.x();
    }

    public final vje x0() {
        A1();
        return this.a.x0();
    }

    public final void x1() {
        this.a.stop();
    }

    public final long y() {
        A1();
        return this.a.y();
    }

    public final mpe y0() {
        return this.a.F0();
    }

    public final boolean y1() {
        A1();
        return this.a.y1();
    }

    public final void z(hya hya) {
        A1();
        this.a.z(new vw5(this, hya));
    }

    public final boolean z0() {
        A1();
        return S0();
    }

    public final Looper z1() {
        return this.a.z1();
    }
}
