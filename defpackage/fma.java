package defpackage;

/* renamed from: fma  reason: default package */
public final class fma {
    public final int a;
    public final int b;

    public fma(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.fma) r5;
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
            boolean r1 = r5 instanceof defpackage.fma
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            fma r5 = (defpackage.fma) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bitrate(dimension=");
        sb.append(this.a);
        sb.append(", bitrate=");
        return wn6.j(sb, this.b, ")");
    }
}
