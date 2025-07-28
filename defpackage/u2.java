package defpackage;

import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* renamed from: u2  reason: default package */
public abstract class u2 implements ko, kya, p0c {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public long A() {
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            return -9223372036854775807L;
        }
        return oze.h0(x0.n(n45.p0(), (tje) this.b, 0).m);
    }

    public void A0(int i, l68 l68) {
        n45 n45 = (n45) this;
        n45.s0(ws6.n(l68), i, i + 1);
    }

    public abstract int B();

    public void C0(l68 l68) {
        ((n45) this).O0(ws6.n(l68));
    }

    public void D() {
        Y1(6);
    }

    public void E() {
        V1(((n45) this).p0(), -9223372036854775807L, false);
    }

    public void G1(int i, float f) {
    }

    public void J0() {
        int i;
        n45 n45 = (n45) this;
        if (n45.x0().q() || n45.n()) {
            S1();
        } else if (j0()) {
            vje x0 = n45.x0();
            if (x0.q()) {
                i = -1;
            } else {
                int p0 = n45.p0();
                n45.w2();
                int i2 = n45.V0;
                if (i2 == 1) {
                    i2 = 0;
                }
                n45.w2();
                i = x0.e(p0, i2, n45.W0);
            }
            if (i == -1) {
                S1();
            } else if (i == n45.p0()) {
                V1(n45.p0(), -9223372036854775807L, true);
            } else {
                V1(i, -9223372036854775807L, false);
            }
        } else if (!K1() || !y1()) {
            S1();
        } else {
            V1(n45.p0(), -9223372036854775807L, false);
        }
    }

    public void K0() {
        n45 n45 = (n45) this;
        n45.w2();
        X1(12, n45.L0);
    }

    public boolean K1() {
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        return !x0.q() && x0.n(n45.p0(), (tje) this.b, 0).a();
    }

    public void L0() {
        n45 n45 = (n45) this;
        n45.w2();
        X1(11, -n45.K0);
    }

    public abstract void L1(Object obj, Object obj2);

    public boolean M() {
        int i;
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            i = -1;
        } else {
            int p0 = n45.p0();
            n45.w2();
            int i2 = n45.V0;
            if (i2 == 1) {
                i2 = 0;
            }
            n45.w2();
            i = x0.l(p0, i2, n45.W0);
        }
        return i != -1;
    }

    public void M1(u2 u2Var) {
        ((BitSet) this.b).or((BitSet) u2Var.b);
    }

    public abstract boolean N1();

    public abstract int O();

    public abstract uje O1();

    public d34 P1() {
        return (d34) ((t97) this.b).getValue();
    }

    public abstract void Q1();

    public l68 R0() {
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            return null;
        }
        return x0.n(n45.p0(), (tje) this.b, 0).c;
    }

    public void R1(a34 a34) {
        P1().b(a34.b, (Bundle) null);
    }

    public void S(int i) {
        ((n45) this).U(i, i + 1);
    }

    public void S1() {
        ((n45) this).w2();
    }

    public Object T0(Object obj, k77 k77) {
        return this.b;
    }

    public boolean T1(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        dfe dfe = (dfe) this.b;
        if (dfe == null) {
            return N1();
        }
        int d = dfe.d(i, charSequence);
        if (d == 0) {
            return true;
        }
        if (d != 1) {
            return N1();
        }
        return false;
    }

    public boolean U1() {
        int i;
        jmd jmd = (jmd) this.b;
        View view = jmd.c.Y0;
        if (view != null) {
            i = 4;
            if (!(view.getAlpha() == 0.0f && view.getVisibility() == 0)) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility == 8) {
                        i = 3;
                    } else {
                        throw new IllegalArgumentException(wn6.h(visibility, "Unknown visibility "));
                    }
                }
            }
        } else {
            i = 0;
        }
        int i2 = jmd.a;
        return i == i2 || !(i == 2 || i2 == 2);
    }

    public void V() {
        n45 n45 = (n45) this;
        if (n45.x0().q() || n45.n()) {
            S1();
            return;
        }
        boolean M = M();
        if (!K1() || n1()) {
            if (M) {
                long k = n45.k();
                n45.w2();
                if (k <= n45.M0) {
                    Y1(7);
                    return;
                }
            }
            W1(7, 0);
        } else if (M) {
            Y1(7);
        } else {
            S1();
        }
    }

    public abstract void V1(int i, long j, boolean z);

    public void W1(int i, long j) {
        V1(((n45) this).p0(), j, false);
    }

    public void X1(int i, long j) {
        n45 n45 = (n45) this;
        long k = n45.k() + j;
        long c = n45.c();
        if (c != -9223372036854775807L) {
            k = Math.min(k, c);
        }
        W1(i, Math.max(k, 0));
    }

    public void Y1(int i) {
        int i2;
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            i2 = -1;
        } else {
            int p0 = n45.p0();
            n45.w2();
            int i3 = n45.V0;
            if (i3 == 1) {
                i3 = 0;
            }
            n45.w2();
            i2 = x0.l(p0, i3, n45.W0);
        }
        if (i2 == -1) {
            S1();
        } else if (i2 == n45.p0()) {
            V1(n45.p0(), -9223372036854775807L, true);
        } else {
            V1(i2, -9223372036854775807L, false);
        }
    }

    public void Z(int i) {
        V1(i, -9223372036854775807L, false);
    }

    public boolean a() {
        n45 n45 = (n45) this;
        return n45.getPlaybackState() == 3 && n45.u() && n45.v0() == 0;
    }

    public abstract long b0();

    public void f0() {
        int i;
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            i = -1;
        } else {
            int p0 = n45.p0();
            n45.w2();
            int i2 = n45.V0;
            if (i2 == 1) {
                i2 = 0;
            }
            n45.w2();
            i = x0.e(p0, i2, n45.W0);
        }
        if (i == -1) {
            S1();
        } else if (i == n45.p0()) {
            V1(n45.p0(), -9223372036854775807L, true);
        } else {
            V1(i, -9223372036854775807L, false);
        }
    }

    public abstract int getRepeatMode();

    public boolean j0() {
        int i;
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            i = -1;
        } else {
            int p0 = n45.p0();
            n45.w2();
            int i2 = n45.V0;
            if (i2 == 1) {
                i2 = 0;
            }
            n45.w2();
            i = x0.e(p0, i2, n45.W0);
        }
        return i != -1;
    }

    public abstract long k();

    public abstract boolean n();

    public boolean n1() {
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        return !x0.q() && x0.n(n45.p0(), (tje) this.b, 0).h;
    }

    public abstract int o0();

    public void o1(Object obj, k77 k77, Object obj2) {
        Object obj3 = this.b;
        this.b = obj2;
        L1(obj3, obj2);
    }

    public long p() {
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        if (x0.q()) {
            return -9223372036854775807L;
        }
        int p0 = n45.p0();
        tje tje = (tje) this.b;
        if (x0.n(p0, tje, 0).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (oze.B(tje.g) - tje.f) - n45.b0();
    }

    public abstract int p0();

    public void pause() {
        ((n45) this).Y(false);
    }

    public void play() {
        ((n45) this).Y(true);
    }

    public abstract long q();

    public void r(int i, long j) {
        V1(i, j, false);
    }

    public void seekTo(long j) {
        W1(5, j);
    }

    public void setPlaybackSpeed(float f) {
        n45 n45 = (n45) this;
        n45.f(new wxa(f, n45.d().b));
    }

    public void t(l68 l68, long j) {
        ((n45) this).H0(0, j, ws6.n(l68));
    }

    public void t0(int i, int i2) {
        if (i != i2) {
            ((n45) this).u0(i, i + 1, i2);
        }
    }

    public boolean t1(int i) {
        n45 n45 = (n45) this;
        n45.w2();
        return n45.b1.a(i);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public void v() {
        ((n45) this).U(0, Integer.MAX_VALUE);
    }

    public void w0(List list) {
        ((n45) this).d0(Integer.MAX_VALUE, list);
    }

    public int x() {
        n45 n45 = (n45) this;
        long e0 = n45.e0();
        long c = n45.c();
        if (e0 == -9223372036854775807L || c == -9223372036854775807L) {
            return 0;
        }
        if (c == 0) {
            return 100;
        }
        return oze.j((int) ((e0 * 100) / c), 0, 100);
    }

    public boolean y1() {
        n45 n45 = (n45) this;
        vje x0 = n45.x0();
        return !x0.q() && x0.n(n45.p0(), (tje) this.b, 0).i;
    }

    public u2(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new tje();
                return;
            case 6:
                this.b = new ArrayList();
                return;
            case 7:
                this.b = new BitSet(20);
                return;
            case 8:
                this.b = e34.a.getAccessor().d(d34.class);
                return;
            default:
                this.b = new sje();
                return;
        }
    }

    public u2(MediaCodecInfo mediaCodecInfo, String str) {
        this.a = 5;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new Exception(rf0.h("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
