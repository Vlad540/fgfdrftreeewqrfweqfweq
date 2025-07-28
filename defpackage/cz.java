package defpackage;

/* renamed from: cz  reason: default package */
public final class cz extends ez {
    public final long a;
    public final mge b;

    public cz(long j, lge lge) {
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
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return this.a == czVar.a && hhd.f(this.b, czVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Success(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
