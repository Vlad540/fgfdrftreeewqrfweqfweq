package defpackage;

/* renamed from: y05  reason: default package */
public final class y05 implements xjc {
    public b15 X;
    public boolean Y;
    public int Z;
    public final vu5 a;
    public final mn b = new mn(15);
    public long[] c;
    public boolean o;
    public long w0 = -9223372036854775807L;

    public y05(b15 b15, vu5 vu5, boolean z) {
        this.a = vu5;
        this.X = b15;
        this.c = b15.b;
        a(b15, z);
    }

    public final void a(b15 b15, boolean z) {
        int i = this.Z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.X = b15;
        long[] jArr = b15.b;
        this.c = jArr;
        long j3 = this.w0;
        if (j3 != -9223372036854775807L) {
            int b2 = mze.b(jArr, j3, true);
            this.Z = b2;
            if (this.o && b2 == this.c.length) {
                j = j3;
            }
            this.w0 = j;
        } else if (j2 != -9223372036854775807L) {
            this.Z = mze.b(jArr, j2, false);
        }
    }

    public final void c() {
    }

    public final boolean d() {
        return true;
    }

    public final int e(long j) {
        int max = Math.max(this.Z, mze.b(this.c, j, true));
        int i = max - this.Z;
        this.Z = max;
        return i;
    }

    public final int h(otf otf, m24 m24, int i) {
        int i2 = this.Z;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            m24.b = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.Y) {
            otf.b = this.a;
            this.Y = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.Z = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] K = this.b.K(this.X.a[i2]);
                m24.x(K.length);
                m24.o.put(K);
            }
            m24.Y = this.c[i2];
            m24.b = 1;
            return -4;
        }
    }
}
