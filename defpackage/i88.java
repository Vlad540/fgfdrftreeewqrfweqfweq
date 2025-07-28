package defpackage;

/* renamed from: i88  reason: default package */
public final class i88 implements p38, hya {
    public final vd8 a;
    public final kc8 b;

    public i88(vd8 vd8, kc8 kc8) {
        this.a = vd8;
        this.b = kc8;
    }

    public final void Y(kya kya, fya fya) {
        if (fya.a.a(4, 5, 14, 0)) {
            this.a.f(this.b, false);
        }
    }

    public final void e() {
        this.a.f(this.b, false);
    }

    public final void g() {
        this.a.f(this.b, false);
    }

    public final void onDisconnected() {
        vd8 vd8 = this.a;
        kc8 kc8 = this.b;
        if (vd8.d(kc8)) {
            vd8.g(kc8);
        }
        vd8.f(kc8, false);
    }

    public final void s(boolean z) {
        if (z) {
            this.a.f(this.b, false);
        }
    }
}
