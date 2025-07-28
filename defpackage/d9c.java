package defpackage;

/* renamed from: d9c  reason: default package */
public final class d9c extends lbe {
    public final Long c;

    public d9c(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9c) && hhd.f(this.c, ((d9c) obj).c);
    }

    public final int hashCode() {
        Long l = this.c;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return i0e.E("Response(\n            |timestampRemoveProfile=" + this.c + "\n            |)");
    }
}
