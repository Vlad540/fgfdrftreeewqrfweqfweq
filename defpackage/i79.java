package defpackage;

/* renamed from: i79  reason: default package */
public final class i79 {
    public final String a;
    public final int b;
    public final int c;

    public i79(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i79)) {
            return false;
        }
        i79 i79 = (i79) obj;
        return hhd.f(this.a, i79.a) && this.b == i79.b && this.c == i79.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + am7.a(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quality(link=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wn6.j(sb, this.c, ")");
    }
}
