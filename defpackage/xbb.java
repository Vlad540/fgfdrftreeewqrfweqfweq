package defpackage;

/* renamed from: xbb  reason: default package */
public final class xbb extends ncb {
    public final int a;
    public final u16 b;
    public final nge c;
    public final int o;

    public xbb(int i, nge nge, int i2) {
        qq9 qq9 = new qq9(21);
        nge = (i2 & 4) != 0 ? nte.t : nge;
        this.a = i;
        this.b = qq9;
        this.c = nge;
        this.o = 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xbb) r5;
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
            boolean r1 = r5 instanceof defpackage.xbb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xbb r5 = (defpackage.xbb) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            u16 r1 = r4.b
            u16 r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            nge r4 = r4.c
            nge r5 = r5.c
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbb.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 4;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ")";
    }
}
