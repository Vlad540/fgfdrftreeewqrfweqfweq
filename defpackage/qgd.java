package defpackage;

/* renamed from: qgd  reason: default package */
public final class qgd {
    public final int a;
    public final mge b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public qgd(int i, mge mge, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = mge;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.qgd) r5;
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
            boolean r1 = r5 instanceof defpackage.qgd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            qgd r5 = (defpackage.qgd) r5
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
            java.lang.Integer r1 = r4.c
            java.lang.Integer r3 = r5.c
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
            java.lang.Integer r4 = r4.e
            java.lang.Integer r5 = r5.e
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x003f
            return r2
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = c3d.e(Integer.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        Integer num = this.c;
        int hashCode = (e2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SimpleContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }
}
