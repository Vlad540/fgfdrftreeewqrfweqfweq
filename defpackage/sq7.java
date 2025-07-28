package defpackage;

/* renamed from: sq7  reason: default package */
public final class sq7 extends qq7 {
    static {
        new sq7(1, 0);
    }

    public sq7(long j, long j2) {
        super(j, j2);
    }

    public final boolean a(long j) {
        return this.a <= j && j <= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sq7) {
            if (!isEmpty() || !((sq7) obj).isEmpty()) {
                sq7 sq7 = (sq7) obj;
                if (this.a == sq7.a) {
                    if (this.b == sq7.b) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
