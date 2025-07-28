package defpackage;

/* renamed from: p90  reason: default package */
public final class p90 {
    public final ea0 a;
    public final int b;

    public p90(ea0 ea0, int i) {
        if (ea0 != null) {
            this.a = ea0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90 = (p90) obj;
        return this.a.equals(p90.a) && this.b == p90.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return wn6.j(sb, this.b, "}");
    }
}
