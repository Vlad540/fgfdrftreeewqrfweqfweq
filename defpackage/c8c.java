package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c8c  reason: default package */
public final class c8c implements zwc, bd3 {
    public static final /* synthetic */ k77[] D0;
    public final hcd A0;
    public final s0c B0;
    public final t0c C0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final /* synthetic */ waf a;
    public z7c b;
    public final ou3 c;
    public final s16 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final e3 z0 = hwf.t();

    static {
        k77 hc9 = new hc9(c8c.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        D0 = new k77[]{hc9};
    }

    public c8c(z7c z7c, ou3 ou3, mj9 mj9, r7e r7e, t97 t97, r7e r7e2, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = new waf(t97, new u1c(1));
        this.b = z7c;
        this.c = ou3;
        this.o = mj9;
        this.X = t972;
        this.Y = r7e2;
        this.Z = r7e;
        this.w0 = t973;
        this.x0 = t974;
        this.y0 = t975;
        hcd a2 = icd.a(1, 1, 2);
        this.A0 = a2;
        this.B0 = new s0c(a2);
        this.C0 = new t0c(hrd.a(cxa.a));
    }

    public final void a(hwc hwc) {
        this.A0.g(hwc);
    }

    public final void b(jwc jwc) {
        g37 a2 = this.a.a(this.c, ((pae) this.X.getValue()).b(), ru3.b, new b8c(jwc, this, (Continuation) null));
        this.z0.o1(this, D0[0], a2);
    }

    public final t0c c() {
        return this.C0;
    }

    public final void d(mi9 mi9) {
        this.A0.g(new hwc(mi9.a, mi9.b, mi9.c));
    }

    public final s0c e() {
        return this.B0;
    }

    public final s0c f() {
        return this.a.o;
    }

    public final ghe g() {
        return new ghe(utb.oneme_login_neuro_avatars_title, utb.oneme_login_neuro_avatars_description, utb.oneme_login_neuro_avatars_continue_button);
    }
}
