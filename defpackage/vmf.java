package defpackage;

/* renamed from: vmf  reason: default package */
public final class vmf extends sg9 {
    public final a34 b;

    public vmf(a34 a34) {
        super(jue.a);
        this.b = a34;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmf) && hhd.f(this.b, ((vmf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenAndClose(linkEvent=" + this.b + ")";
    }
}
