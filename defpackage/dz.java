package defpackage;

/* renamed from: dz  reason: default package */
public final class dz extends ez {
    public final long a;
    public final float b;
    public final mge c;

    public dz(long j, float f, lge lge) {
        this.a = j;
        this.b = f;
        this.c = lge;
    }

    public final long a() {
        return this.a;
    }

    public final mge b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return this.a == dzVar.a && Float.compare(this.b, dzVar.b) == 0 && hhd.f(this.c, dzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + th2.e(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
