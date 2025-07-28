package defpackage;

/* renamed from: b90  reason: default package */
public final class b90 {
    public final int a;
    public final int b;
    public final sn1 c;

    public b90(int i, int i2, sn1 sn1) {
        this.a = i;
        this.b = i2;
        this.c = sn1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b90)) {
            return false;
        }
        b90 b90 = (b90) obj;
        return this.a == b90.a && this.b == b90.b && this.c.equals(b90.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
