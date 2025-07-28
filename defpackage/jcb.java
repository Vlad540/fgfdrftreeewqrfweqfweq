package defpackage;

/* renamed from: jcb  reason: default package */
public final class jcb extends ncb {
    public final int a;
    public final o7d b;
    public final boolean c;
    public final int o;

    public jcb(int i, o7d o7d, boolean z, int i2) {
        this.a = i;
        this.b = o7d;
        this.c = z;
        this.o = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jcb) r5;
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
            boolean r1 = r5 instanceof defpackage.jcb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jcb r5 = (defpackage.jcb) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            o7d r1 = r4.b
            o7d r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            int r4 = r4.o
            int r5 = r5.o
            boolean r4 = kjd.p(r4, r5)
            if (r4 != 0) goto L_0x0030
            return r2
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcb.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + th2.f((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        String P = kjd.P(this.o);
        return "InviteActionItem(actionId=" + this.a + ", model=" + this.b + ", isEnabled=" + this.c + ", itemViewType=" + P + ")";
    }
}
