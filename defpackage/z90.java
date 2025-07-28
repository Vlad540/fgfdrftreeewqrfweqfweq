package defpackage;

/* renamed from: z90  reason: default package */
public final class z90 {
    public final mb0 a;
    public final n80 b;
    public final int c;

    public z90(mb0 mb0, n80 n80, int i) {
        this.a = mb0;
        this.b = n80;
        this.c = i;
    }

    public static jg8 a() {
        jg8 jg8 = new jg8(2);
        jg8.o = -1;
        jg8.b = n80.a().h();
        jg8.c = mb0.a().a();
        return jg8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z90)) {
            return false;
        }
        z90 z90 = (z90) obj;
        return this.a.equals(z90.a) && this.b.equals(z90.b) && this.c == z90.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return wn6.j(sb, this.c, "}");
    }
}
