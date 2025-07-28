package defpackage;

/* renamed from: or5  reason: default package */
public final class or5 implements qr5 {
    public final long a;
    public final String b;

    public or5(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or5)) {
            return false;
        }
        or5 or5 = (or5) obj;
        return this.a == or5.a && hhd.f(this.b, or5.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenApp(appId=");
        sb.append(this.a);
        sb.append(", startParam=");
        return wn6.l(sb, this.b, ")");
    }
}
