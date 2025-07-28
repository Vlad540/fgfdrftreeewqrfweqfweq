package defpackage;

import java.util.Objects;

/* renamed from: et9  reason: default package */
public final class et9 extends ms9 {
    public final /* synthetic */ int a;
    public final q3e b;

    public /* synthetic */ et9(q3e q3e, int i) {
        this.a = i;
        this.b = q3e;
    }

    public final void q(bw9 bw9) {
        q3e q3e = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj = q3e.get();
                    Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
                    ((nv9) obj).a(bw9);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.b(th, bw9);
                    return;
                }
            default:
                try {
                    Object obj2 = q3e.get();
                    if (obj2 != null) {
                        h15 h15 = i15.a;
                        th = (Throwable) obj2;
                        cw4.b(th, bw9);
                        return;
                    }
                    throw i15.b("Supplier returned a null Throwable.");
                } catch (Throwable th2) {
                    th = th2;
                    ek8.a0(th);
                }
        }
    }
}
