package defpackage;

/* renamed from: t07  reason: default package */
public final class t07 implements pg7 {
    public final long X;
    public final s07 a;
    public final mge b;
    public final Integer c;
    public final int o = u5a.c;

    public t07(s07 s07, hge hge, Integer num) {
        this.a = s07;
        this.b = hge;
        this.c = num;
        this.X = (long) s07.ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.t07) r5;
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
            boolean r1 = r5 instanceof defpackage.t07
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t07 r5 = (defpackage.t07) r5
            s07 r1 = r5.a
            s07 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r4.b
            mge r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.Integer r4 = r4.c
            java.lang.Integer r5 = r5.c
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t07.equals(java.lang.Object):boolean");
    }

    public final boolean g(pg7 pg7) {
        return this.X == pg7.getItemId();
    }

    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        int e = c3d.e(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final int l() {
        return this.o;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return "InviteActionListItem(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
