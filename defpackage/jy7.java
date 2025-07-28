package defpackage;

/* renamed from: jy7  reason: default package */
public final class jy7 {
    public final int a;
    public final ema b;
    public final boolean c;

    public jy7(int i, ema ema, boolean z) {
        this.a = i;
        this.b = ema;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jy7) r5;
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
            boolean r1 = r5 instanceof defpackage.jy7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jy7 r5 = (defpackage.jy7) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ema r1 = r4.b
            ema r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int t = hr1.t(this.a) * 31;
        ema ema = this.b;
        return Boolean.hashCode(this.c) + ((t + (ema == null ? 0 : ema.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConditionChange(condition=");
        sb.append(wn6.s(this.a));
        sb.append(", suggestedVideoSettings=");
        sb.append(this.b);
        sb.append(", preferHardwarePVXEncoder=");
        return hr1.j(sb, this.c, ")");
    }
}
