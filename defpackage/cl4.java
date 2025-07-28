package defpackage;

/* renamed from: cl4  reason: default package */
public final class cl4 implements dl4 {
    public final float a;
    public final long b;
    public final long c;

    public cl4(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl4)) {
            return false;
        }
        cl4 cl4 = (cl4) obj;
        return Float.compare(this.a, cl4.a) == 0 && this.b == cl4.b && this.c == cl4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + sxe.m(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ", time=" + this.b + ", botId=" + this.c + ")";
    }
}
