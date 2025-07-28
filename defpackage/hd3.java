package defpackage;

/* renamed from: hd3  reason: default package */
public final class hd3 {
    public static final hd3 f = new hd3(false, false, true, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public hd3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static hd3 a(hd3 hd3, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z2 = hd3.b;
        }
        boolean z3 = hd3.c;
        boolean z4 = hd3.d;
        boolean z5 = hd3.e;
        hd3.getClass();
        return new hd3(z, z2, z3, z4, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.hd3) r5;
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
            boolean r1 = r5 instanceof defpackage.hd3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            hd3 r5 = (defpackage.hd3) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x002f
            return r2
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + th2.f(th2.f(th2.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Inet(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isRoaming=");
        sb.append(this.d);
        sb.append(", hasVpn=");
        return hr1.j(sb, this.e, ")");
    }
}
