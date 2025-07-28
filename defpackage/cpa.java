package defpackage;

import java.io.Serializable;

/* renamed from: cpa  reason: default package */
public final class cpa implements Serializable {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a;
    public long b;
    public boolean c;
    public String o;
    public int w0;
    public String x0;
    public int y0;
    public String z0;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = (defpackage.cpa) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cpa
            if (r0 == 0) goto L_0x004c
            cpa r5 = (defpackage.cpa) r5
            if (r5 != 0) goto L_0x0009
            goto L_0x004c
        L_0x0009:
            if (r4 != r5) goto L_0x000c
            goto L_0x004a
        L_0x000c:
            int r0 = r4.a
            int r1 = r5.a
            if (r0 != r1) goto L_0x004c
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r4.o
            java.lang.String r1 = r5.o
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r4.Y
            boolean r1 = r5.Y
            if (r0 != r1) goto L_0x004c
            int r0 = r4.w0
            int r1 = r5.w0
            if (r0 != r1) goto L_0x004c
            java.lang.String r0 = r4.x0
            java.lang.String r1 = r5.x0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            int r0 = r4.y0
            int r1 = r5.y0
            if (r0 != r1) goto L_0x004c
            java.lang.String r4 = r4.z0
            java.lang.String r5 = r5.z0
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004c
        L_0x004a:
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.z0.hashCode() + us8.h(this.y0, me4.d((((me4.d((Long.valueOf(this.b).hashCode() + ((2173 + this.a) * 53)) * 53, 53, this.o) + (this.Y ? 1231 : 1237)) * 53) + this.w0) * 53, 53, this.x0), 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.X && this.Y) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.Z) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.w0);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.o);
        }
        return sb.toString();
    }
}
