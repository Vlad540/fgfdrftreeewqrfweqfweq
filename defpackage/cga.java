package defpackage;

/* renamed from: cga  reason: default package */
public final class cga {
    public final dga a;

    public cga(dga dga) {
        this.a = dga;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cga) && hhd.f(this.a, ((cga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentPayload(page=" + this.a + ")";
    }
}
