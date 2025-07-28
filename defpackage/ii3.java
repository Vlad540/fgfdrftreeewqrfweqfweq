package defpackage;

import java.util.Objects;

/* renamed from: ii3  reason: default package */
public final class ii3 {
    public static final ii3 e = new ii3("", hi3.o, "");
    public final String a;
    public final String b;
    public final hi3 c;
    public String d = null;

    public ii3(String str, hi3 hi3, String str2) {
        this.a = str;
        this.c = hi3;
        this.b = str2;
    }

    public final String a() {
        if (equals(e) || this.c == hi3.o) {
            return "";
        }
        String str = this.b;
        boolean q = r1g.q(str);
        String str2 = this.a;
        if (!q) {
            return r1g.p(str2) ? "" : str2;
        }
        if (this.d == null) {
            this.d = str2 + " " + str;
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii3)) {
            return false;
        }
        ii3 ii3 = (ii3) obj;
        return this.c == ii3.c && Objects.equals(this.a, ii3.a) && this.b.equals(ii3.b);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.b);
        return Objects.hashCode(this.c) + ((hashCode + (Objects.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = me4.n(ii3.class.getSimpleName(), "type=");
        n.append(this.c);
        n.append(",f=");
        n.append(r1g.q(this.a));
        n.append(",l=");
        n.append(r1g.q(this.b));
        return n.toString();
    }
}
