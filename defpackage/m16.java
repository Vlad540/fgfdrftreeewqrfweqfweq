package defpackage;

/* renamed from: m16  reason: default package */
public final class m16 {
    public final String a;
    public final String b;
    public final m16 c;

    public m16(String str, String str2, m16 m16) {
        this.a = str;
        this.b = str2;
        this.c = m16;
    }

    public static m16 a(m16 m16, String str) {
        String str2 = m16.a;
        m16 m162 = m16.c;
        m16.getClass();
        return new m16(str2, str, m162);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16 = (m16) obj;
        return hhd.f(this.a, m16.a) && hhd.f(this.b, m16.b) && hhd.f(this.c, m16.c);
    }

    public final int hashCode() {
        int d = me4.d(this.a.hashCode() * 31, 31, this.b);
        m16 m16 = this.c;
        return d + (m16 == null ? 0 : m16.hashCode());
    }

    public final String toString() {
        return "Result(normalized=" + this.a + ", original=" + this.b + ", noEmoji=" + this.c + ")";
    }
}
