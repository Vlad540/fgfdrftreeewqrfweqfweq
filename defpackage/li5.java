package defpackage;

/* renamed from: li5  reason: default package */
public final class li5 implements kl0 {
    public final ti5 a;
    public final int b;
    public final le4 c = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, le4] */
    public li5(ti5 ti5, int i) {
        this.a = ti5;
        this.b = i;
    }

    public final long a(r74 r74) {
        long j;
        le4 le4;
        ti5 ti5;
        boolean z;
        int d;
        r74 r742 = r74;
        while (true) {
            long s = r74.s();
            j = r742.c;
            int i = (s > (j - 6) ? 1 : (s == (j - 6) ? 0 : -1));
            le4 = this.c;
            ti5 = this.a;
            if (i >= 0) {
                break;
            }
            long s2 = r74.s();
            int i2 = 2;
            byte[] bArr = new byte[2];
            r742.r(bArr, 0, 2, false);
            byte b2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.b;
            if (b2 != i3) {
                r742.Y = 0;
                r742.b((int) (s2 - r742.o), false);
                z = false;
            } else {
                ija ija = new ija(16);
                System.arraycopy(bArr, 0, ija.a, 0, 2);
                byte[] bArr2 = ija.a;
                int i4 = 0;
                while (i4 < 14 && (d = r742.d(i2 + i4, bArr2, 14 - i4)) != -1) {
                    i4 += d;
                    i2 = 2;
                }
                ija.F(i4);
                r742.Y = 0;
                r742.b((int) (s2 - r742.o), false);
                z = ct0.e(ija, ti5, i3, le4);
            }
            if (z) {
                break;
            }
            r742.b(1, false);
        }
        if (r74.s() < j - 6) {
            return le4.a;
        }
        r742.b((int) (j - r74.s()), false);
        return ti5.k;
    }

    public final il0 k(r74 r74, long j) {
        r74 r742 = r74;
        long j2 = r742.o;
        long a2 = a(r74);
        long s = r74.s();
        r742.b(Math.max(6, this.a.d), false);
        long a3 = a(r74);
        return (a2 > j || a3 <= j) ? a3 <= j ? new il0(-2, a3, r74.s()) : new il0(-1, a2, j2) : new il0(0, -9223372036854775807L, s);
    }
}
