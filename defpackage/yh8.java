package defpackage;

/* renamed from: yh8  reason: default package */
public final class yh8 implements pg7 {
    public final b7d X;
    public final long Y;
    public final int Z = s6a.a;
    public final int a;
    public final mge b;
    public final d7d c;
    public final Integer o;

    public yh8(int i, mge mge, d7d d7d, Integer num, b7d b7d) {
        this.a = i;
        this.b = mge;
        this.c = d7d;
        this.o = num;
        this.X = b7d;
        this.Y = (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.yh8) r5;
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
            boolean r1 = r5 instanceof defpackage.yh8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            yh8 r5 = (defpackage.yh8) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r4.b
            mge r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            d7d r1 = r4.c
            d7d r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.Integer r1 = r4.o
            java.lang.Integer r3 = r5.o
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            b7d r4 = r4.X
            b7d r5 = r5.X
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh8.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + c3d.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i = 0;
        Integer num = this.o;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        b7d b7d = this.X;
        if (b7d != null) {
            i = b7d.hashCode();
        }
        return hashCode2 + i;
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        return "MemberListActionItem(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.o + ", endViewType=" + this.X + ")";
    }
}
