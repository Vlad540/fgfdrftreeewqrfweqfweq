package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q9e  reason: default package */
public final class q9e {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public q9e(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add("ASC");
            }
            arrayList = arrayList2;
        }
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        q9e q9e;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e) || this.b != (q9e = (q9e) obj).b || !hhd.f(this.c, q9e.c) || !hhd.f(this.d, q9e.d)) {
            return false;
        }
        String str = this.a;
        boolean Q = p0e.Q(str, "index_", false);
        String str2 = q9e.a;
        return Q ? p0e.Q(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + c3d.f(this.c, (((p0e.Q(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.b);
        sb.append(", columns=");
        sb.append(this.c);
        sb.append(", orders=");
        return hr1.i(sb, this.d, "'}");
    }
}
