package defpackage;

/* renamed from: tt8  reason: default package */
public final class tt8 {
    public final int a;
    public final mge b;
    public final boolean c;
    public final mge d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public final Integer i;

    public tt8(int i2, mge mge, boolean z, mge mge2, String str, Integer num, Integer num2, boolean z2, Integer num3) {
        this.a = i2;
        this.b = mge;
        this.c = z;
        this.d = mge2;
        this.e = str;
        this.f = num;
        this.g = num2;
        this.h = z2;
        this.i = num3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.tt8) r5;
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
            boolean r1 = r5 instanceof defpackage.tt8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tt8 r5 = (defpackage.tt8) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r4.b
            mge r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            mge r1 = r4.d
            mge r3 = r5.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            java.lang.Integer r1 = r4.f
            java.lang.Integer r3 = r5.f
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0046
            return r2
        L_0x0046:
            java.lang.Integer r1 = r4.g
            java.lang.Integer r3 = r5.g
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0051
            return r2
        L_0x0051:
            boolean r1 = r4.h
            boolean r3 = r5.h
            if (r1 == r3) goto L_0x0058
            return r2
        L_0x0058:
            java.lang.Integer r4 = r4.i
            java.lang.Integer r5 = r5.i
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0063
            return r2
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int f2 = th2.f(c3d.e(hr1.t(this.a) * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        mge mge = this.d;
        int hashCode = (f2 + (mge == null ? 0 : mge.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int f3 = th2.f((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.h);
        Integer num3 = this.i;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return f3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuoteData(type=");
        int i2 = this.a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "FORWARD" : "REPLY" : "EDIT");
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", showVerificationMark=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", placeholder=");
        sb.append(this.f);
        sb.append(", count=");
        sb.append(this.g);
        sb.append(", isForwardAuthorHidden=");
        sb.append(this.h);
        sb.append(", startIconResId=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
