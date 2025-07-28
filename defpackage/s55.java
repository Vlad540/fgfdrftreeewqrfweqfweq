package defpackage;

/* renamed from: s55  reason: default package */
public final class s55 {
    public final byte a;
    public final int b;

    public s55(int i, byte b2) {
        if (i >= 0) {
            this.a = b2;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("length must be >= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (defpackage.s55) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.s55
            r1 = 0
            if (r0 == 0) goto L_0x0014
            s55 r4 = (defpackage.s55) r4
            byte r0 = r4.a
            byte r2 = r3.a
            if (r2 != r0) goto L_0x0014
            int r3 = r3.b
            int r4 = r4.b
            if (r3 != r4) goto L_0x0014
            r1 = 1
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s55.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", new Object[]{Byte.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
