package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bk3  reason: default package */
public final class bk3 {
    public static final bk3 d = new bk3((List) null, (List) null, (List) null);
    public final List a;
    public final List b;
    public final List c;

    public bk3(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static bk3 a(bk3 bk3, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = bk3.a;
        }
        List list2 = bk3.b;
        List list3 = bk3.c;
        bk3.getClass();
        return new bk3(list, list2, list3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r1 = this;
            java.util.List r0 = r1.a
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x000a:
            java.util.List r0 = r1.b
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x0014:
            java.util.List r1 = r1.c
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk3.b():boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk3)) {
            return false;
        }
        bk3 bk3 = (bk3) obj;
        return hhd.f(this.a, bk3.a) && hhd.f(this.b, bk3.b) && hhd.f(this.c, bk3.c);
    }

    public final int hashCode() {
        int i = 0;
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactList(contacts=");
        sb.append(this.a);
        sb.append(", globalContacts=");
        sb.append(this.b);
        sb.append(", phonebook=");
        return hr1.i(sb, this.c, ")");
    }
}
