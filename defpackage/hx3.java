package defpackage;

/* renamed from: hx3  reason: default package */
public final class hx3 implements q7 {
    public final int a;
    public final mge b;
    public final int c;

    public hx3(int i, int i2, mge mge) {
        this.a = i;
        this.b = mge;
        this.c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.hx3) r5;
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
            boolean r1 = r5 instanceof defpackage.hx3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            hx3 r5 = (defpackage.hx3) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r4.b
            mge r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx3.equals(java.lang.Object):boolean");
    }

    public final int getIcon() {
        return this.a;
    }

    public final int getId() {
        return this.c;
    }

    public final mge getName() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomContextAction(icon=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return wn6.j(sb, this.c, ")");
    }
}
