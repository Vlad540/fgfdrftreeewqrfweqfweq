package defpackage;

import java.util.List;

/* renamed from: uc6  reason: default package */
public final class uc6 implements wc6 {
    public final String a;
    public final mge b;
    public final List c;

    public uc6(String str, mge mge, List list) {
        this.a = str;
        this.b = mge;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc6)) {
            return false;
        }
        uc6 uc6 = (uc6) obj;
        return hhd.f(this.a, uc6.a) && hhd.f(this.b, uc6.b) && hhd.f(this.c, uc6.c);
    }

    public final int hashCode() {
        int e = c3d.e(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return e + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(conversationId=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", avatarInfo=");
        return hr1.i(sb, this.c, ")");
    }
}
