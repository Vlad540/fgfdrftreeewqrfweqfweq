package defpackage;

/* renamed from: pje  reason: default package */
public final class pje implements lt0 {
    public long X;
    public boolean Y;
    public v8 Z = v8.Y;
    public Object a;
    public Object b;
    public int c;
    public long o;

    public final long a(int i, int i2) {
        t8 a2 = this.Z.a(i);
        if (a2.b != -1) {
            return a2.X[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = r0.a(r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r9) {
        /*
            r8 = this;
            v8 r0 = r8.Z
            long r1 = r8.o
            r0.getClass()
            r3 = -9223372036854775808
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r5 = -1
            if (r8 == 0) goto L_0x004b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x001c
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            int r8 = r0.o
        L_0x001e:
            int r1 = r0.a
            if (r8 >= r1) goto L_0x0048
            t8 r2 = r0.a(r8)
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0036
            t8 r2 = r0.a(r8)
            long r6 = r2.a
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0045
        L_0x0036:
            t8 r2 = r0.a(r8)
            int r6 = r2.b
            if (r6 == r5) goto L_0x0048
            int r2 = r2.a(r5)
            if (r2 >= r6) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0048:
            if (r8 >= r1) goto L_0x004b
            r5 = r8
        L_0x004b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pje.b(long):int");
    }

    public final int c(long j) {
        v8 v8Var = this.Z;
        long j2 = this.o;
        int i = v8Var.a - 1;
        while (i >= 0 && j != Long.MIN_VALUE) {
            long j3 = v8Var.a(i).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
            } else if (j2 != -9223372036854775807L && j >= j2) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            t8 a2 = v8Var.a(i);
            int i2 = a2.b;
            if (i2 == -1) {
                return i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = a2.o[i3];
                if (i4 == 0 || i4 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int d(int i, int i2) {
        t8 a2 = this.Z.a(i);
        if (a2.b != -1) {
            return a2.o[i2];
        }
        return 0;
    }

    public final int e(int i) {
        return this.Z.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (pje.class.equals(obj.getClass())) {
                pje pje = (pje) obj;
                return mze.a(this.a, pje.a) && mze.a(this.b, pje.b) && this.c == pje.c && this.o == pje.o && this.X == pje.X && this.Y == pje.Y && mze.a(this.Z, pje.Z);
            }
        }
        return false;
    }

    public final long f() {
        return this.X;
    }

    public final boolean g(int i) {
        return this.Z.a(i).Z;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, v8 v8Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.o = j;
        this.X = j2;
        this.Z = v8Var;
        this.Y = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        long j = this.o;
        long j2 = this.X;
        return this.Z.hashCode() + ((((((((((hashCode + i) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.Y ? 1 : 0)) * 31);
    }
}
