package defpackage;

/* renamed from: my7  reason: default package */
public final class my7 {
    public final ky7 a;
    public final ly7 b;

    public my7() {
        ky7 ky7 = new ky7();
        ly7 ly7 = new ly7();
        this.a = ky7;
        this.b = ly7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my7)) {
            return false;
        }
        my7 my7 = (my7) obj;
        return hhd.f(this.a, my7.a) && hhd.f(this.b, my7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }
}
