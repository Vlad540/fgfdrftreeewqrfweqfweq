package defpackage;

import java.util.List;

/* renamed from: dp6  reason: default package */
public final class dp6 {
    public static final dp6 d;
    public final List a;
    public final List b;
    public final List c;

    static {
        hw4 hw4 = hw4.a;
        d = new dp6(hw4, hw4, hw4);
    }

    public dp6(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp6)) {
            return false;
        }
        dp6 dp6 = (dp6) obj;
        return hhd.f(this.a, dp6.a) && hhd.f(this.b, dp6.b) && hhd.f(this.c, dp6.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c3d.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        if (this == d) {
            return dp6.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("IdleSearchData(recentContacts=");
        sb.append(o23.c0(this.a, ",", "[", "]", new t13(23), 24));
        sb.append(", recentSearch=");
        sb.append(o23.c0(this.b, ",", "[", "]", new t13(24), 24));
        sb.append(", allContacts=");
        return wn6.l(sb, o23.c0(this.c, ",", "[", "]", new t13(25), 24), ")");
    }
}
