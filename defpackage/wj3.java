package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wj3  reason: default package */
public final class wj3 extends lbe implements co7 {
    public final List c;

    public wj3(List list) {
        this.c = list;
    }

    public final String a(boolean z, boolean z2) {
        return "CONTACT_INFO.Response(contacts=" + gwf.A(this.c, z, z2) + ')';
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.c) {
            if (((uj3) next) != sj3.E0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj3) && hhd.f(this.c, ((wj3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a(false, false);
    }
}
