package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fza  reason: default package */
public final class fza {
    public static final fza F;
    public static final String G = Integer.toString(1, 36);
    public static final String H = Integer.toString(2, 36);
    public static final String I = Integer.toString(3, 36);
    public static final String J = Integer.toString(4, 36);
    public static final String K = Integer.toString(5, 36);
    public static final String L = Integer.toString(6, 36);
    public static final String M = Integer.toString(7, 36);
    public static final String N = Integer.toString(8, 36);
    public static final String O = Integer.toString(9, 36);
    public static final String P = Integer.toString(10, 36);
    public static final String Q = Integer.toString(11, 36);
    public static final String R = Integer.toString(12, 36);
    public static final String S = Integer.toString(13, 36);
    public static final String T = Integer.toString(14, 36);
    public static final String U = Integer.toString(15, 36);
    public static final String V = Integer.toString(16, 36);
    public static final String W = Integer.toString(17, 36);
    public static final String X = Integer.toString(18, 36);
    public static final String Y = Integer.toString(19, 36);
    public static final String Z = Integer.toString(20, 36);
    public static final String a0 = Integer.toString(21, 36);
    public static final String b0 = Integer.toString(22, 36);
    public static final String c0 = Integer.toString(23, 36);
    public static final String d0 = Integer.toString(24, 36);
    public static final String e0 = Integer.toString(25, 36);
    public static final String f0 = Integer.toString(26, 36);
    public static final String g0 = Integer.toString(27, 36);
    public static final String h0 = Integer.toString(28, 36);
    public static final String i0 = Integer.toString(29, 36);
    public static final String j0 = Integer.toString(30, 36);
    public static final String k0 = Integer.toString(31, 36);
    public static final String l0 = Integer.toString(32, 36);
    public final long A;
    public final long B;
    public final long C;
    public final spe D;
    public final mpe E;
    public final PlaybackException a;
    public final int b;
    public final n2d c;
    public final jya d;
    public final jya e;
    public final int f;
    public final wxa g;
    public final int h;
    public final boolean i;
    public final vje j;
    public final int k;
    public final r8f l;
    public final z78 m;
    public final float n;
    public final k20 o;
    public final vw3 p;
    public final uf4 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final z78 z;

    static {
        n2d n2d = n2d.l;
        jya jya = n2d.k;
        wxa wxa = wxa.d;
        r8f r8f = r8f.e;
        oje oje = vje.a;
        z78 z78 = z78.J;
        F = new fza((PlaybackException) null, 0, n2d, jya, jya, 0, wxa, 0, false, r8f, oje, 0, z78, 1.0f, k20.g, vw3.c, uf4.e, 0, false, false, 1, 0, 1, false, false, z78, 5000, 15000, 3000, spe.b, mpe.C);
        int i2 = oze.a;
    }

    public fza(PlaybackException playbackException, int i2, n2d n2d, jya jya, jya jya2, int i3, wxa wxa, int i4, boolean z2, r8f r8f, vje vje, int i5, z78 z78, float f2, k20 k20, vw3 vw3, uf4 uf4, int i6, boolean z3, boolean z4, int i7, int i8, int i9, boolean z5, boolean z6, z78 z782, long j2, long j3, long j4, spe spe, mpe mpe) {
        this.a = playbackException;
        this.b = i2;
        this.c = n2d;
        this.d = jya;
        this.e = jya2;
        this.f = i3;
        this.g = wxa;
        this.h = i4;
        this.i = z2;
        this.l = r8f;
        this.j = vje;
        this.k = i5;
        this.m = z78;
        this.n = f2;
        this.o = k20;
        this.p = vw3;
        this.q = uf4;
        this.r = i6;
        this.s = z3;
        this.t = z4;
        this.u = i7;
        this.x = i8;
        this.y = i9;
        this.v = z5;
        this.w = z6;
        this.z = z782;
        this.A = j2;
        this.B = j3;
        this.C = j4;
        this.D = spe;
        this.E = mpe;
    }

