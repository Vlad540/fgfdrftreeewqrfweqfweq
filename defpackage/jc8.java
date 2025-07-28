package defpackage;

import java.util.List;

/* renamed from: jc8  reason: default package */
public final class jc8 {
    public final ws6 a;
    public final int b;
    public final long c;

    public jc8(int i, long j, List list) {
        this.a = ws6.j(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc8)) {
            return false;
        }
        jc8 jc8 = (jc8) obj;
        if (this.a.equals(jc8.a)) {
            Integer valueOf = Integer.valueOf(this.b);
            Integer valueOf2 = Integer.valueOf(jc8.b);
            int i = oze.a;
            if (valueOf.equals(valueOf2) && Long.valueOf(this.c).equals(Long.valueOf(jc8.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return js.w(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
