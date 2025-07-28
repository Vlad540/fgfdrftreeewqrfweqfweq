package defpackage;

/* renamed from: o76  reason: default package */
public final class o76 implements jrd {
    public final qze a;
    public final vde b;

    public o76(qze qze, vde vde) {
        this.a = qze;
        this.b = vde;
    }

    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    public final boolean b(ha0 ha0) {
        if (ha0.b != 4 || this.a.a(ha0)) {
            return false;
        }
        String str = ha0.c;
        if (str != null) {
            this.b.b(new t90(ha0.e, str, ha0.f));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
