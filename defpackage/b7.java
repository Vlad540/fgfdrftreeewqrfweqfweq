package defpackage;

/* renamed from: b7  reason: default package */
public final class b7 implements q8b {
    public final int a;
    public final o7d b;
    public final int c;

    public /* synthetic */ b7(int i, o7d o7d) {
        this(i, o7d, 1024);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.b7) r5;
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
            boolean r1 = r5 instanceof defpackage.b7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            b7 r5 = (defpackage.b7) r5
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
            int r4 = r4.c
            int r5 = r5.c
            boolean r4 = jjd.m(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = ((defpackage.b7) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(defpackage.pg7 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.b7
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            b7 r3 = (defpackage.b7) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 != r3) goto L_0x000f
            r1 = 1
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7.g(pg7):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.c) + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final int l() {
        return this.c;
    }

    public final boolean t(Object obj) {
        pg7 pg7 = (pg7) obj;
        if ((pg7 instanceof b7) && !(((b7) pg7).b.Z instanceof z6d)) {
            return equals(pg7);
        }
        return false;
    }

    public final String toString() {
        String R = jjd.R(this.c);
        return "ActionItem(actionId=" + this.a + ", model=" + this.b + ", itemViewType=" + R + ")";
    }

    public b7(int i, o7d o7d, int i2) {
        this.a = i;
        this.b = o7d;
        this.c = i2;
    }
}
