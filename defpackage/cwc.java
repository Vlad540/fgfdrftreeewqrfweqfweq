package defpackage;

/* renamed from: cwc  reason: default package */
public final class cwc implements q8b {
    public final int X;
    public final int a;
    public final boolean b;
    public final mge c;
    public final mge o;

    public cwc(int i, boolean z, hge hge, hge hge2, int i2) {
        this.a = i;
        this.b = z;
        this.c = hge;
        this.o = hge2;
        this.X = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.cwc) r5;
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
            boolean r1 = r5 instanceof defpackage.cwc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            cwc r5 = (defpackage.cwc) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            mge r1 = r4.c
            mge r3 = r5.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            mge r1 = r4.o
            mge r3 = r5.o
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            int r4 = r4.X
            int r5 = r5.X
            if (r4 == r5) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwc.equals(java.lang.Object):boolean");
    }

    public final boolean g(pg7 pg7) {
        return ((long) 8192) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 8192;
    }

    public final int hashCode() {
        return Integer.hashCode(this.X) + c3d.e(c3d.e(th2.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
    }

    public final int l() {
        return this.X;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableItem(valueId=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.o);
        sb.append(", viewType=");
        return wn6.j(sb, this.X, ")");
    }
}
