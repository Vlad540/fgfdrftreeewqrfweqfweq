package defpackage;

/* renamed from: lab  reason: default package */
public final class lab implements nab {
    public final Long a;

    public lab(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lab) && hhd.f(this.a, ((lab) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "UpdateSuccess(requestId=" + this.a + ")";
    }
}
