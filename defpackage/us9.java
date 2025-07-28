package defpackage;

import java.util.Objects;

/* renamed from: us9  reason: default package */
public final class us9 extends dhd implements f36 {
    public final nv9 a;
    public final q3e b;
    public final lk0 c;

    public us9(lx7 lx7, b36 b36, xsd xsd) {
        this.a = lx7;
        this.b = b36;
        this.c = xsd;
    }

    public final ms9 c() {
        return new ts9(this.a, this.b, this.c, 0);
    }

    public final void l(zhd zhd) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.a(new ss9(zhd, obj, this.c, 1));
        } catch (Throwable th) {
            ek8.a0(th);
            cw4.c(th, zhd);
        }
    }
}
