package defpackage;

import java.util.Objects;

/* renamed from: jhd  reason: default package */
public final class jhd extends dhd {
    public final /* synthetic */ int a;
    public final q3e b;

    public /* synthetic */ jhd(q3e q3e, int i) {
        this.a = i;
        this.b = q3e;
    }

    public final void l(zhd zhd) {
        q3e q3e = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj = q3e.get();
                    Objects.requireNonNull(obj, "The singleSupplier returned a null SingleSource");
                    ((dhd) obj).k(zhd);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.c(th, zhd);
                    return;
                }
            default:
                try {
                    Object obj2 = q3e.get();
                    if (obj2 != null) {
                        h15 h15 = i15.a;
                        th = (Throwable) obj2;
                        cw4.c(th, zhd);
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
