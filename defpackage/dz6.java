package defpackage;

import java.util.Iterator;

/* renamed from: dz6  reason: default package */
public class dz6 implements Iterable, z67 {
    public final int a;
    public final int b;
    public final int c;

    public dz6(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.a = i;
            if (i3 > 0) {
                if (i < i2) {
                    int i4 = i2 % i3;
                    int i5 = i % i3;
                    int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                    i2 -= i6 < 0 ? i6 + i3 : i6;
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
            this.b = i2;
            this.c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (defpackage.dz6) r3;
        r0 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.dz6
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            dz6 r0 = (defpackage.dz6) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            dz6 r3 = (defpackage.dz6) r3
            int r0 = r3.a
            int r1 = r2.a
            if (r1 != r0) goto L_0x0029
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L_0x0029
            int r2 = r2.c
            int r3 = r3.c
            if (r2 != r3) goto L_0x0029
        L_0x0027:
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz6.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.c + (((this.a * 31) + this.b) * 31);
    }

    public boolean isEmpty() {
        int i = this.c;
        int i2 = this.b;
        int i3 = this.a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new ez6(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.a;
        int i3 = this.c;
        if (i3 > 0) {
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            i3 = -i3;
        }
        sb.append(i3);
        return sb.toString();
    }
}
