package defpackage;

/* renamed from: jb0  reason: default package */
public final class jb0 {
    public static final jb0 d = new jb0(0, 0, 0);
    public static final jb0 e = new jb0(1, 3, 2);
    public static final jb0 f = new jb0(6, 7, 1);
    public static final jb0 g = new jb0(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public jb0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0 = (jb0) obj;
        return this.a == jb0.a && this.b == jb0.b && this.c == jb0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return wn6.j(sb, this.c, "}");
    }
}
