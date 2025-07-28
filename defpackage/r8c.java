package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: r8c  reason: default package */
public final class r8c implements xy5 {
    public final fr6 a;
    public final String b = r8c.class.getName();
    public uy5 c = uy5.d;
    public g0 d;
    public g0 e;

    public r8c(fr6 fr6) {
        this.a = fr6;
    }

    public final uy5 c() {
        return this.c;
    }

    public final boolean d() {
        v2f v2f = this.c.a;
        return (v2f != null ? v2f.b() : null) != null;
    }

    public final Object e(long j, Continuation continuation) {
        g0 g0Var = this.e;
        if (g0Var != null) {
            g0Var.a();
        }
        this.e = null;
        v2f v2f = this.c.a;
        xx b2 = v2f != null ? v2f.b() : null;
        if (v2f == null || b2 == null) {
            udd.s(this.b, "Video collage is null", (Throwable) null);
            return null;
        }
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        ur6 d2 = ur6.d(Uri.parse((String) b2.Y));
        d2.p = vl4.c;
        d2.l = new fz5(v2f, j);
        g0 a2 = this.a.a(d2.a(), (Object) null);
        this.e = a2;
        a2.m(new vq6(zv1, a2, this), xn1.a);
        return zv1.m();
    }

    public final void prepare() {
        v2f v2f = this.c.a;
        String str = this.b;
        if (v2f == null) {
            udd.s(str, "You should call init before prepare!", (Throwable) null);
            return;
        }
        xx b2 = v2f.b();
        if (b2 == null) {
            udd.s(str, "Video collage is null", (Throwable) null);
            return;
        }
        ur6 d2 = ur6.d(Uri.parse((String) b2.Y));
        d2.p = vl4.c;
        g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.a();
        }
        this.d = null;
        this.d = this.a.f(d2.a(), (m18) null);
    }
}
