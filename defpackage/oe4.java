package defpackage;

/* renamed from: oe4  reason: default package */
public final class oe4 {
    public final pjb a;
    public final int b;
    public final int c;

    public oe4(int i, int i2, Class cls) {
        this(pjb.a(cls), i, i2);
    }

    public static oe4 a(Class cls) {
        return new oe4(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oe4)) {
            return false;
        }
        oe4 oe4 = (oe4) obj;
        return this.a.equals(oe4.a) && this.b == oe4.b && this.c == oe4.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else if (i2 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(wn6.h(i2, "Unsupported injection: "));
        }
        return wn6.l(sb, str, "}");
    }

    public oe4(pjb pjb, int i, int i2) {
        this.a = pjb;
        this.b = i;
        this.c = i2;
    }
}
