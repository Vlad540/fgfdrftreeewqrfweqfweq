package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: nzc  reason: default package */
public final class nzc {
    public static final /* synthetic */ int h = 0;
    public final long a;
    public final String b;
    public final List c;
    public final List d;
    public final Long e;
    public final Long f;
    public final long g;

    public nzc(long j, String str, List list, List list2, Long l, Long l2, long j2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = l;
        this.f = l2;
        this.g = j2;
    }

    public final Map a() {
        String str = this.b;
        wia wia = null;
        if (!r1g.q(str)) {
            str = null;
        }
        wia wia2 = str != null ? new wia("text", str) : null;
        List list = this.c;
        if (!(!list.isEmpty())) {
            list = null;
        }
        wia wia3 = list != null ? new wia("attaches", list) : null;
        List list2 = this.d;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        wia wia4 = list2 != null ? new wia("elements", list2) : null;
        Long l = this.e;
        wia wia5 = l != null ? new wia("replyTo", Long.valueOf(l.longValue())) : null;
        Long l2 = this.f;
        wia wia6 = l2 != null ? new wia("editOn", Long.valueOf(l2.longValue())) : null;
        long j = this.g;
        Long valueOf = Long.valueOf(j);
        if (j == 0) {
            valueOf = null;
        }
        wia wia7 = valueOf != null ? new wia("saveTime", Long.valueOf(valueOf.longValue())) : null;
        long j2 = this.a;
        Long valueOf2 = Long.valueOf(j2);
        if (j2 == 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            wia = new wia("cid", Long.valueOf(valueOf2.longValue()));
        }
        return ju7.V(cs.X(new wia[]{wia2, wia3, wia4, wia5, wia6, wia7, wia}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzc)) {
            return false;
        }
        nzc nzc = (nzc) obj;
        return this.a == nzc.a && hhd.f(this.b, nzc.b) && hhd.f(this.c, nzc.c) && hhd.f(this.d, nzc.d) && hhd.f(this.e, nzc.e) && hhd.f(this.f, nzc.f) && this.g == nzc.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int f2 = c3d.f(this.d, c3d.f(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Long l = this.e;
        int hashCode2 = (f2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return Long.hashCode(this.g) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerDraft(text=***, attaches=");
        sb.append(this.c);
        sb.append(", elements=");
        sb.append(this.d);
        sb.append(", replyTo=");
        sb.append(this.e);
        sb.append(", editOn=");
        sb.append(this.f);
        sb.append(", saveTime=");
        return wn6.k(sb, this.g, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ nzc(java.lang.String r13, java.util.List r14, java.lang.Long r15, java.lang.Long r16, int r17) {
        /*
            r12 = this;
            r0 = r17 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r5 = r1
            goto L_0x0008
        L_0x0007:
            r5 = r13
        L_0x0008:
            hw4 r6 = hw4.a
            r0 = r17 & 8
            if (r0 == 0) goto L_0x0010
            r7 = r6
            goto L_0x0011
        L_0x0010:
            r7 = r14
        L_0x0011:
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0017
            r8 = r1
            goto L_0x0018
        L_0x0017:
            r8 = r15
        L_0x0018:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x001e
            r9 = r1
            goto L_0x0020
        L_0x001e:
            r9 = r16
        L_0x0020:
            r10 = 0
            r3 = 0
            r2 = r12
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzc.<init>(java.lang.String, java.util.List, java.lang.Long, java.lang.Long, int):void");
    }
}
