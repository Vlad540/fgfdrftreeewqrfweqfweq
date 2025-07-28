package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: co5  reason: default package */
public final class co5 extends p0 {
    public final /* synthetic */ int c;
    public final Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co5(an5 an5, Object obj, int i) {
        super(an5);
        this.c = i;
        this.o = obj;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [ko5, dd4] */
    public final void g(b1e b1e) {
        an5 an5 = this.b;
        Object obj = this.o;
        switch (this.c) {
            case 0:
                dzc dzc = new dzc(b1e);
                fja.D(8, "capacityHint");
                azc azc = new azc(new hue());
                try {
                    Object apply = ((j26) obj).apply(azc);
                    Objects.requireNonNull(apply, "handler returned a null Publisher");
                    an5 an52 = (bjb) apply;
                    ao5 ao5 = new ao5(an5);
                    bo5 bo5 = new bo5(dzc, azc, ao5);
                    ao5.o = bo5;
                    b1e.e(bo5);
                    an52.f(ao5);
                    ao5.c(0);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    vw4.b(th, b1e);
                    return;
                }
            default:
                try {
                    Object obj2 = ((q3e) obj).get();
                    if (obj2 != null) {
                        h15 h15 = i15.a;
                        Collection collection = (Collection) obj2;
                        ? dd4 = new dd4(b1e);
                        dd4.b = collection;
                        an5.d(dd4);
                        return;
                    }
                    throw i15.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    vw4.b(th2, b1e);
                    return;
                }
        }
    }
}
