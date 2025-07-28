package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: o48  reason: default package */
public class o48 implements q38 {
    public dza A;
    public final r38 a;
    public final k96 b;
    public final z48 c;
    public final Context d;
    public final m3d e;
    public final Bundle f;
    public final g48 g;
    public final qh7 h;
    public final b2b i;
    public final bs j;
    public m3d k;
    public n48 l;
    public boolean m;
    public fza n = fza.F;
    public ws6 o;
    public e8c p;
    public w1d q = w1d.b;
    public eya r;
    public eya s;
    public eya t;
    public Surface u;
    public gjd v = gjd.c;
    public nn6 w;
    public long x;
    public long y;
    public fza z;

    public o48(Context context, r38 r38, m3d m3d, Bundle bundle, Looper looper) {
        e8c e8c = e8c.X;
        this.o = e8c;
        this.p = e8c;
        eya eya = eya.b;
        this.r = eya;
        this.s = eya;
        this.t = i(eya, eya);
        this.h = new qh7(looper, z7e.a, new b48(this, 6));
        this.a = r38;
        oyb.h(context, "context must not be null");
        oyb.h(m3d, "token must not be null");
        this.d = context;
        this.b = new k96();
        this.c = new z48(this);
        this.j = new bs(0);
        this.e = m3d;
        this.f = bundle;
        this.g = new g48(this);
        Bundle bundle2 = Bundle.EMPTY;
        this.l = m3d.a.getType() == 0 ? null : new n48(this, bundle);
        this.i = new b2b(this, looper);
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
    }

    public static int P(fza fza) {
        int i2 = fza.c.a.b;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static fza W(fza fza, int i2, List list, long j2, long j3) {
        int i3;
        int i4;
        fza fza2 = fza;
        int i5 = i2;
        vje vje = fza2.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < vje.p(); i6++) {
            arrayList.add(vje.n(i6, new tje(), 0));
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            tje tje = r9;
            tje tje2 = new tje();
            tje.b(0, (l68) list.get(i7), (Object) null, 0, 0, 0, true, false, (z58) null, 0, -9223372036854775807L, -1, -1, 0);
            arrayList.add(i7 + i5, tje2);
        }
        List list2 = list;
        X0(vje, arrayList, arrayList2);
        rje j4 = j(arrayList, arrayList2);
        if (fza2.j.q()) {
            i4 = 0;
            i3 = 0;
        } else {
            n2d n2d = fza2.c;
            i3 = n2d.a.b;
            if (i3 >= i5) {
                i3 += list.size();
            }
            i4 = n2d.a.e;
            if (i4 >= i5) {
                i4 += list.size();
            }
        }
        return i0(fza, j4, i3, i4, j2, j3, 5);
    }

