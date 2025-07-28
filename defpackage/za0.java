package defpackage;

/* renamed from: za0  reason: default package */
public final class za0 {
    public final int a = 0;
    public final q4e b;

    public za0(q4e q4e) {
        if (q4e != null) {
            this.b = q4e;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0 = (za0) obj;
        return this.a == za0.a && this.b.equals(za0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Event{eventCode=" + this.a + ", surfaceOutput=" + this.b + "}";
    }
}
