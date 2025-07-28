package defpackage;

/* renamed from: a4d  reason: default package */
public final class a4d extends e1 {
    public final boolean n(ch7 ch7) {
        t0 t0Var;
        ch7.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (ch7.isDone()) {
                if (!k1.Y.l(this, (Object) null, k1.h(ch7))) {
                    return false;
                }
                k1.e(this, false);
            } else {
                z0 z0Var = new z0(this, ch7);
                if (k1.Y.l(this, (Object) null, z0Var)) {
                    try {
                        ch7.c(z0Var, lh4.a);
                    } catch (Throwable th) {
                        try {
                            t0Var = new t0(th);
                        } catch (Error | Exception unused) {
                            t0Var = t0.b;
                        }
                        k1.Y.l(this, z0Var, t0Var);
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        ch7.cancel(((q0) obj).a);
        return false;
    }
}
