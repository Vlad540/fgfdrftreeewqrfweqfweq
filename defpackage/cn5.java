package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: cn5  reason: default package */
public final class cn5 extends p0 {
    public final Object X;
    public final /* synthetic */ int c;
    public final q3e o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn5(an5 an5, q3e q3e, Object obj, int i) {
        super(an5);
        this.c = i;
        this.o = q3e;
        this.X = obj;
    }

    public final void g(b1e b1e) {
        an5 an5 = this.b;
        Object obj = this.X;
        q3e q3e = this.o;
        switch (this.c) {
            case 0:
                try {
                    Object obj2 = q3e.get();
                    Objects.requireNonNull(obj2, "The initial value supplied is null");
                    an5.d(new bn5(b1e, obj2, (lk0) obj));
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    vw4.b(th, b1e);
                    return;
                }
            case 1:
                try {
                    Object obj3 = q3e.get();
                    if (obj3 != null) {
                        h15 h15 = i15.a;
                        an5.d(new in5(b1e, (j26) obj, (Collection) obj3));
                        return;
                    }
                    throw i15.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    vw4.b(th2, b1e);
                    return;
                }
            default:
                try {
                    Object obj4 = q3e.get();
                    Objects.requireNonNull(obj4, "The seed supplied is null");
                    an5.d(new eo5(b1e, (mk0) obj, obj4, an5.a));
                    return;
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    vw4.b(th3, b1e);
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn5(rn5 rn5, dd9 dd9) {
        super(rn5);
        this.c = 1;
        a36 a36 = a36.a;
        this.X = dd9;
        this.o = a36;
    }
}
