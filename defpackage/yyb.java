package defpackage;

/* renamed from: yyb  reason: default package */
public final class yyb {
    public final zyb a;
    public final ryb b;

    public yyb(zyb zyb, ryb ryb) {
        this.a = zyb;
        this.b = ryb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.yyb) r5;
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
            boolean r1 = r5 instanceof defpackage.yyb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            yyb r5 = (defpackage.yyb) r5
            zyb r1 = r5.a
            zyb r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ryb r4 = r4.b
            ryb r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(type=" + this.a + ", id=" + this.b + ")";
    }
}
