package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: qja  reason: default package */
public final class qja implements ne1, vl1 {
    public static final qja c = new qja(xja.a(), new cze(0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, true, (String) null));
    public final ne1 a;
    public final vl1 b;

    public qja(ne1 ne1, vl1 vl1) {
        this.a = ne1;
        this.b = vl1;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final long d() {
        return this.b.d();
    }

    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qja)) {
            return false;
        }
        qja qja = (qja) obj;
        return hhd.f(this.a, qja.a) && hhd.f(this.b, qja.b);
    }

    public final boolean f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }

    public final le1 getId() {
        return this.a.getId();
    }

    public final String getName() {
        return this.b.getName();
    }

    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i() {
        return this.a.i();
    }

    public final boolean isConnected() {
        return this.a.isConnected();
    }

    public final boolean isScreenCaptureEnabled() {
        return this.a.isScreenCaptureEnabled();
    }

    public final CharSequence j() {
        return this.b.j();
    }

    public final boolean k() {
        return this.a.k();
    }

    public final boolean l() {
        return this.a.l();
    }

    public final boolean m() {
        return this.a.m();
    }

    public final boolean n() {
        return this.a.n();
    }

    public final boolean o() {
        return this.a.o();
    }

    public final t8f p() {
        return this.a.p();
    }

    public final String q() {
        return this.b.q();
    }

    public final int r() {
        return this.a.r();
    }

    public final t8f s() {
        return this.a.s();
    }

    public final boolean t() {
        return this.a.t();
    }

    public final String toString() {
        return "ParticipantPair(member=" + this.a + ", user=" + this.b + ")";
    }
}
