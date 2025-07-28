package defpackage;

import java.util.Collection;

/* renamed from: ov9  reason: default package */
public final class ov9 extends w2 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov9(nv9 nv9, Object obj, int i) {
        super(nv9);
        this.b = i;
        this.c = obj;
    }

    public final void q(bw9 bw9) {
        nv9 nv9 = this.a;
        Object obj = this.c;
        switch (this.b) {
            case 0:
                pn1 pn1 = new pn1(bw9);
                bw9.d(pn1);
                bj4.e(pn1, ((qmc) obj).b(new q36((Object) this, (Object) pn1, false, 11)));
                return;
            case 1:
                nv9.a(new aw9(bw9, (y15) ((qmc) obj)));
                return;
            default:
                try {
                    Object obj2 = ((q3e) obj).get();
                    if (obj2 != null) {
                        h15 h15 = i15.a;
                        nv9.a(new i73(bw9, 4, (Collection) obj2));
                        return;
                    }
                    throw i15.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.b(th, bw9);
                    return;
                }
        }
    }
}
