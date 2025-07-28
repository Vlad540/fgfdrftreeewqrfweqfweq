package defpackage;

import java.util.Objects;

/* renamed from: en5  reason: default package */
public final class en5 extends dhd implements e36 {
    public final an5 a;
    public final q3e b;
    public final lk0 c;

    public en5(an5 an5, b36 b36, lk0 lk0) {
        this.a = an5;
        this.b = b36;
        this.c = lk0;
    }

    public final an5 b() {
        return new cn5(this.a, this.b, this.c, 0);
    }

    public final void l(zhd zhd) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.d(new dn5(zhd, obj, this.c));
        } catch (Throwable th) {
            ek8.a0(th);
            cw4.c(th, zhd);
        }
    }
}
