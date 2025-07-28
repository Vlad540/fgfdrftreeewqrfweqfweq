package defpackage;

/* renamed from: fya  reason: default package */
public final class fya {
    public final wi5 a;

    public fya(wi5 wi5) {
        this.a = wi5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fya)) {
            return false;
        }
        return this.a.equals(((fya) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
