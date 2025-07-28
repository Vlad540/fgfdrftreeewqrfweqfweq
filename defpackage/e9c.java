package defpackage;

/* renamed from: e9c  reason: default package */
public final class e9c extends lbe {
    public final Long c;

    public e9c(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9c) && hhd.f(this.c, ((e9c) obj).c);
    }

    public final int hashCode() {
        Long l = this.c;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return i0e.E("Response(\n                    |timestampRemoveProfile=" + this.c + "\n                    |)");
    }
}
