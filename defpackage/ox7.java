package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ox7  reason: default package */
public final class ox7 extends ax7 implements q3e {
    public final Callable a;

    public ox7(Callable callable) {
        this.a = callable;
    }

    public final void g(wx7 wx7) {
        a7 a7Var = new a7(1, z3d.h);
        wx7.d(a7Var);
        if (!a7Var.h()) {
            try {
                Object call = this.a.call();
                if (a7Var.h()) {
                    return;
                }
                if (call == null) {
                    wx7.b();
                } else {
                    wx7.a(call);
                }
            } catch (Throwable th) {
                ek8.a0(th);
                if (!a7Var.h()) {
                    wx7.onError(th);
                } else {
                    xs7.F(th);
                }
            }
        }
    }

    public final Object get() {
        return this.a.call();
    }
}
