package defpackage;

import java.util.List;

/* renamed from: i46  reason: default package */
public final class i46 extends n46 {
    public final String a;
    public final List b;
    public final e46 c;

    public i46(String str, String str2, List list) {
        e46 e46 = new e46(str2);
        this.a = str;
        this.b = list;
        this.c = e46;
    }

    public final String[] a(h46 h46) {
        return new String[]{this.a};
    }

    public final String b() {
        return this.a;
    }

    public final o3 c() {
        return this.c;
    }

    public final List d() {
        return this.b;
    }

    public final String e(h46 h46) {
        String b2 = h46.b();
        return h46.a + " AND " + b2 + " = ?";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i46)) {
            return false;
        }
        i46 i46 = (i46) obj;
        return hhd.f(this.a, i46.a) && hhd.f(this.b, i46.b) && hhd.f(this.c, i46.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + c3d.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Real(id=" + this.a + ", queryParams=" + this.b + ", name=" + this.c + ")";
    }
}
