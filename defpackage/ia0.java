package defpackage;

/* renamed from: ia0  reason: default package */
public final class ia0 {
    public final ir4 a;
    public final ir4 b;
    public final int c;
    public final int d;

    public ia0(ir4 ir4, ir4 ir42, int i, int i2) {
        this.a = ir4;
        this.b = ir42;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        ia0 ia0 = (ia0) obj;
        return this.a.equals(ia0.a) && this.b.equals(ia0.b) && this.c == ia0.c && this.d == ia0.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormat=");
        return wn6.j(sb, this.d, "}");
    }
}
