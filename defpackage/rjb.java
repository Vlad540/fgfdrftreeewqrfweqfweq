package defpackage;

/* renamed from: rjb  reason: default package */
public final class rjb {
    public static final xb4 g = new xb4(14);
    public final qjb a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;

    public rjb(qjb qjb, int i, int i2, int i3, long j, boolean z) {
        this.a = qjb;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.rjb) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.rjb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            rjb r8 = (defpackage.rjb) r8
            qjb r1 = r8.a
            qjb r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r7.b
            int r3 = r8.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            int r1 = r7.d
            int r3 = r8.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0031
            return r2
        L_0x0031:
            boolean r7 = r7.f
            boolean r8 = r8.f
            if (r7 == r8) goto L_0x0038
            return r2
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + sxe.m(c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quality(quality=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", isOriginal=");
        return hr1.j(sb, this.f, ")");
    }
}
