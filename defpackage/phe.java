package defpackage;

/* renamed from: phe  reason: default package */
public final class phe {
    public final p6e a;

    public phe(p6e p6e) {
        this.a = p6e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phe) && hhd.f(this.a, ((phe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SvgPattern(svgPattern=" + this.a + ")";
    }
}
