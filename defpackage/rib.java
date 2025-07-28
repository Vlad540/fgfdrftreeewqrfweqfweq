package defpackage;

/* renamed from: rib  reason: default package */
public final class rib {
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public final Object g;
    public final Object h;

    public rib(int i) {
        switch (i) {
            case 1:
                this.g = new cke(0);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new ija();
                return;
            default:
                this.g = new bke(0);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new yze(3, false);
                return;
        }
    }

    public static int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long e(ija ija) {
        ija ija2 = ija;
        int i = ija2.b;
        if (ija.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ija2.e(0, bArr, 9);
        ija2.G(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b2;
                    long j2 = (long) b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long f(yze yze) {
        yze yze2 = yze;
        int i = yze2.b;
        if (yze.c() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yze2.g(0, bArr, 9);
        yze2.H(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b2;
                    long j2 = (long) b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public void a(q74 q74) {
        byte[] bArr = mze.f;
        yze yze = (yze) this.h;
        yze.getClass();
        yze.F(bArr.length, bArr);
        this.a = true;
        q74.Y = 0;
    }

    public void b(r74 r74) {
        byte[] bArr = oze.f;
        ija ija = (ija) this.h;
        ija.getClass();
        ija.E(bArr.length, bArr);
        this.a = true;
        r74.Y = 0;
    }
}
