package defpackage;

/* renamed from: xr9  reason: default package */
public final class xr9 implements l77 {
    public final l77 a = d0e.a;
    public final tyc b = new tyc(d0e.b);

    public final Object a(b9 b9Var) {
        if (b9Var.r()) {
            return b9Var.u(this.a);
        }
        return null;
    }

    public final void b(ur3 ur3, Object obj) {
        if (obj != null) {
            ur3.l(this.a, obj);
        } else {
            ur3.h();
        }
    }

    public final syc d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xr9.class == obj.getClass() && hhd.f(this.a, ((xr9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
