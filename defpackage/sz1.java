package defpackage;

/* renamed from: sz1  reason: default package */
public final class sz1 implements uz1 {
    public final int a;
    public final rz1 b;
    public final String c;
    public final mge d;
    public final Integer e;
    public final boolean f;

    public sz1(int i, rz1 rz1, String str, mge mge, Integer num, boolean z) {
        this.a = i;
        this.b = rz1;
        this.c = str;
        this.d = mge;
        this.e = num;
        this.f = z;
    }

    public static sz1 a(sz1 sz1, String str, mge mge, Integer num, boolean z, int i) {
        if ((i & 4) != 0) {
            str = sz1.c;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = sz1.f;
        }
        return new sz1(sz1.a, sz1.b, str2, mge, num, z);
    }

    public final boolean b(uz1 uz1) {
        if (uz1 == null || !(uz1 instanceof sz1)) {
            return false;
        }
        sz1 sz1 = (sz1) uz1;
        return this.b != sz1.b || !hhd.f(this.c, sz1.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.sz1) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.sz1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            sz1 r5 = (defpackage.sz1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            rz1 r1 = r4.b
            rz1 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            mge r1 = r4.d
            mge r3 = r5.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.Integer r1 = r4.e
            java.lang.Integer r3 = r5.e
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L_0x0042
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        mge mge = this.d;
        int hashCode3 = (hashCode2 + (mge == null ? 0 : mge.hashCode())) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", link=");
        sb.append(this.c);
        sb.append(", hint=");
        sb.append(this.d);
        sb.append(", hintColor=");
        sb.append(this.e);
        sb.append(", hasError=");
        return hr1.j(sb, this.f, ")");
    }

    public /* synthetic */ sz1(rz1 rz1, String str) {
        this(i8a.d2, rz1, str, (mge) null, (Integer) null, false);
    }
}
