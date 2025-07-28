package defpackage;

import java.io.File;

/* renamed from: uq6  reason: default package */
public final class uq6 extends gh0 {
    public final /* synthetic */ wq6 a;
    public final /* synthetic */ tr6 b;
    public final /* synthetic */ xq6 c;

    public uq6(xq6 xq6, wq6 wq6, tr6 tr6) {
        this.c = xq6;
        this.a = wq6;
        this.b = tr6;
    }

    public final void e(g0 g0Var) {
        this.c.b(this.a);
    }

    public final void f(g0 g0Var) {
        if (g0Var.h()) {
            e13 e13 = (e13) g0Var.e();
            wq6 wq6 = this.a;
            xq6 xq6 = this.c;
            if (e13 == null) {
                xq6.b(wq6);
                return;
            }
            k0b k0b = new k0b((jl8) e13.e0());
            try {
                t97 t97 = mq6.d;
                String str = xy6.r(k0b).b;
                if ("webp".equalsIgnoreCase(str)) {
                    a06.u().a(this.b, (Object) null).m(new vq6(xq6, wq6, (bf5) xq6.a.getValue()), xn1.a);
                } else {
                    File a2 = ((bf5) xq6.a.getValue()).a(str);
                    ete.E(k0b, a2);
                    String absolutePath = a2.getAbsolutePath();
                    if (wq6 != null) {
                        xq6.c(new zo5(wq6, 6, absolutePath));
                    }
                }
            } catch (Exception e) {
                udd.s("xq6", "onNewResultImpl: failed to save image", e);
                xq6.b(wq6);
            } catch (Throwable th) {
                g13.b(k0b);
                e13.S(e13);
                throw th;
            }
            g13.b(k0b);
            e13.S(e13);
        }
    }
}
