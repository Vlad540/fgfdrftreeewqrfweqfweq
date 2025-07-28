package defpackage;

/* renamed from: f3c  reason: default package */
public final class f3c implements g3c {
    public final z2c a;
    public final mge b;

    public f3c(z2c z2c, hge hge) {
        this.a = z2c;
        this.b = hge;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.f3c) r5;
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
            boolean r1 = r5 instanceof defpackage.f3c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            f3c r5 = (defpackage.f3c) r5
            z2c r1 = r5.a
            z2c r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r4 = r4.b
            mge r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTooltip(recordControlType=" + this.a + ", textSource=" + this.b + ")";
    }
}
