package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hdc  reason: default package */
public final class hdc {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Long i;
    public final Map j;
    public final List k;
    public final Set l;
    public final boolean m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ hdc(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.util.Set r22, boolean r23, boolean r24, java.util.List r25, java.lang.Long r26, java.util.Map r27, java.util.List r28, java.util.Set r29, int r30) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r25
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r26
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r27
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r28
        L_0x0023:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0029
            r15 = r2
            goto L_0x002b
        L_0x0029:
            r15 = r29
        L_0x002b:
            r16 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (java.util.Set) r8, (boolean) r9, (boolean) r10, (java.util.List) r11, (java.lang.Long) r12, (java.util.Map) r13, (java.util.List) r14, (java.util.Set) r15, (boolean) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdc.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.util.Set, boolean, boolean, java.util.List, java.lang.Long, java.util.Map, java.util.List, java.util.Set, int):void");
    }

    public final ep5 a(List list, Set set, Set set2, v6a v6a) {
        List list2 = hw4.a;
        String str = this.b;
        List list3 = this.h;
        CharSequence b2 = v6a.b(v6a, str, list3);
        Set w0 = o23.w0(list);
        List list4 = list3 == null ? list2 : list3;
        iw4 iw4 = this.j;
        if (iw4 == null) {
            iw4 = iw4.a;
        }
        iw4 iw42 = iw4;
        List list5 = this.k;
        List list6 = list5 == null ? list2 : list5;
        qw4 qw4 = this.l;
        if (qw4 == null) {
            qw4 = qw4.a;
        }
        return new ep5(this.a, b2, this.c, this.d, list2, this.e, true, this.f, list, this.g, w0, set, set2, list4, this.i, iw42, list6, qw4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdc)) {
            return false;
        }
        hdc hdc = (hdc) obj;
        return hhd.f(this.a, hdc.a) && hhd.f(this.b, hdc.b) && hhd.f(this.c, hdc.c) && this.d == hdc.d && hhd.f(this.e, hdc.e) && this.f == hdc.f && this.g == hdc.g && hhd.f(this.h, hdc.h) && hhd.f(this.i, hdc.i) && hhd.f(this.j, hdc.j) && hhd.f(this.k, hdc.k) && hhd.f(this.l, hdc.l) && this.m == hdc.m;
    }

    public final int hashCode() {
        int d2 = me4.d(this.a.hashCode() * 31, 31, this.b);
        int i2 = 0;
        String str = this.c;
        int f2 = th2.f(th2.f((this.e.hashCode() + c3d.d(this.d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f), 31, this.g);
        List list = this.h;
        int hashCode = (f2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.i;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.j;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List list2 = this.k;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Set set = this.l;
        if (set != null) {
            i2 = set.hashCode();
        }
        return Boolean.hashCode(this.m) + ((hashCode4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomChatFolder(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.d);
        sb.append(", filters=");
        sb.append(this.e);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.f);
        sb.append(", hideIfEmpty=");
        sb.append(this.g);
        sb.append(", elements=");
        sb.append(this.h);
        sb.append(", creatorId=");
        sb.append(this.i);
        sb.append(", filterSubjects=");
        sb.append(this.j);
        sb.append(", widgets=");
        sb.append(this.k);
        sb.append(", options=");
        sb.append(this.l);
        sb.append(", isRemoved=");
        return hr1.j(sb, this.m, ")");
    }

    public hdc(String str, String str2, String str3, int i2, Set set, boolean z, boolean z2, List list, Long l2, Map map, List list2, Set set2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = l2;
        this.j = map;
        this.k = list2;
        this.l = set2;
        this.m = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hdc(defpackage.ep5 r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.CharSequence r1 = r0.b
            java.lang.String r4 = r1.toString()
            java.util.List r13 = r0.F0
            java.util.Set r14 = r0.G0
            java.lang.String r3 = r0.a
            java.lang.String r5 = r0.c
            int r6 = r0.o
            java.util.Set r7 = r0.Y
            boolean r8 = r0.w0
            boolean r9 = r0.y0
            java.util.List r10 = r0.C0
            java.lang.Long r11 = r0.D0
            java.util.Map r12 = r0.E0
            r15 = 4096(0x1000, float:5.74E-42)
            r2 = r16
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (int) r6, (java.util.Set) r7, (boolean) r8, (boolean) r9, (java.util.List) r10, (java.lang.Long) r11, (java.util.Map) r12, (java.util.List) r13, (java.util.Set) r14, (int) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdc.<init>(ep5):void");
    }
}
