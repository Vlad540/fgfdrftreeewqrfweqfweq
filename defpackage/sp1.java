package defpackage;

import java.util.List;

/* renamed from: sp1  reason: default package */
public final class sp1 {
    public final List a;
    public final boolean b;
    public final boolean c;

    public sp1(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static sp1 a(sp1 sp1, List list, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = sp1.a;
        }
        if ((i & 2) != 0) {
            z = sp1.b;
        }
        if ((i & 4) != 0) {
            z2 = sp1.c;
        }
        sp1.getClass();
        return new sp1(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp1)) {
            return false;
        }
        sp1 sp1 = (sp1) obj;
        return hhd.f(this.a, sp1.a) && this.b == sp1.b && this.c == sp1.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + th2.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsHistoryState(tabs=");
        sb.append(this.a);
        sb.append(", isGroupCallAvailable=");
        sb.append(this.b);
        sb.append(", isBannerVisible=");
        return hr1.j(sb, this.c, ")");
    }
}
