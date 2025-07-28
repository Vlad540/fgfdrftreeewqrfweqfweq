package defpackage;

/* renamed from: z05  reason: default package */
public final class z05 implements yjc {
    public c15 X;
    public boolean Y;
    public int Z;
    public final xu5 a;
    public final b2b b = new b2b(17);
    public long[] c;
    public boolean o;
    public long w0 = -9223372036854775807L;

    public z05(c15 c15, xu5 xu5, boolean z) {
        this.a = xu5;
        this.X = c15;
        this.c = c15.b;
        a(c15, z);
    }

    public final void a(c15 c15, boolean z) {
        int i = this.Z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.X = c15;
        long[] jArr = c15.b;
        this.c = jArr;
        long j3 = this.w0;
        if (j3 != -9223372036854775807L) {
            int b2 = oze.b(jArr, j3, true);
            this.Z = b2;
            if (this.o && b2 == this.c.length) {
                j = j3;
            }
            this.w0 = j;
        } else if (j2 != -9223372036854775807L) {
            this.Z = oze.b(jArr, j2, false);
        }
    }

    public final void c() {
    }

    public final boolean d() {
        return true;
    }

    public final int e(long j) {
        int max = Math.max(this.Z, oze.b(this.c, j, true));
        int i = max - this.Z;
        this.Z = max;
        return i;
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        int i2 = this.Z;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            n24.b = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.Y) {
            qe4.c = this.a;
            this.Y = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.Z = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] u = this.b.u(this.X.a[i2]);
                n24.x(u.length);
                n24.X.put(u);
            }
            n24.Z = this.c[i2];
            n24.b = 1;
            return -4;
        }
    }
}
