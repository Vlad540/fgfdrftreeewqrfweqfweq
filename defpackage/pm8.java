package defpackage;

import java.util.List;

/* renamed from: pm8  reason: default package */
public final class pm8 implements g55 {
    public final g55 a;
    public final uoe b;

    public pm8(g55 g55, uoe uoe) {
        this.a = g55;
        this.b = uoe;
    }

    public final uoe a() {
        return this.b;
    }

    public final int b() {
        return this.a.b();
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final xu5 d(int i) {
        return this.b.d[this.a.f(i)];
    }

    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm8)) {
            return false;
        }
        pm8 pm8 = (pm8) obj;
        return this.a.equals(pm8.a) && this.b.equals(pm8.b);
    }

    public final int f(int i) {
        return this.a.f(i);
    }

    public final int g(long j, List list) {
        return this.a.g(j, list);
    }

    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    public final int i() {
        return this.a.i();
    }

    public final xu5 j() {
        return this.b.d[this.a.i()];
    }

    public final int k() {
        return this.a.k();
    }

    public final void l(float f) {
        this.a.l(f);
    }

    public final int length() {
        return this.a.length();
    }

    public final Object m() {
        return this.a.m();
    }

    public final void n() {
        this.a.n();
    }

    public final void o() {
        this.a.o();
    }

    public final int p(int i) {
        return this.a.p(i);
    }

    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    public final void r(long j, long j2, long j3, List list, a28[] a28Arr) {
        this.a.r(j, j2, j3, list, a28Arr);
    }

    public final int s(xu5 xu5) {
        return this.a.p(this.b.d(xu5));
    }

    public final boolean t(long j, zx2 zx2, List list) {
        return this.a.t(j, zx2, list);
    }

    public final boolean u(int i, long j) {
        return this.a.u(i, j);
    }
}
