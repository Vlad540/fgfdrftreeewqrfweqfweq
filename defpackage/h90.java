package defpackage;

/* renamed from: h90  reason: default package */
public final class h90 {
    public final Object a;
    public final ka0 b;

    public h90(u29 u29, ka0 ka0) {
        this.a = u29;
        this.b = ka0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90 = (h90) obj;
        h90.getClass();
        if (this.a.equals(h90.a)) {
            t3b t3b = t3b.a;
            if (t3b.equals(t3b)) {
                ka0 ka0 = h90.b;
                ka0 ka02 = this.b;
                if (ka02 == null) {
                    if (ka0 == null) {
                        return true;
                    }
                } else if (ka02.equals(ka0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ t3b.a.hashCode()) * 1000003;
        ka0 ka0 = this.b;
        return (ka0 == null ? 0 : ka0.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + t3b.a + ", productData=" + this.b + "}";
    }
}
