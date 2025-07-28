package defpackage;

import java.util.Objects;

/* renamed from: yte  reason: default package */
public final class yte {
    public final grd a;

    public yte() {
        kp kpVar = vl.b().n().c;
        this.a = hrd.a(Float.valueOf(kpVar.g.getFloat("app.extra.text.size.sp", 0.0f)));
        jk0 jk0 = kpVar.h;
        jk0.getClass();
        c97 c97 = new c97(new c9(25, this), z3d.k, z3d.i);
        Objects.requireNonNull(c97, "observer is null");
        try {
            jk0.a(new ht9(c97));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            xs7.F(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
