package defpackage;

/* renamed from: tz1  reason: default package */
public final class tz1 implements uz1 {
    public final int a;
    public final String b;
    public final mge c;
    public final Integer d;
    public final boolean e;

    public tz1(int i, String str, mge mge, Integer num, boolean z) {
        this.a = i;
        this.b = str;
        this.c = mge;
        this.d = num;
        this.e = z;
    }

    public static tz1 a(tz1 tz1, String str, mge mge, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            str = tz1.b;
        }
        return new tz1(tz1.a, str, mge, num, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.tz1) r5;
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
            boolean r1 = r5 instanceof defpackage.tz1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tz1 r5 = (defpackage.tz1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            mge r1 = r4.c
            mge r3 = r5.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.Integer r1 = r4.d
            java.lang.Integer r3 = r5.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        mge mge = this.c;
        int hashCode3 = (hashCode2 + (mge == null ? 0 : mge.hashCode())) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.e) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(title=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", hint=");
        sb.append(this.c);
        sb.append(", hintColor=");
        sb.append(this.d);
        sb.append(", hasError=");
        return hr1.j(sb, this.e, ")");
    }
}
