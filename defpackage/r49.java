package defpackage;

import java.util.Set;

/* renamed from: r49  reason: default package */
public final class r49 {
    public final String a;
    public final CharSequence b;
    public final dv3 c;
    public final Set d;

    public r49(String str, CharSequence charSequence, dv3 dv3, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = dv3;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r49)) {
            return false;
        }
        r49 r49 = (r49) obj;
        return hhd.f(this.a, r49.a) && hhd.f(this.b, r49.b) && hhd.f(this.c, r49.c) && hhd.f(this.d, r49.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + c3d.d(this.c.a, me4.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MiniFolder(id=" + this.a + ", name=" + this.b + ", counter=" + this.c + ", options=" + this.d + ")";
    }
}
