package defpackage;

import java.util.List;

/* renamed from: le2  reason: default package */
public final class le2 {
    public static final le2 d = new le2(hw4.a, false, false);
    public final List a;
    public final boolean b;
    public final boolean c;

    public le2(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le2)) {
            return false;
        }
        le2 le2 = (le2) obj;
        return hhd.f(this.a, le2.a) && this.b == le2.b && this.c == le2.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + th2.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesViewState(messages=");
        sb.append(this.a);
        sb.append(", hasMoreNext=");
        sb.append(this.b);
        sb.append(", hasMorePrev=");
        return hr1.j(sb, this.c, ")");
    }
}
