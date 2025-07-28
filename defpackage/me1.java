package defpackage;

import java.util.List;

/* renamed from: me1  reason: default package */
public final class me1 implements ne1 {
    public final le1 a;
    public final k88 b;
    public final k88 c;
    public final k88 d;
    public final boolean e;
    public final boolean f;
    public final t8f g;
    public final t8f h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final int v;

    public me1(le1 le1, k88 k88, k88 k882, k88 k883, boolean z, boolean z2, t8f t8f, t8f t8f2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, List list, int i2) {
        this.a = le1;
        this.b = k88;
        this.c = k882;
        this.d = k883;
        this.e = z;
        this.f = z2;
        this.g = t8f;
        this.h = t8f2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = j2;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = z13;
        this.u = list;
        this.v = i2;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me1)) {
            return false;
        }
        me1 me1 = (me1) obj;
        return hhd.f(this.a, me1.a) && this.b == me1.b && this.c == me1.c && this.d == me1.d && this.e == me1.e && this.f == me1.f && hhd.f(this.g, me1.g) && hhd.f(this.h, me1.h) && this.i == me1.i && this.j == me1.j && this.k == me1.k && this.l == me1.l && this.m == me1.m && this.n == me1.n && this.o == me1.o && this.p == me1.p && this.q == me1.q && this.r == me1.r && this.s == me1.s && this.t == me1.t && hhd.f(this.u, me1.u) && this.v == me1.v;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.p;
    }

    public final le1 getId() {
        return this.a;
    }

    public final boolean h() {
        return this.r;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int f2 = th2.f(th2.f((this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
        return hr1.t(this.v) + c3d.f(this.u, th2.f(th2.f(th2.f(th2.f(th2.f(th2.f(sxe.m(th2.f(th2.f(th2.f(th2.f(th2.f((this.h.hashCode() + ((this.g.hashCode() + f2) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31);
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean isConnected() {
        return this.l;
    }

    public final boolean k() {
        return this.q;
    }

    public final boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.o;
    }

    public final t8f p() {
        return this.h;
    }

    public final int r() {
        return this.v;
    }

    public final t8f s() {
        return this.g;
    }

    public final boolean t() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantImpl(id=");
        sb.append(this.a);
        sb.append(", audioOptionState=");
        sb.append(this.b);
        sb.append(", videoOptionState=");
        sb.append(this.c);
        sb.append(", screenShareOptionState=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        sb.append(this.e);
        sb.append(", isShareAudioEnabled=");
        sb.append(this.f);
        sb.append(", videoState=");
        sb.append(this.g);
        sb.append(", screenCaptureState=");
        sb.append(this.h);
        sb.append(", isCreator=");
        sb.append(this.i);
        sb.append(", isAdmin=");
        sb.append(this.j);
        sb.append(", isConnectedOnce=");
        sb.append(this.k);
        sb.append(", isConnected=");
        sb.append(this.l);
        sb.append(", isAccepted=");
        sb.append(this.m);
        sb.append(", acceptCallEpochMs=");
        sb.append(this.n);
        sb.append(", isSelf=");
        sb.append(this.o);
        sb.append(", isPrimarySpeaker=");
        sb.append(this.p);
        sb.append(", isTalking=");
        sb.append(this.q);
        sb.append(", isRaiseHand=");
        sb.append(this.r);
        sb.append(", hasRegisteredPeers=");
        sb.append(this.s);
        sb.append(", hasMediaBytes=");
        sb.append(this.t);
        sb.append(", movies=");
        sb.append(this.u);
        sb.append(", networkStatus=");
        int i2 = this.v;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "BAD" : "MEDIUM" : "GOOD");
        sb.append(")");
        return sb.toString();
    }
}
