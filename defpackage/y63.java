package defpackage;

import java.util.concurrent.Callable;

/* renamed from: y63  reason: default package */
public final class y63 extends v63 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void j(g73 g73) {
        switch (this.a) {
            case 0:
                x63 x63 = new x63(0, g73);
                g73.d(x63);
                try {
                    ((h73) this.b).b(x63);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    if (!x63.a(th)) {
                        xs7.F(th);
                        return;
                    }
                    return;
                }
            case 1:
                a7 a7Var = new a7(1, z3d.h);
                g73.d(a7Var);
                if (!a7Var.h()) {
                    try {
                        ((j6) this.b).run();
                        if (!a7Var.h()) {
                            g73.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        if (!a7Var.h()) {
                            g73.onError(th2);
                            return;
                        } else {
                            xs7.F(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 2:
                a7 a7Var2 = new a7(1, z3d.h);
                g73.d(a7Var2);
                try {
                    ((Callable) this.b).call();
                    if (!a7Var2.h()) {
                        g73.b();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    if (!a7Var2.h()) {
                        g73.onError(th3);
                        return;
                    } else {
                        xs7.F(th3);
                        return;
                    }
                }
            default:
                ((dhd) this.b).k(new mb1(4, g73));
                return;
        }
    }
}
