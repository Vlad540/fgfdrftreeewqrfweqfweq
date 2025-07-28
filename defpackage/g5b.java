package defpackage;

import java.util.List;

/* renamed from: g5b  reason: default package */
public final class g5b {
    public final l5b a;
    public final List b;
    public final List c;

    public g5b(l5b l5b, List list, List list2) {
        this.a = l5b;
        this.b = list;
        this.c = list2;
    }

    public static g5b a(g5b g5b, l5b l5b, List list, int i) {
        if ((i & 2) != 0) {
            list = g5b.b;
        }
        return new g5b(l5b, list, g5b.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5b)) {
            return false;
        }
        g5b g5b = (g5b) obj;
        return hhd.f(this.a, g5b.a) && hhd.f(this.b, g5b.b) && hhd.f(this.c, g5b.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c3d.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(appBarState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", commonItems=");
        return hr1.i(sb, this.c, ")");
    }

    public /* synthetic */ g5b(l5b l5b, lg7 lg7) {
        this(l5b, lg7, hw4.a);
    }
}
