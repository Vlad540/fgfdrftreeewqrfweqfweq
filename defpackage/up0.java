package defpackage;

/* renamed from: up0  reason: default package */
public final class up0 {
    public final int a;
    public final int b;
    public final boolean c;

    public up0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.up0) r5;
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
            boolean r1 = r5 instanceof defpackage.up0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            up0 r5 = (defpackage.up0) r5
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
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + us8.h(this.b, hr1.t(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomInsetConfig(persistentType=");
        sb.append(us8.p(this.a));
        sb.append(", imeInsetChange=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Immediate" : "Animated" : "None");
        sb.append(", applyDeviceRoundCorners=");
        return hr1.j(sb, this.c, ")");
    }
}
