package defpackage;

/* renamed from: jse  reason: default package */
public final class jse implements kl0 {
    public final cke a;
    public final ija b = new ija();
    public final int c;
    public final int o = 112800;

    public jse(int i, cke cke) {
        this.c = i;
        this.a = cke;
    }

    public final void c() {
        byte[] bArr = oze.f;
        ija ija = this.b;
        ija.getClass();
        ija.E(bArr.length, bArr);
    }

    public final il0 k(r74 r74, long j) {
        r74 r742 = r74;
        long j2 = r742.o;
        int min = (int) Math.min((long) this.o, r742.c - j2);
        ija ija = this.b;
        ija.D(min);
        r742.r(ija.a, 0, min, false);
        int i = ija.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (ija.a() >= 188) {
            byte[] bArr = ija.a;
            int i2 = ija.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long E = xie.E(ija, i2, this.c);
            if (E != -9223372036854775807L) {
                long b2 = this.a.b(E);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new il0(-1, b2, j2) : new il0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + b2 > j) {
                    return new il0(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = b2;
                j4 = (long) i2;
            }
            ija.G(i3);
            j3 = (long) i3;
        }
        return j5 != -9223372036854775807L ? new il0(-2, j5, j2 + j3) : il0.e;
    }
}
