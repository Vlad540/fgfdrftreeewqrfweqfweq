package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: kn8  reason: default package */
public final class kn8 extends dh0 {
    public final xm8 b;
    public final o10 c;
    public boolean d = false;
    public final /* synthetic */ mn8 e;

    public kn8(mn8 mn8, xm8 xm8, o10 o10) {
        this.e = mn8;
        this.b = xm8;
        this.c = o10;
    }

    public final void a(String str, oq6 oq6, Animatable animatable) {
        if (!this.d) {
            boolean z = true;
            this.d = true;
            boolean z2 = oq6 instanceof z03;
            o10 o10 = this.c;
            if (z2) {
                xs7.f((z03) oq6, o10);
            }
            if (!ete.G(o10) && !ete.J(o10) && !o10.n.c()) {
                g10 g10 = g10.c;
                mn8 mn8 = this.e;
                long j = mn8.C0.a.b;
                xm8 xm8 = this.b;
                if (j != xm8.a.b) {
                    z = false;
                }
                mn8.U(xm8, o10, g10, z);
                if (mn8.a.n().c.g.getBoolean("app.media.save.to.gallery", false)) {
                    sz szVar = new sz(this, 6, oq6);
                    be8 be8 = new be8(10);
                    mbe q = mn8.a.q();
                    q.getClass();
                    tic.a(szVar, ((nbe) q).a(), (j6) null, be8, (qmc) null);
                }
            }
        }
    }

    public final void d(String str, Throwable th) {
        Drawable drawable = mn8.Z0;
        StringBuilder sb = new StringBuilder("Set photo attach failed, messageId ");
        mn8 mn8 = this.e;
        sb.append(mn8.C0.a.b);
        udd.s("mn8", sb.toString(), th);
        if (!(th instanceof NullPointerException)) {
            g10 g10 = g10.o;
            long j = mn8.C0.a.b;
            xm8 xm8 = this.b;
            mn8.U(xm8, this.c, g10, j == xm8.a.b);
        }
    }
}
