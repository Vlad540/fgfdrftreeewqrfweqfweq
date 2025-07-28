package defpackage;

/* renamed from: dq  reason: default package */
public final class dq implements pg7 {
    public final bq a;
    public final Boolean b;

    public dq(bq bqVar, Boolean bool) {
        this.a = bqVar;
        this.b = bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.dq) r5;
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
            boolean r1 = r5 instanceof defpackage.dq
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            dq r5 = (defpackage.dq) r5
            bq r1 = r5.a
            bq r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Boolean r4 = r4.b
            java.lang.Boolean r5 = r5.b
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq.equals(java.lang.Object):boolean");
    }

    public final boolean g(pg7 pg7) {
        return getItemId() == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) this.a.ordinal();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        dq dqVar = (pg7) obj;
        dq dqVar2 = dqVar instanceof dq ? dqVar : null;
        if (dqVar2 == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = dqVar2.b;
        if (!hhd.f(bool, bool2)) {
            return new cq(bool2);
        }
        return null;
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ")";
    }
}
