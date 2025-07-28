package defpackage;

/* renamed from: ck6  reason: default package */
public final class ck6 implements pg7 {
    public final String a;
    public final Boolean b;

    public ck6(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck6)) {
            return false;
        }
        ck6 ck6 = (ck6) obj;
        return hhd.f(this.a, ck6.a) && hhd.f(this.b, ck6.b);
    }

    public final boolean g(pg7 pg7) {
        return getItemId() == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) this.a.hashCode();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        ck6 ck6 = (pg7) obj;
        ck6 ck62 = ck6 instanceof ck6 ? ck6 : null;
        if (ck62 == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = ck62.b;
        if (!hhd.f(bool, bool2)) {
            return new bk6(bool2);
        }
        return null;
    }

    public final String toString() {
        return "HostItem(host=" + this.a + ", isSelected=" + this.b + ")";
    }
}
