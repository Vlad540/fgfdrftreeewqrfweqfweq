package defpackage;

/* renamed from: e6a  reason: default package */
public final class e6a {
    public final String a;
    public final p7c b;
    public final p7c c;
    public final int d;
    public final int e;

    public e6a(String str, p7c p7c, p7c p7c2, int i, int i2) {
        p7c = (i2 & 2) != 0 ? null : p7c;
        p7c2 = (i2 & 4) != 0 ? null : p7c2;
        i = (i2 & 16) != 0 ? 8192 : i;
        this.a = str;
        this.b = p7c;
        this.c = p7c2;
        this.d = 50;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6a)) {
            return false;
        }
        e6a e6a = (e6a) obj;
        return hhd.f(this.a, e6a.a) && hhd.f(this.b, e6a.b) && hhd.f(this.c, e6a.c) && this.d == e6a.d && this.e == e6a.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        p7c p7c = this.b;
        int hashCode2 = (hashCode + (p7c == null ? 0 : p7c.hashCode())) * 31;
        p7c p7c2 = this.c;
        if (p7c2 != null) {
            i = p7c2.hashCode();
        }
        return Integer.hashCode(this.e) + c3d.d(this.d, (hashCode2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Target(logName=");
        sb.append(this.a);
        sb.append(", includedTags=");
        sb.append(this.b);
        sb.append(", excludedTags=");
        sb.append(this.c);
        sb.append(", maxBufferEntriesCount=");
        sb.append(this.d);
        sb.append(", sizeLimitKb=");
        return wn6.j(sb, this.e, ")");
    }
}
