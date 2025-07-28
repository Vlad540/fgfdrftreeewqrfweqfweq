package defpackage;

/* renamed from: qv3  reason: default package */
public final class qv3 implements pg7 {
    public final int a;
    public final int b;
    public final mge c;

    public qv3(int i, int i2, hge hge) {
        this.a = i;
        this.b = i2;
        this.c = hge;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.qv3) r5;
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
            boolean r1 = r5 instanceof defpackage.qv3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            qv3 r5 = (defpackage.qv3) r5
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
            mge r4 = r4.c
            mge r5 = r5.c
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv3.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + c3d.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final int l() {
        return kca.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateButton(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", text=");
        return me4.k(sb, this.c, ")");
    }
}
