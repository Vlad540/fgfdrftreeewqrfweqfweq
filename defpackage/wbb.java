package defpackage;

/* renamed from: wbb  reason: default package */
public final class wbb extends ncb {
    public final int a;
    public final v0a b;
    public final u0a c;
    public final s0a o;

    public wbb(int i) {
        v0a v0a = v0a.c;
        u0a u0a = u0a.a;
        s0a s0a = s0a.o;
        this.a = i;
        this.b = v0a;
        this.c = u0a;
        this.o = s0a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wbb) r5;
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
            boolean r1 = r5 instanceof defpackage.wbb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wbb r5 = (defpackage.wbb) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            v0a r1 = r4.b
            v0a r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            u0a r1 = r4.c
            u0a r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            s0a r4 = r4.o
            s0a r5 = r5.o
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbb.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 2;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.o.hashCode() + ((hashCode2 + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final int l() {
        return 2;
    }

    public final String toString() {
        return "MainButtonAction(title=" + this.a + ", size=" + this.b + ", mode=" + this.c + ", appearance=" + this.o + ")";
    }
}
