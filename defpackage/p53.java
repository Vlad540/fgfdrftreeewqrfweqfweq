package defpackage;

/* renamed from: p53  reason: default package */
public final class p53 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public p53(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.p53) r5;
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
            boolean r1 = r5 instanceof defpackage.p53
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            p53 r5 = (defpackage.p53) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p53.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + c3d.d(this.c, c3d.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonShadowsColors(elevation2Primary=");
        sb.append(this.a);
        sb.append(", elevation2Secondary=");
        sb.append(this.b);
        sb.append(", topBarColor=");
        sb.append(this.c);
        sb.append(", writeBarColor=");
        return wn6.j(sb, this.d, ")");
    }
}
