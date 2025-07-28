package defpackage;

/* renamed from: ni9  reason: default package */
public final class ni9 {
    public final int a;
    public final Integer b;

    public ni9(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ni9) r5;
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
            boolean r1 = r5 instanceof defpackage.ni9
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ni9 r5 = (defpackage.ni9) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Integer r4 = r4.b
            java.lang.Integer r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarScrollEvent(tabIndex=" + this.a + ", firstIndex=" + this.b + ")";
    }
}
