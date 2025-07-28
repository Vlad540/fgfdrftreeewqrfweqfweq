package defpackage;

import java.util.Arrays;

/* renamed from: uq7  reason: default package */
public final class uq7 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int o;

    public uq7() {
        this((Object) null);
    }

    public final void a() {
        int i = this.o;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.o = 0;
        this.a = false;
    }

    /* renamed from: b */
    public final uq7 clone() {
        uq7 uq7 = (uq7) super.clone();
        uq7.b = (long[]) this.b.clone();
        uq7.c = (Object[]) this.c.clone();
        return uq7;
    }

    public final Object c(long j) {
        Object obj;
        int i = e07.i(this.o, j, this.b);
        if (i < 0 || (obj = this.c[i]) == n06.c) {
            return null;
        }
        return obj;
    }

    public final int d(long j) {
        if (this.a) {
            int i = this.o;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != n06.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.o = i2;
        }
        return e07.i(this.o, j, this.b);
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.o)) {
            throw new IllegalArgumentException(wn6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != n06.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.o = i3;
        }
        return this.b[i];
    }

    public final void f(long j, Object obj) {
        int i = e07.i(this.o, j, this.b);
        if (i >= 0) {
            this.c[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.o;
        Object obj2 = n06.c;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == obj2) {
                this.b[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.a = false;
                this.o = i4;
                i2 = ~e07.i(i4, j, this.b);
            }
        }
        int i6 = this.o;
        if (i6 >= this.b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            this.b = Arrays.copyOf(this.b, i10);
            this.c = Arrays.copyOf(this.c, i10);
        }
        int i11 = this.o - i2;
        if (i11 != 0) {
            long[] jArr2 = this.b;
            int i12 = i2 + 1;
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.c;
            cs.Q(i12, i2, this.o, objArr3, objArr3);
        }
        this.b[i2] = j;
        this.c[i2] = obj;
        this.o++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.b
            int r1 = r2.o
            int r3 = defpackage.e07.i(r1, r3, r0)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.c
            r0 = r4[r3]
            java.lang.Object r1 = defpackage.n06.c
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq7.g(long):void");
    }

    public final int h() {
        if (this.a) {
            int i = this.o;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != n06.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.o = i2;
        }
        return this.o;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.o)) {
            throw new IllegalArgumentException(wn6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != n06.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.o = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o * 28);
        sb.append('{');
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public uq7(int i) {
        if (i == 0) {
            this.b = e07.b;
            this.c = e07.c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public /* synthetic */ uq7(Object obj) {
        this(10);
    }
}
