package defpackage;

/* renamed from: qb9  reason: default package */
public final class qb9 {
    public float[] a;
    public int b;

    public final float a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder m = me4.m(i, "Index ", " must be in 0..");
        m.append(this.b - 1);
        throw new IndexOutOfBoundsException(m.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (defpackage.qb9) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.qb9
            r1 = 0
            if (r0 == 0) goto L_0x002c
            qb9 r6 = (defpackage.qb9) r6
            int r0 = r6.b
            int r2 = r5.b
            if (r0 == r2) goto L_0x000e
            goto L_0x002c
        L_0x000e:
            float[] r5 = r5.a
            float[] r6 = r6.a
            fz6 r0 = defpackage.gwf.S(r1, r2)
            int r2 = r0.a
            int r0 = r0.b
            if (r2 > r0) goto L_0x002a
        L_0x001c:
            r3 = r5[r2]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0029
            if (r2 == r0) goto L_0x002a
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0029:
            return r1
        L_0x002a:
            r5 = 1
            return r5
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(f);
            i2++;
        }
        return sb.toString();
    }
}