    public static fza r(int i2, Bundle bundle) {
        PlaybackException playbackException;
        oje oje;
        e8c e8c;
        vw3 vw3;
        uf4 b2;
        spe spe;
        e8c e8c2;
        e8c e8c3;
        int i3 = i2;
        Bundle bundle2 = bundle;
        IBinder binder = bundle2.getBinder(l0);
        if (binder instanceof eza) {
            return ((eza) binder).c;
        }
        Bundle bundle3 = bundle2.getBundle(X);
        Throwable th = null;
        if (bundle3 == null) {
            playbackException = null;
        } else {
            String string = bundle3.getString(PlaybackException.Y);
            String string2 = bundle3.getString(PlaybackException.Z);
            String string3 = bundle3.getString(PlaybackException.w0);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    if (Throwable.class.isAssignableFrom(cls)) {
                        th = (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string3});
                    }
                    if (th == null) {
                        th = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    th = new RemoteException(string3);
                }
            }
            Throwable th2 = th;
            int i4 = bundle3.getInt(PlaybackException.o, 1000);
            Bundle bundle4 = bundle3.getBundle(PlaybackException.x0);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th2, i4, bundle4, bundle3.getLong(PlaybackException.X, SystemClock.elapsedRealtime()));
        }
        int i5 = bundle2.getInt(Z, 0);
        Bundle bundle5 = bundle2.getBundle(Y);
        n2d b3 = bundle5 == null ? n2d.l : n2d.b(bundle5);
        Bundle bundle6 = bundle2.getBundle(a0);
        jya c2 = bundle6 == null ? n2d.k : jya.c(bundle6);
        Bundle bundle7 = bundle2.getBundle(b0);
        jya c3 = bundle7 == null ? n2d.k : jya.c(bundle7);
        int i6 = bundle2.getInt(c0, 0);
        Bundle bundle8 = bundle2.getBundle(G);
        wxa wxa = bundle8 == null ? wxa.d : new wxa(bundle8.getFloat(wxa.e, 1.0f), bundle8.getFloat(wxa.f, 1.0f));
        int i7 = bundle2.getInt(H, 0);
        boolean z2 = bundle2.getBoolean(I, false);
        Bundle bundle9 = bundle2.getBundle(J);
        if (bundle9 == null) {
            oje = vje.a;
        } else {
            kce kce = new kce(12);
            IBinder binder2 = bundle9.getBinder(vje.b);
            if (binder2 == null) {
                po5 po5 = ws6.b;
                e8c2 = e8c.X;
            } else {
                e8c2 = gt0.v(kce, it0.a(binder2));
            }
            kce kce2 = new kce(13);
            IBinder binder3 = bundle9.getBinder(vje.c);
            if (binder3 == null) {
                po5 po52 = ws6.b;
                e8c3 = e8c.X;
            } else {
                e8c3 = gt0.v(kce2, it0.a(binder3));
            }
            int[] intArray = bundle9.getIntArray(vje.d);
            if (intArray == null) {
                int i8 = e8c2.o;
                int[] iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
                intArray = iArr;
            }
            oje = new rje(e8c2, e8c3, intArray);
        }
        int i10 = bundle2.getInt(k0, 0);
        Bundle bundle10 = bundle2.getBundle(K);
        r8f r8f = bundle10 == null ? r8f.e : new r8f(bundle10.getFloat(r8f.i, 1.0f), bundle10.getInt(r8f.f, 0), bundle10.getInt(r8f.g, 0), bundle10.getInt(r8f.h, 0));
        Bundle bundle11 = bundle2.getBundle(L);
        z78 b4 = bundle11 == null ? z78.J : z78.b(bundle11);
        float f2 = bundle2.getFloat(M, 1.0f);
        Bundle bundle12 = bundle2.getBundle(N);
        k20 a2 = bundle12 == null ? k20.g : k20.a(bundle12);
        Bundle bundle13 = bundle2.getBundle(d0);
        if (bundle13 == null) {
            vw3 = vw3.c;
        } else {
            ArrayList parcelableArrayList = bundle13.getParcelableArrayList(vw3.d);
            if (parcelableArrayList == null) {
                e8c = e8c.X;
            } else {
                ts6 i11 = ws6.i();
                for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                    Bundle bundle14 = (Bundle) parcelableArrayList.get(i12);
                    bundle14.getClass();
                    i11.a(uw3.a(bundle14));
                }
                e8c = i11.j();
            }
            vw3 = new vw3(bundle13.getLong(vw3.e), e8c);
        }
        vw3 vw32 = vw3;
        Bundle bundle15 = bundle2.getBundle(O);
        if (bundle15 == null) {
            b2 = uf4.e;
        } else {
            int i13 = bundle15.getInt(uf4.f, 0);
            int i14 = bundle15.getInt(uf4.g, 0);
            int i15 = bundle15.getInt(uf4.h, 0);
            String string4 = bundle15.getString(uf4.i);
            mu0 mu0 = new mu0(i13);
            mu0.c = i14;
            mu0.d = i15;
            oyb.d(i13 != 0 || string4 == null);
            mu0.e = string4;
            b2 = mu0.b();
        }
        uf4 uf4 = b2;
        int i16 = bundle2.getInt(P, 0);
        boolean z3 = bundle2.getBoolean(Q, false);
        boolean z4 = bundle2.getBoolean(R, false);
        int i17 = bundle2.getInt(S, 1);
        int i18 = bundle2.getInt(T, 0);
        int i19 = bundle2.getInt(U, 1);
        boolean z5 = bundle2.getBoolean(V, false);
        boolean z6 = bundle2.getBoolean(W, false);
        Bundle bundle16 = bundle2.getBundle(e0);
        z78 b5 = bundle16 == null ? z78.J : z78.b(bundle16);
        long j2 = 0;
        long j3 = bundle2.getLong(f0, i3 < 4 ? 0 : 5000);
        long j4 = bundle2.getLong(g0, i3 < 4 ? 0 : 15000);
        if (i3 >= 4) {
            j2 = 3000;
        }
        long j5 = bundle2.getLong(h0, j2);
        Bundle bundle17 = bundle2.getBundle(j0);
        if (bundle17 == null) {
            spe = spe.b;
        } else {
            ArrayList parcelableArrayList2 = bundle17.getParcelableArrayList(spe.c);
            spe = new spe(parcelableArrayList2 == null ? e8c.X : gt0.v(new kce(24), parcelableArrayList2));
        }
        Bundle bundle18 = bundle2.getBundle(i0);
        return new fza(playbackException, i5, b3, c2, c3, i6, wxa, i7, z2, r8f, oje, i10, b4, f2, a2, vw32, uf4, i16, z3, z4, i17, i18, i19, z5, z6, b5, j3, j4, j5, spe, bundle18 == null ? mpe.C : mpe.b(bundle18));
    }

    public final fza a(k20 k20) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, k20, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza b(spe spe) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, spe, this.E);
    }

    public final fza c(int i2, boolean z2) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, i2, z2, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza d(int i2, int i3, boolean z2) {
        boolean z3 = false;
        boolean z4 = this.y == 3 && z2 && i3 == 0;
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        if (q2 || n2d.a.b < vje.p()) {
            z3 = true;
        }
        oyb.k(z3);
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z2, i2, i3, this.y, z4, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza e(wxa wxa) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, wxa, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza f(int i2, PlaybackException playbackException) {
        boolean z2 = false;
        boolean z3 = i2 == 3 && this.t && this.x == 0;
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        if (q2 || n2d.a.b < vje.p()) {
            z2 = true;
        }
        oyb.k(z2);
        fza fza = r4;
        fza fza2 = new fza(playbackException, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, i2, z3, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        return fza;
    }

    public final fza g(z78 z78) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, z78, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza h(jya jya, jya jya2, int i2) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, jya, jya2, i2, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza i(int i2) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, i2, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza j(n2d n2d) {
        vje vje = this.j;
        oyb.k(vje.q() || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza k(boolean z2) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, z2, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final fza l(vje vje) {
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        fza fza = r2;
        fza fza2 = new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        return fza;
    }

    public final fza m(bkb bkb, int i2) {
        jya jya = r14;
        n2d n2d = this.c;
        jya jya2 = n2d.a;
        jya jya3 = new jya(jya2.a, i2, jya2.c, jya2.d, jya2.e, jya2.f, jya2.g, jya2.h, jya2.i);
        n2d n2d2 = r1;
        n2d n2d3 = new n2d(jya, n2d.b, n2d.c, n2d.d, n2d.e, n2d.f, n2d.g, n2d.h, n2d.i, n2d.j);
        oyb.k(bkb.q() || n2d2.a.b < bkb.p());
        n2d n2d4 = n2d2;
        spe spe = this.D;
        mpe mpe = this.E;
        return new fza(this.a, this.b, n2d4, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bkb, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, spe, mpe);
    }

    public final fza n(vje vje, n2d n2d, int i2) {
        boolean z2;
        if (vje.q()) {
            n2d n2d2 = n2d;
        } else if (n2d.a.b >= vje.p()) {
            z2 = false;
            oyb.k(z2);
            spe spe = this.D;
            mpe mpe = this.E;
            return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, i2, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, spe, mpe);
        }
        z2 = true;
        oyb.k(z2);
        spe spe2 = this.D;
        mpe mpe2 = this.E;
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, i2, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, spe2, mpe2);
    }

    public final fza o(mpe mpe) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, mpe);
    }

    public final fza p(float f2) {
        vje vje = this.j;
        boolean q2 = vje.q();
        n2d n2d = this.c;
        oyb.k(q2 || n2d.a.b < vje.p());
        return new fza(this.a, this.b, n2d, this.d, this.e, this.f, this.g, this.h, this.i, this.l, vje, this.k, this.m, f2, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fza q(defpackage.eya r41, boolean r42, boolean r43) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = 16
            boolean r2 = r1.a(r2)
            r3 = 17
            boolean r3 = r1.a(r3)
            n2d r4 = r0.c
            n2d r8 = r4.a(r2, r3)
            jya r5 = r0.d
            jya r9 = r5.b(r2, r3)
            jya r5 = r0.e
            jya r10 = r5.b(r2, r3)
            r5 = 1
            vje r6 = r0.j
            r7 = 0
            if (r3 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            boolean r2 = r6.q()
            if (r2 != 0) goto L_0x007c
            jya r2 = r4.a
            int r2 = r2.b
            int r3 = r6.p()
            if (r3 != r5) goto L_0x003b
            goto L_0x0079
        L_0x003b:
            tje r3 = new tje
            r3.<init>()
            r11 = 0
            tje r2 = r6.n(r2, r3, r11)
            ts6 r3 = defpackage.ws6.i()
            int r4 = r2.n
        L_0x004c:
            int r11 = r2.o
            if (r4 > r11) goto L_0x0061
            qje r11 = new qje
            r11.<init>()
            qje r11 = r6.g(r4, r11, r5)
            r11.c = r7
            r3.a(r11)
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0061:
            int r4 = r2.n
            int r11 = r11 - r4
            r2.o = r11
            r2.n = r7
            rje r6 = new rje
            e8c r2 = defpackage.ws6.n(r2)
            e8c r3 = r3.j()
            int[] r4 = new int[]{r7}
            r6.<init>(r2, r3, r4)
        L_0x0079:
            r16 = r6
            goto L_0x0084
        L_0x007c:
            if (r42 != 0) goto L_0x0080
            if (r3 != 0) goto L_0x0079
        L_0x0080:
            oje r2 = defpackage.vje.a
            r16 = r2
        L_0x0084:
            r2 = 18
            boolean r3 = r1.a(r2)
            if (r3 != 0) goto L_0x0091
            z78 r3 = defpackage.z78.J
        L_0x008e:
            r18 = r3
            goto L_0x0094
        L_0x0091:
            z78 r3 = r0.m
            goto L_0x008e
        L_0x0094:
            r3 = 22
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00a1
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x009e:
            r19 = r3
            goto L_0x00a4
        L_0x00a1:
            float r3 = r0.n
            goto L_0x009e
        L_0x00a4:
            r3 = 21
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00b1
            k20 r3 = defpackage.k20.g
        L_0x00ae:
            r20 = r3
            goto L_0x00b4
        L_0x00b1:
            k20 r3 = r0.o
            goto L_0x00ae
        L_0x00b4:
            r3 = 28
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00c1
            vw3 r3 = defpackage.vw3.c
        L_0x00be:
            r21 = r3
            goto L_0x00c4
        L_0x00c1:
            vw3 r3 = r0.p
            goto L_0x00be
        L_0x00c4:
            r3 = 23
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00d1
            r23 = r7
            r24 = r23
            goto L_0x00d9
        L_0x00d1:
            int r3 = r0.r
            boolean r4 = r0.s
            r23 = r3
            r24 = r4
        L_0x00d9:
            boolean r2 = r1.a(r2)
            if (r2 != 0) goto L_0x00e4
            z78 r2 = defpackage.z78.J
        L_0x00e1:
            r31 = r2
            goto L_0x00e7
        L_0x00e4:
            z78 r2 = r0.z
            goto L_0x00e1
        L_0x00e7:
            if (r43 != 0) goto L_0x00f7
            r2 = 30
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            spe r1 = r0.D
        L_0x00f4:
            r38 = r1
            goto L_0x00fa
        L_0x00f7:
            spe r1 = defpackage.spe.b
            goto L_0x00f4
        L_0x00fa:
            boolean r1 = r16.q()
            if (r1 != 0) goto L_0x010c
            jya r1 = r8.a
            int r1 = r1.b
            int r2 = r16.p()
            if (r1 >= r2) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r5 = r7
        L_0x010c:
            defpackage.oyb.k(r5)
            fza r1 = new fza
            r5 = r1
            long r2 = r0.C
            r36 = r2
            mpe r2 = r0.E
            r39 = r2
            androidx.media3.common.PlaybackException r6 = r0.a
            int r7 = r0.b
            int r11 = r0.f
            wxa r12 = r0.g
            int r13 = r0.h
            boolean r14 = r0.i
            r8f r15 = r0.l
            int r2 = r0.k
            r17 = r2
            uf4 r2 = r0.q
            r22 = r2
            boolean r2 = r0.t
            r25 = r2
            int r2 = r0.u
            r26 = r2
            int r2 = r0.x
            r27 = r2
            int r2 = r0.y
            r28 = r2
            boolean r2 = r0.v
            r29 = r2
            boolean r2 = r0.w
            r30 = r2
            long r2 = r0.A
            r32 = r2
            long r2 = r0.B
            r34 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fza.q(eya, boolean, boolean):fza");
    }

    public final l68 s() {
        vje vje = this.j;
        if (vje.q()) {
            return null;
        }
        return vje.n(this.c.a.b, new tje(), 0).c;
    }

    public final Bundle t(int i2) {
        long j2;
        long j3;
        int i3;
        Bundle bundle;
        qje qje;
        int i4;
        long j4;
        l68[] l68Arr;
        Bundle bundle2;
        int i5 = i2;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            bundle3.putBundle(X, playbackException.c());
        }
        int i6 = this.b;
        if (i6 != 0) {
            bundle3.putInt(Z, i6);
        }
        n2d n2d = this.c;
        if (i5 < 3 || !n2d.equals(n2d.l)) {
            bundle3.putBundle(Y, n2d.c(i5));
        }
        jya jya = this.d;
        if (i5 < 3 || !n2d.k.a(jya)) {
            bundle3.putBundle(a0, jya.d(i5));
        }
        jya jya2 = this.e;
        if (i5 < 3 || !n2d.k.a(jya2)) {
            bundle3.putBundle(b0, jya2.d(i5));
        }
        int i7 = this.f;
        if (i7 != 0) {
            bundle3.putInt(c0, i7);
        }
        wxa wxa = wxa.d;
        wxa wxa2 = this.g;
        if (!wxa2.equals(wxa)) {
            Bundle bundle4 = new Bundle();
            bundle4.putFloat(wxa.e, wxa2.a);
            bundle4.putFloat(wxa.f, wxa2.b);
            bundle3.putBundle(G, bundle4);
        }
        int i8 = this.h;
        if (i8 != 0) {
            bundle3.putInt(H, i8);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle3.putBoolean(I, z2);
        }
        oje oje = vje.a;
        vje vje = this.j;
        boolean z3 = false;
        long j5 = 0;
        if (!vje.equals(oje)) {
            ArrayList arrayList = new ArrayList();
            int p2 = vje.p();
            tje tje = new tje();
            int i9 = 0;
            while (true) {
                j3 = -9223372036854775807L;
                if (i9 >= p2) {
                    break;
                }
                tje n2 = vje.n(i9, tje, j5);
                n2.getClass();
                Bundle bundle5 = new Bundle();
                if (!l68.g.equals(n2.c)) {
                    bundle5.putBundle(tje.t, n2.c.d(false));
                }
                long j6 = n2.e;
                if (j6 != -9223372036854775807L) {
                    bundle5.putLong(tje.u, j6);
                }
                long j7 = n2.f;
                if (j7 != -9223372036854775807L) {
                    bundle5.putLong(tje.v, j7);
                }
                long j8 = n2.g;
                if (j8 != -9223372036854775807L) {
                    bundle5.putLong(tje.w, j8);
                }
                boolean z4 = n2.h;
                if (z4) {
                    bundle5.putBoolean(tje.x, z4);
                }
                boolean z5 = n2.i;
                if (z5) {
                    bundle5.putBoolean(tje.y, z5);
                }
                z58 z58 = n2.j;
                if (z58 != null) {
                    bundle5.putBundle(tje.z, z58.c());
                }
                boolean z6 = n2.k;
                if (z6) {
                    bundle5.putBoolean(tje.A, z6);
                }
                long j9 = n2.l;
                if (j9 != 0) {
                    bundle5.putLong(tje.B, j9);
                }
                long j10 = n2.m;
                if (j10 != -9223372036854775807L) {
                    bundle5.putLong(tje.C, j10);
                }
                int i10 = n2.n;
                if (i10 != 0) {
                    bundle5.putInt(tje.D, i10);
                }
                int i11 = n2.o;
                if (i11 != 0) {
                    bundle5.putInt(tje.E, i11);
                }
                long j11 = n2.p;
                if (j11 != 0) {
                    bundle5.putLong(tje.F, j11);
                }
                arrayList.add(bundle5);
                i9++;
                j5 = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            int i12 = vje.i();
            qje qje2 = new qje();
            int i13 = 0;
            while (i13 < i12) {
                qje g2 = vje.g(i13, qje2, z3);
                g2.getClass();
                Bundle bundle6 = new Bundle();
                int i14 = g2.c;
                if (i14 != 0) {
                    bundle6.putInt(qje.h, i14);
                }
                int i15 = i12;
                qje qje3 = qje2;
                long j12 = g2.d;
                if (j12 != j3) {
                    bundle6.putLong(qje.i, j12);
                }
                long j13 = g2.e;
                if (j13 != 0) {
                    bundle6.putLong(qje.j, j13);
                }
                boolean z7 = g2.f;
                if (z7) {
                    bundle6.putBoolean(qje.k, z7);
                }
                if (!g2.g.equals(w8.g)) {
                    w8 w8Var = g2.g;
                    w8Var.getClass();
                    Bundle bundle7 = new Bundle();
                    ArrayList arrayList3 = new ArrayList();
                    u8[] u8VarArr = w8Var.f;
                    int length = u8VarArr.length;
                    i4 = i15;
                    int i16 = 0;
                    while (i16 < length) {
                        int i17 = length;
                        u8 u8Var = u8VarArr[i16];
                        u8Var.getClass();
                        u8[] u8VarArr2 = u8VarArr;
                        Bundle bundle8 = new Bundle();
                        qje qje4 = qje3;
                        bundle8.putLong(u8.j, u8Var.a);
                        bundle8.putInt(u8.k, u8Var.b);
                        bundle8.putInt(u8.q, u8Var.c);
                        bundle8.putParcelableArrayList(u8.l, new ArrayList(Arrays.asList(u8Var.d)));
                        ArrayList arrayList4 = new ArrayList();
                        l68[] l68Arr2 = u8Var.e;
                        int length2 = l68Arr2.length;
                        Bundle bundle9 = bundle3;
                        int i18 = 0;
                        while (i18 < length2) {
                            int i19 = length2;
                            l68 l68 = l68Arr2[i18];
                            if (l68 == null) {
                                bundle2 = null;
                                l68Arr = l68Arr2;
                            } else {
                                l68Arr = l68Arr2;
                                bundle2 = l68.d(true);
                            }
                            arrayList4.add(bundle2);
                            i18++;
                            length2 = i19;
                            l68Arr2 = l68Arr;
                        }
                        bundle8.putParcelableArrayList(u8.r, arrayList4);
                        bundle8.putIntArray(u8.m, u8Var.f);
                        bundle8.putLongArray(u8.n, u8Var.g);
                        bundle8.putLong(u8.o, u8Var.h);
                        bundle8.putBoolean(u8.p, u8Var.i);
                        arrayList3.add(bundle8);
                        i16++;
                        int i20 = i2;
                        length = i17;
                        u8VarArr = u8VarArr2;
                        qje3 = qje4;
                        bundle3 = bundle9;
                    }
                    bundle = bundle3;
                    qje = qje3;
                    if (!arrayList3.isEmpty()) {
                        bundle7.putParcelableArrayList(w8.i, arrayList3);
                    }
                    long j14 = w8Var.c;
                    if (j14 != 0) {
                        bundle7.putLong(w8.j, j14);
                    }
                    long j15 = w8Var.d;
                    j4 = -9223372036854775807L;
                    if (j15 != -9223372036854775807L) {
                        bundle7.putLong(w8.k, j15);
                    }
                    int i21 = w8Var.e;
                    if (i21 != 0) {
                        bundle7.putInt(w8.l, i21);
                    }
                    bundle6.putBundle(qje.l, bundle7);
                } else {
                    bundle = bundle3;
                    i4 = i15;
                    qje = qje3;
                    j4 = -9223372036854775807L;
                }
                arrayList2.add(bundle6);
                i13++;
                int i22 = i2;
                j3 = j4;
                i12 = i4;
                qje2 = qje;
                bundle3 = bundle;
                z3 = false;
            }
            Bundle bundle10 = bundle3;
            j2 = 0;
            int[] iArr = new int[p2];
            boolean z8 = true;
            if (p2 > 0) {
                i3 = 0;
                iArr[0] = vje.a(true);
            } else {
                i3 = 0;
            }
            int i23 = 1;
            while (i23 < p2) {
                iArr[i23] = vje.e(iArr[i23 - 1], i3, z8);
                i23++;
                z8 = true;
                i3 = 0;
            }
            Bundle bundle11 = new Bundle();
            bundle11.putBinder(vje.b, new it0(arrayList));
            bundle11.putBinder(vje.c, new it0(arrayList2));
            bundle11.putIntArray(vje.d, iArr);
            bundle3 = bundle10;
            bundle3.putBundle(J, bundle11);
        } else {
            j2 = 0;
        }
        int i24 = this.k;
        if (i24 != 0) {
            bundle3.putInt(k0, i24);
        }
        r8f r8f = r8f.e;
        r8f r8f2 = this.l;
        if (!r8f2.equals(r8f)) {
            Bundle bundle12 = new Bundle();
            bundle12.putInt(r8f.f, r8f2.a);
            bundle12.putInt(r8f.g, r8f2.b);
            bundle12.putInt(r8f.h, r8f2.c);
            bundle12.putFloat(r8f.i, r8f2.d);
            bundle3.putBundle(K, bundle12);
        }
        z78 z78 = z78.J;
        z78 z782 = this.m;
        if (!z782.equals(z78)) {
            bundle3.putBundle(L, z782.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle3.putFloat(M, f2);
        }
        k20 k20 = k20.g;
        k20 k202 = this.o;
        if (!k202.equals(k20)) {
            bundle3.putBundle(N, k202.c());
        }
        vw3 vw3 = vw3.c;
        vw3 vw32 = this.p;
        if (!vw32.equals(vw3)) {
            Bundle bundle13 = new Bundle();
            ts6 i25 = ws6.i();
            int i26 = 0;
            while (true) {
                ws6 ws6 = vw32.a;
                if (i26 >= ws6.size()) {
                    break;
                }
                if (((uw3) ws6.get(i26)).d == null) {
                    i25.a((uw3) ws6.get(i26));
                }
                i26++;
            }
            e8c j16 = i25.j();
            ArrayList arrayList5 = new ArrayList(j16.o);
            po5 l2 = j16.listIterator(0);
            while (l2.hasNext()) {
                uw3 uw3 = (uw3) l2.next();
                Bundle b2 = uw3.b();
                Bitmap bitmap = uw3.d;
                if (bitmap != null) {
                    b2.putParcelable(uw3.v, bitmap);
                }
                arrayList5.add(b2);
            }
            bundle13.putParcelableArrayList(vw3.d, arrayList5);
            bundle13.putLong(vw3.e, vw32.b);
            bundle3.putBundle(d0, bundle13);
        }
        uf4 uf4 = uf4.e;
        uf4 uf42 = this.q;
        if (!uf42.equals(uf4)) {
            Bundle bundle14 = new Bundle();
            int i27 = uf42.a;
            if (i27 != 0) {
                bundle14.putInt(uf4.f, i27);
            }
            int i28 = uf42.b;
            if (i28 != 0) {
                bundle14.putInt(uf4.g, i28);
            }
            int i29 = uf42.c;
            if (i29 != 0) {
                bundle14.putInt(uf4.h, i29);
            }
            String str = uf42.d;
            if (str != null) {
                bundle14.putString(uf4.i, str);
            }
            bundle3.putBundle(O, bundle14);
        }
        int i30 = this.r;
        if (i30 != 0) {
            bundle3.putInt(P, i30);
        }
        boolean z9 = this.s;
        if (z9) {
            bundle3.putBoolean(Q, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            bundle3.putBoolean(R, z10);
        }
        int i31 = this.u;
        if (i31 != 1) {
            bundle3.putInt(S, i31);
        }
        int i32 = this.x;
        if (i32 != 0) {
            bundle3.putInt(T, i32);
        }
        int i33 = this.y;
        if (i33 != 1) {
            bundle3.putInt(U, i33);
        }
        boolean z11 = this.v;
        if (z11) {
            bundle3.putBoolean(V, z11);
        }
        boolean z12 = this.w;
        if (z12) {
            bundle3.putBoolean(W, z12);
        }
        z78 z783 = z78.J;
        z78 z784 = this.z;
        if (!z784.equals(z783)) {
            bundle3.putBundle(e0, z784.c());
        }
        int i34 = i2;
        long j17 = i34 < 6 ? j2 : 5000;
        long j18 = this.A;
        if (j18 != j17) {
            bundle3.putLong(f0, j18);
        }
        long j19 = i34 < 6 ? j2 : 15000;
        long j20 = this.B;
        if (j20 != j19) {
            bundle3.putLong(g0, j20);
        }
        long j21 = i34 < 6 ? j2 : 3000;
        long j22 = this.C;
        if (j22 != j21) {
            bundle3.putLong(h0, j22);
        }
        spe spe = spe.b;
        spe spe2 = this.D;
        if (!spe2.equals(spe)) {
            Bundle bundle15 = new Bundle();
            bundle15.putParcelableArrayList(spe.c, gt0.M(spe2.a, new kce(23)));
            bundle3.putBundle(j0, bundle15);
        }
        mpe mpe = mpe.C;
        mpe mpe2 = this.E;
        if (!mpe2.equals(mpe)) {
            bundle3.putBundle(i0, mpe2.c());
        }
        return bundle3;
    }
}
