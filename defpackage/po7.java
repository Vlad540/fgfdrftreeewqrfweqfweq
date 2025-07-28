package defpackage;

/* renamed from: po7  reason: default package */
public final class po7 extends qo7 {
    public final mge d;
    public final mge e;

    public po7(mge mge, mge mge2) {
        super(mge, (Throwable) null);
        this.d = mge;
        this.e = mge2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po7)) {
            return false;
        }
        po7 po7 = (po7) obj;
        return hhd.f(this.d, po7.d) && hhd.f(this.e, po7.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SmsCountExceeded(title=" + this.d + ", description=" + this.e + ")";
    }
}
