package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: ts9  reason: default package */
public final class ts9 extends w2 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts9(nv9 nv9, Object obj, Object obj2, int i) {
        super(nv9);
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    public final void q(bw9 bw9) {
        nv9 nv9 = this.a;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj3 = ((q3e) obj2).get();
                    Objects.requireNonNull(obj3, "The initialSupplier returned a null value");
                    nv9.a(new ss9(bw9, obj3, (lk0) obj, 0));
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.b(th, bw9);
                    return;
                }
            case 1:
                try {
                    Object obj4 = ((q3e) obj2).get();
                    if (obj4 != null) {
                        h15 h15 = i15.a;
                        nv9.a(new gt9(bw9, (j26) obj, (Collection) obj4));
                        return;
                    }
                    throw i15.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    cw4.b(th2, bw9);
                    return;
                }
            default:
                nv9.a(new cj4(bw9, (of3) obj2, (j6) obj));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ts9(nv9 nv9, j26 j26) {
        super(nv9);
        this.b = 1;
        a36 a36 = a36.a;
        this.o = j26;
        this.c = a36;
    }
}
