package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: iy1  reason: default package */
public final class iy1 {
    public static final iy1 c = new iy1(o23.w0(new ArrayList()), (n06) null);
    public final Set a;
    public final n06 b;

    public iy1(Set set, n06 n06) {
        this.a = set;
        this.b = n06;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iy1) {
            iy1 iy1 = (iy1) obj;
            return hhd.f(iy1.a, this.a) && hhd.f(iy1.b, this.b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        n06 n06 = this.b;
        return hashCode + (n06 != null ? n06.hashCode() : 0);
    }
}
