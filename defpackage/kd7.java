package defpackage;

/* renamed from: kd7  reason: default package */
public final class kd7 extends md7 {
    public final long a;
    public final String b;

    public kd7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd7)) {
            return false;
        }
        kd7 kd7 = (kd7) obj;
        return this.a == kd7.a && hhd.f(this.b, kd7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorLinkInfo(requestId=");
        sb.append(this.a);
        sb.append(", error=");
        return wn6.l(sb, this.b, ")");
    }
}
