package defpackage;

/* renamed from: ls3  reason: default package */
public final class ls3 {
    public static final ls3 d = new ls3();
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ ls3() {
        this(0, 0, true);
    }

    public static ls3 a(ls3 ls3, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = ls3.a;
        }
        if ((i3 & 2) != 0) {
            i2 = ls3.b;
        }
        if ((i3 & 4) != 0) {
            z = ls3.c;
        }
        ls3.getClass();
        return new ls3(i, i2, z);
    }

    public final int b() {
        return this.a + this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ls3) r5;
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
            boolean r1 = r5 instanceof defpackage.ls3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ls3 r5 = (defpackage.ls3) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + c3d.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlState(heightView=");
        sb.append(this.a);
        sb.append(", inset=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return hr1.j(sb, this.c, ")");
    }

    public ls3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}
