package defpackage;

/* renamed from: se8  reason: default package */
public final class se8 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public se8(Object obj) {
        this(-1, obj);
    }

    public final se8 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new se8(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se8)) {
            return false;
        }
        se8 se8 = (se8) obj;
        return this.a.equals(se8.a) && this.b == se8.b && this.c == se8.c && this.d == se8.d && this.e == se8.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public se8(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public se8(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public se8(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
