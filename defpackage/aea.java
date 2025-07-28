package defpackage;

/* renamed from: aea  reason: default package */
public final class aea implements dea {
    public final jea a;
    public final jea b;

    public aea(jea jea, jea jea2) {
        this.a = jea;
        this.b = jea2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aea)) {
            return false;
        }
        aea aea = (aea) obj;
        return hhd.f(this.a, aea.a) && hhd.f(this.b, aea.b);
    }

    public final int hashCode() {
        int i = 0;
        jea jea = this.a;
        int hashCode = (jea == null ? 0 : jea.hashCode()) * 31;
        jea jea2 = this.b;
        if (jea2 != null) {
            i = jea2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IconButtons(secondaryButton=" + this.a + ", primaryButton=" + this.b + ")";
    }
}
