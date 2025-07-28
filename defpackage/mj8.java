package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mj8  reason: default package */
public final class mj8 {
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public mj8(List list, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = list;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj8)) {
            return false;
        }
        mj8 mj8 = (mj8) obj;
        return hhd.f(this.a, mj8.a) && hhd.f(this.b, mj8.b) && hhd.f(this.c, mj8.c) && this.d == mj8.d && this.e == mj8.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + th2.f(c3d.f(this.c, c3d.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(items=");
        sb.append(this.a);
        sb.append(", topActions=");
        sb.append(this.b);
        sb.append(", bottomAction=");
        sb.append(this.c);
        sb.append(", isSearch=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return hr1.j(sb, this.e, ")");
    }
}
