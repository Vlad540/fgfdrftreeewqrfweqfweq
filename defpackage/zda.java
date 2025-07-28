package defpackage;

/* renamed from: zda  reason: default package */
public final class zda implements bea {
    public final jea a;

    public zda(gea gea) {
        this.a = gea;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zda) && hhd.f(this.a, ((zda) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
