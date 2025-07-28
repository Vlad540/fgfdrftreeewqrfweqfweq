package defpackage;

/* renamed from: nk4  reason: default package */
public final class nk4 implements pk4 {
    public final float a;
    public final long b;
    public final long c;

    public nk4(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk4)) {
            return false;
        }
        nk4 nk4 = (nk4) obj;
        return Float.compare(this.a, nk4.a) == 0 && this.b == nk4.b && this.c == nk4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + sxe.m(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ", time=" + this.b + ", chatId=" + this.c + ")";
    }
}
