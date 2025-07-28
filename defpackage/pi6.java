package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: pi6  reason: default package */
public final class pi6 extends zh0 implements fj6 {
    public final xh6 h;
    public final x3a i;
    public final s59 j;
    public final no4 k;
    public final mk9 l;
    public final boolean m;
    public final int n;
    public final boolean o = false;
    public final f84 p;
    public final long q;
    public final long r = 0;
    public z58 s;
    public cqe t;
    public l68 u;

    static {
        g78.a("media3.exoplayer.hls");
    }

    public pi6(l68 l68, x3a x3a, xh6 xh6, s59 s59, no4 no4, mk9 mk9, f84 f84, long j2, boolean z, int i2) {
        this.u = l68;
        this.s = l68.c;
        this.i = x3a;
        this.h = xh6;
        this.j = s59;
        this.k = no4;
        this.l = mk9;
        this.p = f84;
        this.q = j2;
        this.m = z;
        this.n = i2;
    }

    public static ei6 u(long j2, List list) {
        ei6 ei6 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ei6 ei62 = (ei6) list.get(i2);
            long j3 = ei62.X;
            if (j3 <= j2 && ei62.A0) {
                ei6 = ei62;
            } else if (j3 > j2) {
                break;
            }
        }
        return ei6;
    }

    public final boolean a(l68 l68) {
        l68 i2 = i();
        a68 a68 = i2.b;
        a68.getClass();
        a68 a682 = l68.b;
        return a682 != null && a682.a.equals(a68.a) && a682.e.equals(a68.e) && oze.a(a682.c, a68.c) && i2.c.equals(l68.c);
    }

    public final s88 c(se8 se8, l34 l34, long j2) {
        jn b = b(se8);
        fo4 fo4 = new fo4(this.d.c, 0, se8);
        cqe cqe = this.t;
        cza cza = this.g;
        oyb.l(cza);
        return new ci6(this.h, this.p, this.i, cqe, this.k, fo4, this.l, b, l34, this.j, this.m, this.n, this.o, cza, this.r);
    }

    public final synchronized l68 i() {
        return this.u;
    }

    public final void k() {
        f84 f84 = this.p;
        ul7 ul7 = (ul7) f84.A0;
        if (ul7 != null) {
            ul7.c();
        }
        Uri uri = f84.X;
        if (uri != null) {
            e84 e84 = (e84) f84.b.get(uri);
            e84.b.c();
            IOException iOException = e84.y0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void m(cqe cqe) {
        this.t = cqe;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        cza cza = this.g;
        oyb.l(cza);
        no4 no4 = this.k;
        no4.c(myLooper, cza);
        no4.prepare();
        jn b = b((se8) null);
        a68 a68 = i().b;
        a68.getClass();
        f84 f84 = this.p;
        f84.getClass();
        f84.o = oze.o((Handler.Callback) null);
        f84.z0 = b;
        f84.B0 = this;
        nja nja = new nja(((nz3) ((x3a) f84.w0).b).a(), a68.a, 4, ((bj6) f84.x0).b());
        oyb.k(((ul7) f84.A0) == null);
        ul7 ul7 = new ul7("DefaultHlsPlaylistTracker:MultivariantPlaylist", 1);
        f84.A0 = ul7;
        int i2 = nja.c;
        b.F(new yi7(nja.a, nja.b, ul7.F(nja, f84, ((mk9) f84.y0).k(i2))), i2, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void o(s88 s88) {
        ci6 ci6 = (ci6) s88;
        ci6.b.c.remove(ci6);
        for (pj6 pj6 : ci6.K0) {
            if (pj6.S0) {
                for (nj6 nj6 : pj6.K0) {
                    nj6.h();
                    zn4 zn4 = nj6.h;
                    if (zn4 != null) {
                        zn4.f(nj6.e);
                        nj6.h = null;
                        nj6.g = null;
                    }
                }
            }
            uh6 uh6 = pj6.o;
            e84 e84 = (e84) uh6.g.b.get(uh6.e[uh6.r.i()]);
            if (e84 != null) {
                e84.z0 = false;
            }
            uh6.o = null;
            pj6.y0.E(pj6);
            pj6.G0.removeCallbacksAndMessages((Object) null);
            pj6.W0 = true;
            pj6.H0.clear();
        }
        ci6.H0 = null;
    }

    public final void q() {
        f84 f84 = this.p;
        f84.X = null;
        f84.D0 = null;
        f84.C0 = null;
        f84.Z = -9223372036854775807L;
        ((ul7) f84.A0).E((ij7) null);
        f84.A0 = null;
        HashMap hashMap = f84.b;
        for (e84 e84 : hashMap.values()) {
            e84.b.E((ij7) null);
        }
        f84.o.removeCallbacksAndMessages((Object) null);
        f84.o = null;
        hashMap.clear();
        this.k.release();
    }

    public final synchronized void t(l68 l68) {
        this.u = l68;
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object, lk9] */
    public final void v(ni6 ni6) {
        did did;
        long j2;
        long j3;
        int i2;
        long j4;
        ni6 ni62 = ni6;
        boolean z = ni62.p;
        long j5 = ni62.h;
        long h0 = z ? oze.h0(j5) : -9223372036854775807L;
        int i3 = ni62.d;
        long j6 = (i3 == 2 || i3 == 1) ? h0 : -9223372036854775807L;
        f84 f84 = this.p;
        ((vi6) f84.C0).getClass();
        ? obj = new Object();
        boolean z2 = f84.Y;
        int i4 = i3;
        long j7 = ni62.u;
        ws6 ws6 = ni62.r;
        boolean z3 = ni62.g;
        long j8 = ni62.e;
        if (z2) {
            long j9 = h0;
            long j10 = j5 - f84.Z;
            boolean z4 = ni62.o;
            long j11 = z4 ? j10 + j7 : -9223372036854775807L;
            long S = ni62.p ? oze.S(oze.B(this.q)) - (j5 + j7) : 0;
            long j12 = this.s.a;
            int i5 = (j12 > -9223372036854775807L ? 1 : (j12 == -9223372036854775807L ? 0 : -1));
            li6 li6 = ni62.v;
            if (i5 != 0) {
                j2 = oze.S(j12);
            } else {
                if (j8 != -9223372036854775807L) {
                    j4 = j7 - j8;
                } else {
                    long j13 = li6.d;
                    if (j13 != -9223372036854775807L) {
                        long j14 = j13;
                        if (ni62.n != -9223372036854775807L) {
                            j4 = j14;
                        }
                    }
                    j4 = li6.c;
                    if (j4 == -9223372036854775807L) {
                        j4 = ni62.m * 3;
                    }
                }
                j2 = j4 + S;
            }
            long j15 = j7 + S;
            long k2 = oze.k(j2, S, j15);
            z58 z58 = i().c;
            boolean z5 = false;
            boolean z6 = z58.d == -3.4028235E38f && z58.e == -3.4028235E38f && li6.c == -9223372036854775807L && li6.d == -9223372036854775807L;
            x58 x58 = new x58();
            x58.a = oze.h0(k2);
            float f = 1.0f;
            x58.d = z6 ? 1.0f : this.s.d;
            if (!z6) {
                f = this.s.e;
            }
            x58.e = f;
            z58 z582 = new z58(x58);
            this.s = z582;
            if (j8 == -9223372036854775807L) {
                j8 = j15 - oze.S(z582.a);
            }
            if (z3) {
                j3 = j8;
            } else {
                ei6 u2 = u(j8, ni62.s);
                if (u2 != null) {
                    j3 = u2.X;
                } else if (ws6.isEmpty()) {
                    i2 = i4;
                    j3 = 0;
                    if (i2 == 2 && ni62.f) {
                        z5 = true;
                    }
                    did = new did(j6, j9, j11, ni62.u, j10, j3, true, !z4, z5, obj, i(), this.s);
                } else {
                    ii6 ii6 = (ii6) ws6.get(oze.d(Long.valueOf(j8), ws6, true));
                    ei6 u3 = u(j8, ii6.B0);
                    j3 = u3 != null ? u3.X : ii6.X;
                }
            }
            i2 = i4;
            z5 = true;
            did = new did(j6, j9, j11, ni62.u, j10, j3, true, !z4, z5, obj, i(), this.s);
        } else {
            long j16 = h0;
            long j17 = (j8 == -9223372036854775807L || ws6.isEmpty()) ? 0 : (z3 || j8 == j7) ? j8 : ((ii6) ws6.get(oze.d(Long.valueOf(j8), ws6, true))).X;
            l68 i6 = i();
            long j18 = ni62.u;
            did = new did(j6, j16, j18, j18, 0, j17, true, false, true, obj, i6, (z58) null);
        }
        n(did);
    }
}
