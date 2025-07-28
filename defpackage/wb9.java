package defpackage;

import java.util.Arrays;

/* renamed from: wb9  reason: default package */
public final class wb9 {
    public long[] a = new long[16];
    public int b;

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean b(long j) {
        int i;
        long[] jArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (j == jArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return false;
        }
        if (i3 < 0 || i3 >= (i = this.b)) {
            StringBuilder m = me4.m(i3, "Index ", " must be in 0..");
            m.append(this.b - 1);
            throw new IndexOutOfBoundsException(m.toString());
        }
        long[] jArr2 = this.a;
        long j2 = jArr2[i3];
        if (i3 != i - 1) {
            int i4 = i3 + 1;
            System.arraycopy(jArr2, i4, jArr2, i3, i - i4);
        }
        this.b--;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r8 = (defpackage.wb9) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.wb9
            r1 = 0
            if (r0 == 0) goto L_0x002c
            wb9 r8 = (defpackage.wb9) r8
            int r0 = r8.b
            int r2 = r7.b
            if (r0 == r2) goto L_0x000e
            goto L_0x002c
        L_0x000e:
            long[] r7 = r7.a
            long[] r8 = r8.a
            fz6 r0 = defpackage.gwf.S(r1, r2)
            int r2 = r0.a
            int r0 = r0.b
            if (r2 > r0) goto L_0x002a
        L_0x001c:
            r3 = r7[r2]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0025
            return r1
        L_0x0025:
            if (r2 == r0) goto L_0x002a
            int r2 = r2 + 1
            goto L_0x001c
        L_0x002a:
            r7 = 1
            return r7
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
