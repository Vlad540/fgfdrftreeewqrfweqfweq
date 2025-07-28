package defpackage;

import java.util.Arrays;

/* renamed from: ec9  reason: default package */
public final class ec9 {
    public Object[] a;
    public int b;

    public ec9(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = swb.b;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public final void a(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            StringBuilder m = me4.m(i, "Index ", " must be in 0..");
            m.append(this.b);
            throw new IndexOutOfBoundsException(m.toString());
        }
        int i3 = i2 + 1;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            this.a = Arrays.copyOf(objArr, Math.max(i3, (objArr.length * 3) / 2));
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        if (i != i4) {
            cs.Q(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        this.b++;
    }

    public final void b(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final Object c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder m = me4.m(i, "Index ", " must be in 0..");
        m.append(this.b - 1);
        throw new IndexOutOfBoundsException(m.toString());
    }

    public final void d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            StringBuilder m = me4.m(i, "Index ", " must be in 0..");
            m.append(this.b - 1);
            throw new IndexOutOfBoundsException(m.toString());
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            cs.Q(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (defpackage.ec9) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ec9
            r1 = 0
            if (r0 == 0) goto L_0x002e
            ec9 r6 = (defpackage.ec9) r6
            int r0 = r6.b
            int r2 = r5.b
            if (r0 == r2) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            java.lang.Object[] r5 = r5.a
            java.lang.Object[] r6 = r6.a
            fz6 r0 = defpackage.gwf.S(r1, r2)
            int r2 = r0.a
            int r0 = r0.b
            if (r2 > r0) goto L_0x002c
        L_0x001c:
            r3 = r5[r2]
            r4 = r6[r2]
            boolean r3 = defpackage.hhd.f(r3, r4)
            if (r3 != 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r2 == r0) goto L_0x002c
            int r2 = r2 + 1
            goto L_0x001c
        L_0x002c:
            r5 = 1
            return r5
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        c0 c0Var = new c0(3, this);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append((CharSequence) c0Var.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ ec9() {
        this(16);
    }
}
