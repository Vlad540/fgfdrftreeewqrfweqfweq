package defpackage;

/* renamed from: myb  reason: default package */
public final class myb extends nyb {
    public final long a;
    public final long b;
    public final float c;

    public myb(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myb)) {
            return false;
        }
        myb myb = (myb) obj;
        return this.a == myb.a && this.b == myb.b && Float.compare(this.c, myb.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ")";
    }
}
