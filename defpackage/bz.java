package defpackage;

/* renamed from: bz  reason: default package */
public final class bz extends ez {
    public final long a;
    public final mge b;

    public bz(long j, lge lge) {
        this.a = j;
        this.b = lge;
    }

    public final long a() {
        return this.a;
    }

    public final mge b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return this.a == bzVar.a && hhd.f(this.b, bzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NeedDownload(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