    public static void X0(vje vje, ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tje tje = (tje) arrayList.get(i2);
            int i3 = tje.n;
            int i4 = tje.o;
            if (i3 == -1 || i4 == -1) {
                tje.n = arrayList2.size();
                tje.o = arrayList2.size();
                qje qje = new qje();
                qje.j((Object) null, (Object) null, i2, -9223372036854775807L, 0, w8.g, true);
                arrayList2.add(qje);
            } else {
                tje.n = arrayList2.size();
                tje.o = (i4 - i3) + arrayList2.size();
                while (i3 <= i4) {
                    qje qje2 = new qje();
                    vje.g(i3, qje2, false);
                    qje2.c = i2;
                    arrayList2.add(qje2);
                    i3++;
                }
            }
        }
    }

    public static fza c0(fza fza, int i2, int i3, boolean z2, long j2, long j3) {
        int i4;
        int i5;
        fza fza2;
        boolean z3;
        fza fza3 = fza;
        int i6 = i2;
        int i7 = i3;
        vje vje = fza3.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        for (int i9 = 0; i9 < vje.p(); i9++) {
            if (i9 < i6 || i9 >= i7) {
                arrayList.add(vje.n(i9, new tje(), 0));
            }
        }
        X0(vje, arrayList, arrayList2);
        rje j4 = j(arrayList, arrayList2);
        int P = P(fza);
        int i10 = fza3.c.a.e;
        tje tje = new tje();
        boolean z4 = P >= i6 && P < i7;
        if (j4.q()) {
            i4 = 0;
            i5 = -1;
        } else if (z4) {
            int p2 = vje.p();
            i5 = P;
            while (true) {
                z3 = fza3.i;
                if (i8 < p2 && (i5 = vje.e(i5, fza3.h, z3)) != -1) {
                    if (i5 < i6 || i5 >= i7) {
                        break;
                    }
                    i8++;
                } else {
                    i5 = -1;
                }
            }
            if (i5 == -1) {
                i5 = j4.a(z3);
            } else if (i5 >= i7) {
                i5 -= i7 - i6;
            }
            j4.n(i5, tje, 0);
            i4 = tje.n;
        } else if (P >= i7) {
            int i11 = P - (i7 - i6);
            if (i10 != -1) {
                for (int i12 = i6; i12 < i7; i12++) {
                    tje tje2 = new tje();
                    vje.o(i12, tje2);
                    i10 -= (tje2.o - tje2.n) + 1;
                }
            }
            i4 = i10;
            i5 = i11;
        } else {
            i4 = i10;
            i5 = P;
        }
        if (!z4) {
            fza2 = i0(fza, j4, i5, i4, j2, j3, 4);
        } else if (i5 == -1) {
            fza2 = y0(fza3, j4, n2d.k, n2d.l, 4);
        } else if (z2) {
            fza2 = i0(fza, j4, i5, i4, j2, j3, 4);
        } else {
            tje tje3 = new tje();
            j4.n(i5, tje3, 0);
            long h0 = oze.h0(tje3.l);
            long h02 = oze.h0(tje3.m);
            jya jya = r16;
            jya jya2 = new jya((Object) null, i5, tje3.c, (Object) null, i4, h0, h0, -1, -1);
            fza2 = y0(fza3, j4, jya2, new n2d(jya, false, SystemClock.elapsedRealtime(), h02, h0, am7.e(h0, h02), 0, -9223372036854775807L, h02, h0), 4);
        }
        int i13 = fza2.y;
        return (i13 == 1 || i13 == 4 || i6 >= i7 || i7 != vje.p() || P < i6) ? fza2 : fza2.f(4, (PlaybackException) null);
    }

    public static eya i(eya eya, eya eya2) {
        eya s2 = am7.s(eya, eya2);
        if (s2.a(32)) {
            return s2;
        }
        ui5 ui5 = new ui5(1);
        ui5.b(s2.a);
        ui5.a(32);
        return new eya(ui5.e());
    }

    public static fza i0(fza fza, rje rje, int i2, int i3, long j2, long j3, int i4) {
        fza fza2 = fza;
        rje rje2 = rje;
        tje tje = new tje();
        rje2.n(i2, tje, 0);
        l68 l68 = tje.c;
        jya jya = fza2.c.a;
        jya jya2 = new jya((Object) null, i2, l68, (Object) null, i3, j2, j3, jya.h, jya.i);
        n2d n2d = fza2.c;
        n2d n2d2 = r2;
        jya jya3 = jya2;
        n2d n2d3 = new n2d(jya3, n2d.b, SystemClock.elapsedRealtime(), n2d.d, n2d.e, n2d.f, n2d.g, n2d.h, n2d.i, n2d.j);
        return y0(fza2, rje2, jya3, n2d2, i4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ms6, ts6] */
    /* JADX WARNING: type inference failed for: r3v0, types: [ms6, ts6] */
    public static rje j(ArrayList arrayList, ArrayList arrayList2) {
        ? ms6 = new ms6(4);
        ms6.e(arrayList);
        e8c j2 = ms6.j();
        ? ms62 = new ms6(4);
        ms62.e(arrayList2);
        e8c j3 = ms62.j();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = i2;
        }
        return new rje(j2, j3, iArr);
    }

    public static fza y0(fza fza, vje vje, jya jya, n2d n2d, int i2) {
        fza fza2 = fza;
        PlaybackException playbackException = fza2.a;
        jya jya2 = fza2.c.a;
        oyb.k(vje.q() || n2d.a.b < vje.p());
        return new fza(playbackException, fza2.b, n2d, jya2, jya, i2, fza2.g, fza2.h, fza2.i, fza2.l, vje, fza2.k, fza2.m, fza2.n, fza2.o, fza2.p, fza2.q, fza2.r, fza2.s, fza2.t, fza2.u, fza2.x, fza2.y, fza2.v, fza2.w, fza2.z, fza2.A, fza2.B, fza2.C, fza2.D, fza2.E);
    }

    public final long A() {
        return this.n.c.i;
    }

    public final void A0(int i2, l68 l68) {
        if (T(20)) {
            oyb.d(i2 >= 0);
            G(new ph0(this, i2, l68, 7));
            Z0(ws6.n(l68), i2, i2 + 1);
        }
    }

    public final int B() {
        return this.n.c.a.e;
    }

    public final void B0(int i2, int i3) {
        gjd gjd = this.v;
        if (gjd.a != i2 || gjd.b != i3) {
            this.v = new gjd(i2, i3);
            this.h.f(24, new a45(i2, i3, 2));
        }
    }

    public final r8f C() {
        return this.n.l;
    }

    public final void C0(l68 l68) {
        if (T(31)) {
            G(new qa5(this, (Object) l68, 4));
            d1(Collections.singletonList(l68), -1, -9223372036854775807L, true);
        }
    }

    public final void D() {
        if (T(6)) {
            G(new b48(this, 3));
            if (R0() != -1) {
                a1(R0(), -9223372036854775807L);
            }
        }
    }

    public final void D0() {
        if (T(26)) {
            G(new b48(this, 10));
            fza fza = this.n;
            int i2 = fza.r + 1;
            int i3 = fza.q.c;
            if (i3 == 0 || i2 <= i3) {
                this.n = fza.c(i2, fza.s);
                a48 a48 = new a48(this, i2, 3);
                qh7 qh7 = this.h;
                qh7.c(30, a48);
                qh7.b();
            }
        }
    }

    public final void E() {
        if (T(4)) {
            G(new b48(this, 2));
            a1(P(this.n), -9223372036854775807L);
        }
    }

    public final boolean E0() {
        return this.n.i;
    }

    public final k20 F() {
        return this.n.o;
    }

    public final mpe F0() {
        return this.n.E;
    }

    public final void G(m48 m48) {
        b2b b2b = this.i;
        if (((o48) b2b.c).w != null) {
            Handler handler = (Handler) b2b.b;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        o(this.w, m48, true);
    }

    public final long G0() {
        return this.n.c.j;
    }

    public final void H(int i2, boolean z2) {
        if (T(34)) {
            G(new s34(this, z2, i2));
            fza fza = this.n;
            if (fza.s != z2) {
                this.n = fza.c(fza.r, z2);
                f48 f48 = new f48(this, z2, 0);
                qh7 qh7 = this.h;
                qh7.c(30, f48);
                qh7.b();
            }
        }
    }

    public final void H0(int i2, long j2, List list) {
        if (T(20)) {
            G(new h48(this, list, i2, j2));
            d1(list, i2, j2, false);
        }
    }

    public final uf4 I() {
        return this.n.q;
    }

    public final void I0(int i2) {
        if (T(25)) {
            G(new a48(this, i2, 7));
            fza fza = this.n;
            uf4 uf4 = fza.q;
            if (fza.r != i2 && uf4.b <= i2) {
                int i3 = uf4.c;
                if (i3 == 0 || i2 <= i3) {
                    this.n = fza.c(i2, fza.s);
                    a48 a48 = new a48(this, i2, 8);
                    qh7 qh7 = this.h;
                    qh7.c(30, a48);
                    qh7.b();
                }
            }
        }
    }

    public final void J() {
        if (T(26)) {
            G(new b48(this, 15));
            fza fza = this.n;
            int i2 = fza.r - 1;
            if (i2 >= fza.q.b) {
                this.n = fza.c(i2, fza.s);
                a48 a48 = new a48(this, i2, 9);
                qh7 qh7 = this.h;
                qh7.c(30, a48);
                qh7.b();
            }
        }
    }

    public final void J0() {
        if (T(9)) {
            G(new b48(this, 8));
            vje vje = this.n.j;
            if (!vje.q() && !n()) {
                if (j0()) {
                    a1(T0(), -9223372036854775807L);
                    return;
                }
                tje n2 = vje.n(P(this.n), new tje(), 0);
                if (n2.i && n2.a()) {
                    a1(P(this.n), -9223372036854775807L);
                }
            }
        }
    }

    public final void K(m48 m48) {
        b2b b2b = this.i;
        if (((o48) b2b.c).w != null) {
            Handler handler = (Handler) b2b.b;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        ch7 o2 = o(this.w, m48, true);
        try {
            qa7.v(o2);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2);
        } catch (TimeoutException e3) {
            if (o2 instanceof lyc) {
                int i2 = ((lyc) o2).w0;
                this.j.remove(Integer.valueOf(i2));
                this.b.s(i2, new p2d(-1));
            }
            ez3.k0("Synchronous command takes too long on the session side.", e3);
        }
    }

    public final void K0() {
        if (T(12)) {
            G(new b48(this, 1));
            b1(this.n.B);
        }
    }

    public final void L(int i2, int i3) {
        if (T(33)) {
            G(new c48(this, i2, i3, 1));
            fza fza = this.n;
            uf4 uf4 = fza.q;
            if (fza.r != i2 && uf4.b <= i2) {
                int i4 = uf4.c;
                if (i4 == 0 || i2 <= i4) {
                    this.n = fza.c(i2, fza.s);
                    a48 a48 = new a48(this, i2, 1);
                    qh7 qh7 = this.h;
                    qh7.c(30, a48);
                    qh7.b();
                }
            }
        }
    }

    public final void L0() {
        if (T(11)) {
            G(new b48(this, 7));
            b1(-this.n.A);
        }
    }

    public final boolean M() {
        return R0() != -1;
    }

    public final void M0(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i2;
        vje vje = this.n.j;
        int p2 = vje.p();
        int min = Math.min(i3, p2);
        int i8 = min - i7;
        int min2 = Math.min(i4, p2 - i8);
        if (i7 < p2 && i7 != min && i7 != min2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < p2; i9++) {
                arrayList.add(vje.n(i9, new tje(), 0));
            }
            oze.R(arrayList, i7, min, min2);
            X0(vje, arrayList, arrayList2);
            rje j2 = j(arrayList, arrayList2);
            if (!j2.q()) {
                int P = P(this.n);
                if (P >= i7 && P < min) {
                    i6 = (P - i7) + min2;
                } else if (min > P || min2 <= P) {
                    i5 = (min <= P || min2 > P) ? P : i8 + P;
                    tje tje = new tje();
                    j2.n(i5, tje, 0);
                    f1(i0(this.n, j2, i5, tje.n + (this.n.c.a.e - vje.n(P, tje, 0).n), k(), b0(), 5), 0, (Integer) null, (Integer) null, (Integer) null);
                } else {
                    i6 = P - i8;
                }
                i5 = i6;
                tje tje2 = new tje();
                j2.n(i5, tje2, 0);
                f1(i0(this.n, j2, i5, tje2.n + (this.n.c.a.e - vje.n(P, tje2, 0).n), k(), b0(), 5), 0, (Integer) null, (Integer) null, (Integer) null);
            }
        }
    }

    public final void N(int i2) {
        if (T(34)) {
            G(new a48(this, i2, 4));
            fza fza = this.n;
            int i3 = fza.r + 1;
            int i4 = fza.q.c;
            if (i4 == 0 || i3 <= i4) {
                this.n = fza.c(i3, fza.s);
                a48 a48 = new a48(this, i3, 5);
                qh7 qh7 = this.h;
                qh7.c(30, a48);
                qh7.b();
            }
        }
    }

    public final z78 N0() {
        return this.n.z;
    }

    public final int O() {
        return this.n.c.a.i;
    }

    public final void O0(List list) {
        if (T(20)) {
            G(new qa5(this, (Object) list, 3));
            d1(list, -1, -9223372036854775807L, true);
        }
    }

    public final long P0() {
        return this.n.A;
    }

    public final void Q(mpe mpe) {
        if (T(29)) {
            G(new e44(this, 23, mpe));
            fza fza = this.n;
            if (mpe != fza.E) {
                this.n = fza.o(mpe);
                d45 d45 = new d45(mpe, 1);
                qh7 qh7 = this.h;
                qh7.c(19, d45);
                qh7.b();
            }
        }
    }

    public final w1d Q0() {
        return this.q;
    }

    public final sz0 R(vje vje, int i2, long j2) {
        int i3;
        if (vje.q()) {
            return null;
        }
        tje tje = new tje();
        qje qje = new qje();
        if (i2 == -1 || i2 >= vje.p()) {
            i2 = vje.a(this.n.i);
            j2 = oze.h0(vje.n(i2, tje, 0).l);
        }
        long S = oze.S(j2);
        oyb.f(i2, vje.p());
        vje.o(i2, tje);
        if (S == -9223372036854775807L) {
            S = tje.l;
            if (S == -9223372036854775807L) {
                return null;
            }
        }
        int i4 = tje.n;
        vje.g(i4, qje, false);
        do {
            i3 = i4;
            if (i3 >= tje.o || qje.e == S) {
                vje.g(i3, qje, false);
            } else {
                i4 = i3 + 1;
            }
        } while (vje.g(i4, qje, false).e <= S);
        vje.g(i3, qje, false);
        return new sz0(S - qje.e, i3, 6, false);
    }

    public final int R0() {
        if (this.n.j.q()) {
            return -1;
        }
        fza fza = this.n;
        vje vje = fza.j;
        int P = P(fza);
        fza fza2 = this.n;
        int i2 = fza2.h;
        if (i2 == 1) {
            i2 = 0;
        }
        return vje.l(P, i2, fza2.i);
    }

    public final void S(int i2) {
        if (T(20)) {
            oyb.d(i2 >= 0);
            G(new a48(this, i2, 2));
            Y0(i2, i2 + 1);
        }
    }

    public final ch7 S0(v1d v1d, Bundle bundle) {
        nn6 nn6;
        xz xzVar = new xz(this, v1d, bundle, 15);
        oyb.d(v1d.a == 0);
        w1d w1d = this.q;
        w1d.getClass();
        if (!w1d.a.contains(v1d)) {
            ez3.j0("Controller isn't allowed to call custom session command:" + v1d.b);
            nn6 = null;
        } else {
            nn6 = this.w;
        }
        return o(nn6, xzVar, false);
    }

    public final boolean T(int i2) {
        if (this.t.a(i2)) {
            return true;
        }
        us8.l(i2, "Controller isn't allowed to call command= ");
        return false;
    }

    public final int T0() {
        if (this.n.j.q()) {
            return -1;
        }
        fza fza = this.n;
        vje vje = fza.j;
        int P = P(fza);
        fza fza2 = this.n;
        int i2 = fza2.h;
        if (i2 == 1) {
            i2 = 0;
        }
        return vje.e(P, i2, fza2.i);
    }

    public final void U(int i2, int i3) {
        if (T(20)) {
            oyb.d(i2 >= 0 && i3 >= i2);
            G(new c48(this, i2, i3, 0));
            Y0(i2, i3);
        }
    }

    public final void U0(l68 l68) {
        if (T(31)) {
            G(new e44(this, 24, l68));
            d1(Collections.singletonList(l68), -1, -9223372036854775807L, true);
        }
    }

    public final void V() {
        if (T(7)) {
            G(new b48(this, 4));
            vje vje = this.n.j;
            if (!vje.q() && !n()) {
                boolean M = M();
                tje n2 = vje.n(P(this.n), new tje(), 0);
                if (!n2.i || !n2.a()) {
                    if (!M || k() > this.n.C) {
                        a1(P(this.n), 0);
                    } else {
                        a1(R0(), -9223372036854775807L);
                    }
                } else if (M) {
                    a1(R0(), -9223372036854775807L);
                }
            }
        }
    }

    public final ws6 V0() {
        return this.p;
    }

    public final void W0(fza fza, fza fza2, Integer num, Integer num2, Integer num3, Integer num4) {
        qh7 qh7 = this.h;
        if (num != null) {
            qh7.c(0, new i48(fza2, num, 0));
        }
        if (num3 != null) {
            qh7.c(11, new i48(fza2, num3, 1));
        }
        l68 s2 = fza2.s();
        if (num4 != null) {
            qh7.c(1, new e44(s2, 26, num4));
        }
        PlaybackException playbackException = fza.a;
        PlaybackException playbackException2 = fza2.a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            qh7.c(10, new k48(0, playbackException2));
            if (playbackException2 != null) {
                qh7.c(10, new k48(1, playbackException2));
            }
        }
        if (!fza.D.equals(fza2.D)) {
            qh7.c(2, new j48(fza2, 17));
        }
        if (!fza.z.equals(fza2.z)) {
            qh7.c(14, new j48(fza2, 18));
        }
        if (fza.w != fza2.w) {
            qh7.c(3, new j48(fza2, 19));
        }
        if (fza.y != fza2.y) {
            qh7.c(4, new j48(fza2, 20));
        }
        if (num2 != null) {
            qh7.c(5, new i48(fza2, num2, 2));
        }
        if (fza.x != fza2.x) {
            qh7.c(6, new j48(fza2, 0));
        }
        if (fza.v != fza2.v) {
            qh7.c(7, new j48(fza2, 1));
        }
        if (!fza.g.equals(fza2.g)) {
            qh7.c(12, new j48(fza2, 2));
        }
        if (fza.h != fza2.h) {
            qh7.c(8, new j48(fza2, 3));
        }
        if (fza.i != fza2.i) {
            qh7.c(9, new j48(fza2, 4));
        }
        if (!fza.m.equals(fza2.m)) {
            qh7.c(15, new j48(fza2, 5));
        }
        if (fza.n != fza2.n) {
            qh7.c(22, new j48(fza2, 6));
        }
        if (!fza.o.equals(fza2.o)) {
            qh7.c(20, new j48(fza2, 7));
        }
        if (!fza.p.a.equals(fza2.p.a)) {
            qh7.c(27, new j48(fza2, 8));
            qh7.c(27, new j48(fza2, 9));
        }
        if (!fza.q.equals(fza2.q)) {
            qh7.c(29, new j48(fza2, 10));
        }
        if (!(fza.r == fza2.r && fza.s == fza2.s)) {
            qh7.c(30, new j48(fza2, 11));
        }
        if (!fza.l.equals(fza2.l)) {
            qh7.c(25, new j48(fza2, 12));
        }
        if (fza.A != fza2.A) {
            qh7.c(16, new j48(fza2, 13));
        }
        if (fza.B != fza2.B) {
            qh7.c(17, new j48(fza2, 14));
        }
        if (fza.C != fza2.C) {
            qh7.c(18, new j48(fza2, 15));
        }
        if (!fza.E.equals(fza2.E)) {
            qh7.c(19, new j48(fza2, 16));
        }
        qh7.b();
    }

    public final PlaybackException X() {
        return this.n.a;
    }

    public final void Y(boolean z2) {
        if (T(1)) {
            G(new f48(this, z2, 4));
            e1(z2);
        } else if (z2) {
            ez3.j0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    public final void Y0(int i2, int i3) {
        int i4 = i2;
        int p2 = this.n.j.p();
        int min = Math.min(i3, p2);
        if (i4 < p2 && i4 != min && p2 != 0) {
            boolean z2 = true;
            boolean z3 = P(this.n) >= i4 && P(this.n) < min;
            fza c0 = c0(this.n, i2, min, false, k(), b0());
            int i5 = this.n.c.a.b;
            if (i5 < i4 || i5 >= min) {
                z2 = false;
            }
            int i6 = null;
            int i7 = z3 ? 4 : null;
            if (z2) {
                i6 = 3;
            }
            f1(c0, 0, (Integer) null, i7, i6);
        }
    }

    public final void Z(int i2) {
        if (T(10)) {
            oyb.d(i2 >= 0);
            G(new a48(this, i2, 0));
            a1(i2, -9223372036854775807L);
        }
    }

    public final void Z0(List list, int i2, int i3) {
        int p2 = this.n.j.p();
        if (i2 <= p2) {
            if (this.n.j.q()) {
                d1(list, -1, -9223372036854775807L, false);
                return;
            }
            int min = Math.min(i3, p2);
            int i4 = min;
            fza c0 = c0(W(this.n, i4, list, k(), b0()), i2, i4, true, k(), b0());
            int i5 = this.n.c.a.b;
            boolean z2 = i5 >= i2 && i5 < min;
            f1(c0, (Integer) null, (Integer) null, z2 ? 4 : null, z2 ? 3 : null);
        }
    }

    public final boolean a() {
        return this.n.v;
    }

    public final long a0() {
        return this.n.B;
    }

    public final void a1(int i2, long j2) {
        int i3;
        int i4;
        fza fza;
        fza j3;
        int i5 = i2;
        long j4 = j2;
        vje vje = this.n.j;
        if ((vje.q() || i5 < vje.p()) && !n()) {
            fza fza2 = this.n;
            fza f2 = fza2.f(fza2.y == 1 ? 1 : 2, fza2.a);
            sz0 R = R(vje, i5, j4);
            if (R == null) {
                int i6 = (j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1));
                int i7 = i2;
                int i8 = i2;
                jya jya = r1;
                i3 = 1;
                jya jya2 = new jya((Object) null, i7, (l68) null, (Object) null, i8, i6 == 0 ? 0 : j4, i6 == 0 ? 0 : j4, -1, -1);
                fza fza3 = this.n;
                vje vje2 = fza3.j;
                boolean z2 = this.n.c.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                n2d n2d = this.n.c;
                fza = y0(fza3, vje2, jya, new n2d(jya, z2, elapsedRealtime, n2d.d, i6 == 0 ? 0 : j4, 0, 0, n2d.h, n2d.i, i6 == 0 ? 0 : j4), 1);
                i4 = 0;
            } else {
                i3 = 1;
                n2d n2d2 = f2.c;
                int i9 = n2d2.a.e;
                qje qje = new qje();
                vje.g(i9, qje, false);
                qje qje2 = new qje();
                int i10 = R.b;
                vje.g(i10, qje2, false);
                boolean z3 = i9 != i10;
                long S = oze.S(k()) - qje.e;
                long j5 = R.c;
                if (z3 || j5 != S) {
                    jya jya3 = n2d2.a;
                    oyb.k(jya3.h == -1);
                    boolean z4 = z3;
                    long j6 = j5;
                    jya jya4 = new jya((Object) null, qje.c, jya3.c, (Object) null, i9, oze.h0(qje.e + S), oze.h0(qje.e + S), -1, -1);
                    i4 = 0;
                    vje.g(i10, qje2, false);
                    tje tje = new tje();
                    vje.o(qje2.c, tje);
                    jya jya5 = new jya((Object) null, qje2.c, tje.c, (Object) null, i10, oze.h0(qje2.e + j6), oze.h0(qje2.e + j6), -1, -1);
                    fza h2 = f2.h(jya4, jya5, 1);
                    if (z4 || j6 < S) {
                        j3 = h2.j(new n2d(jya5, false, SystemClock.elapsedRealtime(), oze.h0(tje.m), oze.h0(qje2.e + j6), am7.e(oze.h0(qje2.e + j6), oze.h0(tje.m)), 0, -9223372036854775807L, -9223372036854775807L, oze.h0(qje2.e + j6)));
                    } else {
                        long max = Math.max(0, oze.S(h2.c.g) - (j6 - S));
                        long j7 = j6 + max;
                        j3 = h2.j(new n2d(jya5, false, SystemClock.elapsedRealtime(), oze.h0(tje.m), oze.h0(j7), am7.e(oze.h0(j7), oze.h0(tje.m)), oze.h0(max), -9223372036854775807L, -9223372036854775807L, oze.h0(j7)));
                    }
                    f2 = j3;
                } else {
                    i4 = 0;
                }
                fza = f2;
            }
            boolean q2 = this.n.j.q();
            n2d n2d3 = fza.c;
            int i11 = (q2 || n2d3.a.b == this.n.c.a.b) ? i4 : i3;
            if (i11 != 0 || n2d3.a.f != this.n.c.a.f) {
                f1(fza, (Integer) null, (Integer) null, Integer.valueOf(i3), i11 != 0 ? 2 : null);
            }
        }
    }

    public final boolean b() {
        return this.n.w;
    }

    public final long b0() {
        n2d n2d = this.n.c;
        return !n2d.b ? k() : n2d.a.g;
    }

    public final void b1(long j2) {
        long k2 = k() + j2;
        long c2 = c();
        if (c2 != -9223372036854775807L) {
            k2 = Math.min(k2, c2);
        }
        a1(P(this.n), Math.max(k2, 0));
    }

    public final long c() {
        return this.n.c.d;
    }

    public final void c1(int i2, bs6 bs6) {
        bs6.c(new wg1((Object) this, (Object) bs6, i2, 13), lh4.a);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [ln6, java.lang.Object] */
    public final void connect() {
        nn6 nn6;
        m3d m3d = this.e;
        int type = m3d.a.getType();
        l3d l3d = m3d.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.l = null;
            Object c2 = l3d.c();
            oyb.l(c2);
            IBinder iBinder = (IBinder) c2;
            int i2 = me8.i;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof nn6)) {
                ? obj = new Object();
                obj.c = iBinder;
                nn6 = obj;
            } else {
                nn6 = (nn6) queryLocalInterface;
            }
            try {
                nn6.j0(this.c, this.b.i(), new md3(context.getPackageName(), Process.myPid(), bundle).b());
            } catch (RemoteException e2) {
                ez3.k0("Failed to call connection request.", e2);
            }
        } else {
            this.l = new n48(this, bundle);
            int i3 = oze.a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(l3d.getPackageName(), l3d.d());
            if (!context.bindService(intent, this.l, i3)) {
                ez3.j0("bind to " + m3d + " failed");
                r38 r38 = this.a;
                Objects.requireNonNull(r38);
                r38.G(new eq6(6, r38));
            }
        }
    }

    public final wxa d() {
        return this.n.g;
    }

    public final void d0(int i2, List list) {
        if (T(20)) {
            oyb.d(i2 >= 0);
            G(new ph0(this, i2, list, 8));
            h(i2, list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(java.util.List r66, int r67, long r68, boolean r70) {
        /*
            r65 = this;
            r0 = r65
            r1 = r66
            r2 = r67
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.lang.Integer r28 = java.lang.Integer.valueOf(r6)
            r9 = r6
        L_0x0017:
            int r7 = r66.size()
            if (r9 >= r7) goto L_0x0073
            java.lang.Object r7 = r1.get(r9)
            r24 = r7
            l68 r24 = (defpackage.l68) r24
            gt6 r7 = defpackage.qa7.a
            tje r8 = new tje
            r7 = r8
            r8.<init>()
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r8
            r8 = r28
            r30 = r9
            r9 = r24
            r24 = r30
            r25 = r30
            r7.b(r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r22, r24, r25, r26)
            r4.add(r6)
            qje r6 = new qje
            r6.<init>()
            w8 r15 = defpackage.w8.g
            r9 = 0
            r16 = 1
            r8 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r7 = r6
            r10 = r30
            r7.j(r8, r9, r10, r11, r13, r15, r16)
            r5.add(r6)
            int r9 = r30 + 1
            r6 = 0
            goto L_0x0017
        L_0x0073:
            rje r4 = j(r4, r5)
            boolean r5 = r4.q()
            ws6 r6 = r4.e
            if (r5 != 0) goto L_0x008c
            int r5 = r6.size()
            if (r2 >= r5) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x008c:
            r5 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r70 == 0) goto L_0x009f
            fza r2 = r0.n
            boolean r2 = r2.i
            int r2 = r4.a(r2)
            r10 = r7
        L_0x009d:
            r6 = 0
            goto L_0x00c7
        L_0x009f:
            if (r2 != r5) goto L_0x00c4
            fza r2 = r0.n
            n2d r2 = r2.c
            jya r2 = r2.a
            int r9 = r2.b
            boolean r10 = r4.q()
            if (r10 != 0) goto L_0x00c0
            int r6 = r6.size()
            if (r9 < r6) goto L_0x00c0
            fza r2 = r0.n
            boolean r2 = r2.i
            int r2 = r4.a(r2)
            r6 = r3
            r10 = r7
            goto L_0x00c7
        L_0x00c0:
            long r10 = r2.f
            r2 = r9
            goto L_0x009d
        L_0x00c4:
            r10 = r68
            goto L_0x009d
        L_0x00c7:
            sz0 r9 = r0.R(r4, r2, r10)
            if (r9 != 0) goto L_0x0121
            jya r1 = new jya
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x00d8
            r18 = r8
            goto L_0x00da
        L_0x00d8:
            r18 = r10
        L_0x00da:
            if (r7 != 0) goto L_0x00df
            r20 = r8
            goto L_0x00e1
        L_0x00df:
            r20 = r10
        L_0x00e1:
            r15 = 0
            r16 = 0
            r13 = 0
            r22 = -1
            r23 = -1
            r12 = r1
            r14 = r2
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            n2d r12 = new n2d
            long r32 = android.os.SystemClock.elapsedRealtime()
            if (r7 != 0) goto L_0x00fb
            r36 = r8
            goto L_0x00fd
        L_0x00fb:
            r36 = r10
        L_0x00fd:
            if (r7 != 0) goto L_0x0102
            r45 = r8
            goto L_0x0104
        L_0x0102:
            r45 = r10
        L_0x0104:
            r41 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r31 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r38 = 0
            r39 = 0
            r29 = r12
            r30 = r1
            r29.<init>(r30, r31, r32, r34, r36, r38, r39, r41, r43, r45)
            goto L_0x016f
        L_0x0121:
            jya r7 = new jya
            java.lang.Object r1 = r1.get(r2)
            r15 = r1
            l68 r15 = (defpackage.l68) r15
            long r10 = r9.c
            long r18 = defpackage.oze.h0(r10)
            long r20 = defpackage.oze.h0(r10)
            r16 = 0
            int r1 = r9.b
            r13 = 0
            r22 = -1
            r23 = -1
            r12 = r7
            r14 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            n2d r12 = new n2d
            long r50 = android.os.SystemClock.elapsedRealtime()
            long r54 = defpackage.oze.h0(r10)
            long r63 = defpackage.oze.h0(r10)
            r59 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r61 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r49 = 0
            r52 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = 0
            r57 = 0
            r47 = r12
            r48 = r7
            r47.<init>(r48, r49, r50, r52, r54, r56, r57, r59, r61, r63)
            r1 = r7
        L_0x016f:
            fza r7 = r0.n
            r8 = 4
            fza r1 = y0(r7, r4, r1, r12, r8)
            int r7 = r1.y
            if (r2 == r5) goto L_0x0188
            if (r7 == r3) goto L_0x0188
            boolean r2 = r4.q()
            if (r2 != 0) goto L_0x0187
            if (r6 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r7 = 2
            goto L_0x0188
        L_0x0187:
            r7 = r8
        L_0x0188:
            fza r2 = r0.n
            androidx.media3.common.PlaybackException r2 = r2.a
            fza r1 = r1.f(r7, r2)
            fza r2 = r0.n
            vje r2 = r2.j
            boolean r2 = r2.q()
            r3 = 0
            if (r2 != 0) goto L_0x01a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x01a1
        L_0x01a0:
            r2 = r3
        L_0x01a1:
            fza r4 = r0.n
            vje r4 = r4.j
            boolean r4 = r4.q()
            if (r4 == 0) goto L_0x01b3
            vje r4 = r1.j
            boolean r4 = r4.q()
            if (r4 != 0) goto L_0x01b8
        L_0x01b3:
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x01b8:
            r4 = 0
            r66 = r1
            r67 = r28
            r68 = r4
            r69 = r2
            r70 = r3
            r65.f1(r66, r67, r68, r69, r70)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o48.d1(java.util.List, int, long, boolean):void");
    }

    public final float e() {
        return this.n.n;
    }

    public final long e0() {
        return this.n.c.e;
    }

    public final void e1(boolean z2) {
        fza fza = this.n;
        int i2 = fza.x;
        int i3 = i2 == 1 ? 0 : i2;
        if (fza.t != z2 || i2 != i3) {
            this.x = am7.p(fza, this.x, this.y, this.a.Y);
            this.y = SystemClock.elapsedRealtime();
            f1(this.n.d(1, i3, z2), (Integer) null, 1, (Integer) null, (Integer) null);
        }
    }

    public final void f(wxa wxa) {
        if (T(13)) {
            G(new e44(this, 25, wxa));
            if (!this.n.g.equals(wxa)) {
                this.n = this.n.e(wxa);
                e48 e48 = new e48(wxa, 1);
                qh7 qh7 = this.h;
                qh7.c(12, e48);
                qh7.b();
            }
        }
    }

    public final void f0() {
        if (T(8)) {
            G(new b48(this, 14));
            if (T0() != -1) {
                a1(T0(), -9223372036854775807L);
            }
        }
    }

    public final void f1(fza fza, Integer num, Integer num2, Integer num3, Integer num4) {
        fza fza2 = this.n;
        this.n = fza;
        W0(fza2, fza, num, num2, num3, num4);
    }

    public final void g(float f2) {
        if (T(24)) {
            G(new d48(this, f2, 1));
            fza fza = this.n;
            if (fza.n != f2) {
                this.n = fza.p(f2);
                u35 u35 = new u35(2, f2);
                qh7 qh7 = this.h;
                qh7.c(22, u35);
                qh7.b();
            }
        }
    }

    public final void g0(int i2) {
        if (T(34)) {
            G(new a48(this, i2, 10));
            fza fza = this.n;
            int i3 = fza.r - 1;
            if (i3 >= fza.q.b) {
                this.n = fza.c(i3, fza.s);
                a48 a48 = new a48(this, i3, 11);
                qh7 qh7 = this.h;
                qh7.c(30, a48);
                qh7.b();
            }
        }
    }

    public final int getPlaybackState() {
        return this.n.y;
    }

    public final int getRepeatMode() {
        return this.n.h;
    }

    public final void h(int i2, List list) {
        if (!list.isEmpty()) {
            if (this.n.j.q()) {
                d1(list, -1, -9223372036854775807L, false);
            } else {
                f1(W(this.n, Math.min(i2, this.n.j.p()), list, k(), b0()), 0, (Integer) null, (Integer) null, this.n.j.q() ? 3 : null);
            }
        }
    }

    public final spe h0() {
        return this.n.D;
    }

    public final boolean isConnected() {
        return this.w != null;
    }

    public final boolean j0() {
        return T0() != -1;
    }

    public final long k() {
        long p2 = am7.p(this.n, this.x, this.y, this.a.Y);
        this.x = p2;
        return p2;
    }

    public final z78 k0() {
        return this.n.m;
    }

    public final int l() {
        return this.n.r;
    }

    public final vw3 l0() {
        return this.n.p;
    }

    public final void m(Surface surface) {
        if (T(27)) {
            if (this.u != null) {
                this.u = null;
            }
            this.u = surface;
            K(new e44(this, 22, surface));
            int i2 = surface == null ? 0 : -1;
            B0(i2, i2);
        }
    }

    public final void m0(k20 k20, boolean z2) {
        if (T(35)) {
            G(new qa5(this, k20, z2, 2));
            if (!this.n.o.equals(k20)) {
                this.n = this.n.a(k20);
                c45 c45 = new c45(k20, 1);
                qh7 qh7 = this.h;
                qh7.c(20, c45);
                qh7.b();
            }
        }
    }

    public final boolean n() {
        return this.n.c.b;
    }

    public final void n0(z78 z78) {
        if (T(19)) {
            G(new e44(this, 21, z78));
            if (!this.n.m.equals(z78)) {
                this.n = this.n.g(z78);
                y35 y35 = new y35(z78, 1);
                qh7 qh7 = this.h;
                qh7.c(15, y35);
                qh7.b();
            }
        }
    }

    public final ch7 o(nn6 nn6, m48 m48, boolean z2) {
        int i2;
        lyc lyc;
        if (nn6 == null) {
            return swb.A(new p2d(-4));
        }
        k96 k96 = this.b;
        p2d p2d = new p2d(1);
        synchronized (k96.o) {
            try {
                i2 = k96.i();
                lyc = new lyc(i2, p2d);
                if (k96.b) {
                    lyc.n();
                } else {
                    ((yr) k96.X).put(Integer.valueOf(i2), lyc);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.j.add(Integer.valueOf(i2));
        }
        try {
            m48.f(nn6, i2);
        } catch (RemoteException e2) {
            ez3.k0("Cannot connect to the service or the session is gone", e2);
            this.j.remove(Integer.valueOf(i2));
            this.b.s(i2, new p2d(-100));
        }
        return lyc;
    }

    public final int o0() {
        return this.n.c.a.h;
    }

    public final long p() {
        return this.n.c.h;
    }

    public final int p0() {
        return P(this.n);
    }

    public final void pause() {
        if (T(1)) {
            G(new b48(this, 9));
            e1(false);
        }
    }

    public final void play() {
        if (!T(1)) {
            ez3.j0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        G(new b48(this, 11));
        e1(true);
    }

    public final void prepare() {
        int i2 = 2;
        if (T(2)) {
            G(new b48(this, 13));
            fza fza = this.n;
            if (fza.y == 1) {
                if (fza.j.q()) {
                    i2 = 4;
                }
                f1(fza.f(i2, (PlaybackException) null), (Integer) null, (Integer) null, (Integer) null, (Integer) null);
            }
        }
    }

    public final long q() {
        return this.n.c.g;
    }

    public final void q0(boolean z2) {
        if (T(26)) {
            G(new f48(this, z2, 2));
            fza fza = this.n;
            if (fza.s != z2) {
                this.n = fza.c(fza.r, z2);
                f48 f48 = new f48(this, z2, 3);
                qh7 qh7 = this.h;
                qh7.c(30, f48);
                qh7.b();
            }
        }
    }

    public final void r(int i2, long j2) {
        if (T(10)) {
            oyb.d(i2 >= 0);
            G(new b44((Object) this, i2, j2, 3));
            a1(i2, j2);
        }
    }

    public final void r0(hya hya) {
        this.h.e(hya);
    }

    public final void release() {
        nn6 nn6 = this.w;
        if (!this.m) {
            this.m = true;
            this.k = null;
            b2b b2b = this.i;
            Handler handler = (Handler) b2b.b;
            if (handler.hasMessages(1)) {
                try {
                    o48 o48 = (o48) b2b.c;
                    o48.w.m0(o48.c);
                } catch (RemoteException unused) {
                    ez3.j0("Error in sending flushCommandQueue");
                }
            }
            handler.removeCallbacksAndMessages((Object) null);
            this.w = null;
            if (nn6 != null) {
                int i2 = this.b.i();
                try {
                    nn6.asBinder().unlinkToDeath(this.g, 0);
                    nn6.e0(this.c, i2);
                } catch (RemoteException unused2) {
                }
            }
            this.h.d();
            k96 k96 = this.b;
            eq6 eq6 = new eq6(7, this);
            synchronized (k96.o) {
                try {
                    Handler o2 = oze.o((Handler.Callback) null);
                    k96.Y = o2;
                    k96.c = eq6;
                    if (((yr) k96.X).isEmpty()) {
                        k96.j();
                    } else {
                        o2.postDelayed(new pzb(11, k96), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final eya s() {
        return this.t;
    }

    public final void s0(List list, int i2, int i3) {
        if (T(20)) {
            oyb.d(i2 >= 0 && i2 <= i3);
            G(new l48(this, list, i2, i3));
            Z0(list, i2, i3);
        }
    }

    public final void seekTo(long j2) {
        if (T(5)) {
            G(new sq1((Object) this, j2, 4));
            a1(P(this.n), j2);
        }
    }

    public final void setPlaybackSpeed(float f2) {
        if (T(13)) {
            G(new d48(this, f2, 0));
            wxa wxa = this.n.g;
            if (wxa.a != f2) {
                wxa wxa2 = new wxa(f2, wxa.b);
                this.n = this.n.e(wxa2);
                e48 e48 = new e48(wxa2, 0);
                qh7 qh7 = this.h;
                qh7.c(12, e48);
                qh7.b();
            }
        }
    }

    public final void setRepeatMode(int i2) {
        if (T(15)) {
            G(new a48(this, i2, 6));
            fza fza = this.n;
            if (fza.h != i2) {
                this.n = fza.i(i2);
                x34 x34 = new x34(i2, 5);
                qh7 qh7 = this.h;
                qh7.c(8, x34);
                qh7.b();
            }
        }
    }

    public final void stop() {
        if (T(3)) {
            G(new b48(this, 12));
            fza fza = this.n;
            n2d n2d = this.n.c;
            jya jya = n2d.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            n2d n2d2 = this.n.c;
            long j2 = n2d2.d;
            long j3 = n2d2.a.f;
            n2d n2d3 = n2d;
            int e2 = am7.e(j3, j2);
            n2d n2d4 = this.n.c;
            n2d n2d5 = r2;
            n2d n2d6 = new n2d(jya, n2d3.b, elapsedRealtime, j2, j3, e2, 0, n2d4.h, n2d4.i, n2d4.a.f);
            fza j4 = fza.j(n2d5);
            this.n = j4;
            if (j4.y != 1) {
                this.n = j4.f(1, j4.a);
                j67 j67 = new j67(23);
                qh7 qh7 = this.h;
                qh7.c(4, j67);
                qh7.b();
            }
        }
    }

    public final void t(l68 l68, long j2) {
        if (T(31)) {
            long j3 = j2;
            G(new b52(this, l68, j3, 8));
            d1(Collections.singletonList(l68), -1, j3, false);
        }
    }

    public final void t0(int i2, int i3) {
        if (T(20)) {
            oyb.d(i2 >= 0 && i3 >= 0);
            G(new c48(this, i2, i3, 2));
            M0(i2, i2 + 1, i3);
        }
    }

    public final boolean u() {
        return this.n.t;
    }

    public final void u0(int i2, int i3, int i4) {
        if (T(20)) {
            oyb.d(i2 >= 0 && i2 <= i3 && i4 >= 0);
            G(new vq1(this, i2, i3, i4));
            M0(i2, i3, i4);
        }
    }

    public final void v() {
        if (T(20)) {
            G(new b48(this, 5));
            Y0(0, Integer.MAX_VALUE);
        }
    }

    public final int v0() {
        return this.n.x;
    }

    public final void w(boolean z2) {
        if (T(14)) {
            G(new f48(this, z2, 1));
            fza fza = this.n;
            if (fza.i != z2) {
                this.n = fza.k(z2);
                cz0 cz0 = new cz0(z2, 6);
                qh7 qh7 = this.h;
                qh7.c(9, cz0);
                qh7.b();
            }
        }
    }

    public final void w0(List list) {
        if (T(20)) {
            G(new e44(this, 27, list));
            h(this.n.j.p(), list);
        }
    }

    public final int x() {
        return this.n.c.f;
    }

    public final vje x0() {
        return this.n.j;
    }

    public final long y() {
        return this.n.C;
    }

    public final void z(hya hya) {
        this.h.a(hya);
    }

    public final boolean z0() {
        return this.n.s;
    }
}
