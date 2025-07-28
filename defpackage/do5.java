package defpackage;

import java.util.Objects;

/* renamed from: do5  reason: default package */
public final class do5 extends an5 {
    public final Object b;
    public final j26 c;

    public do5(Object obj, ice ice) {
        this.b = obj;
        this.c = ice;
    }

    public final void g(b1e b1e) {
        try {
            Object apply = this.c.apply(this.b);
            Objects.requireNonNull(apply, "The mapper returned a null Publisher");
            q3e q3e = (bjb) apply;
            if (q3e instanceof q3e) {
                try {
                    Object obj = q3e.get();
                    if (obj == null) {
                        vw4.a(b1e);
                    } else {
                        b1e.e(new clc(b1e, obj));
                    }
                } catch (Throwable th) {
                    ek8.a0(th);
                    vw4.b(th, b1e);
                }
            } else {
                ((an5) q3e).f(b1e);
            }
        } catch (Throwable th2) {
            ek8.a0(th2);
            vw4.b(th2, b1e);
        }
    }
}
