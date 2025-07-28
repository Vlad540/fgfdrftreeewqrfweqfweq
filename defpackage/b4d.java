package defpackage;

/* renamed from: b4d  reason: default package */
public final class b4d extends l1 {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = l1.Z;
        }
        if (!l1.Y.h(this, (Object) null, obj)) {
            return false;
        }
        l1.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!l1.Y.h(this, (Object) null, new u0(th))) {
            return false;
        }
        l1.b(this);
        return true;
    }

    public final boolean l(ch7 ch7) {
        a1 a1Var;
        u0 u0Var;
        ch7.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (ch7.isDone()) {
                if (!l1.Y.h(this, (Object) null, l1.f(ch7))) {
                    return false;
                }
                l1.b(this);
            } else {
                a1Var = new a1(this, ch7);
                if (l1.Y.h(this, (Object) null, a1Var)) {
                    try {
                        ch7.c(a1Var, kh4.a);
                    } catch (Throwable unused) {
                        u0Var = u0.b;
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        ch7.cancel(((r0) obj).a);
        return false;
        l1.Y.h(this, a1Var, u0Var);
        return true;
    }
}
