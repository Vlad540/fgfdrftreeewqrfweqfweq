package defpackage;

import java.util.Objects;

/* renamed from: nn5  reason: default package */
public final class nn5 extends p0 {
    public final int X;
    public final int Y;
    public final j26 c;
    public final boolean o = false;

    public nn5(an5 an5, ice ice, int i, int i2) {
        super(an5);
        this.c = ice;
        this.X = i;
        this.Y = i2;
    }

    public final void g(b1e b1e) {
        an5 an5 = this.b;
        boolean z = an5 instanceof q3e;
        j26 j26 = this.c;
        if (z) {
            try {
                Object obj = ((q3e) an5).get();
                if (obj == null) {
                    vw4.a(b1e);
                    return;
                }
                try {
                    Object apply = j26.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    q3e q3e = (bjb) apply;
                    if (q3e instanceof q3e) {
                        try {
                            Object obj2 = q3e.get();
                            if (obj2 == null) {
                                vw4.a(b1e);
                            } else {
                                b1e.e(new clc(b1e, obj2));
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
            } catch (Throwable th3) {
                ek8.a0(th3);
                vw4.b(th3, b1e);
            }
        } else {
            an5.d(new mn5(b1e, j26, this.o, this.X, this.Y));
        }
    }
}
