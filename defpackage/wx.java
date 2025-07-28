package defpackage;

/* renamed from: wx  reason: default package */
public final class wx implements jl0 {
    public int a;
    public int b;
    public Object c;
    public Object o;

    public wx(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        swb.e(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.o = fArr2;
        this.b = i2;
    }

    public iqe a() {
        return new iqe((String) this.c, this.a, this.b, (String) this.o);
    }

    public void b(String str) {
        String l = c49.l(str);
        boolean z = l == null || c49.h(l);
        oyb.c("Not an audio MIME type: " + l, z);
        this.c = l;
    }

    public void c() {
        byte[] bArr = mze.f;
        yze yze = (yze) this.o;
        yze.getClass();
        yze.F(bArr.length, bArr);
    }

    public void d(String str) {
        String l = c49.l(str);
        boolean z = l == null || c49.k(l);
        oyb.c("Not a video MIME type: " + l, z);
        this.o = l;
    }

    public il0 g(q74 q74, long j) {
        q74 q742 = q74;
        long j2 = q742.o;
        int min = (int) Math.min((long) this.b, q742.c - j2);
        yze yze = (yze) this.o;
        yze.E(min);
        q742.r(yze.a, 0, min, false);
        int i = yze.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (yze.c() >= 188) {
            byte[] bArr = yze.a;
            int i2 = yze.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long H = urd.H(yze, i2, this.a);
            if (H != -9223372036854775807L) {
                long b2 = ((bke) this.c).b(H);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new il0(-1, b2, j2) : new il0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + b2 > j) {
                    return new il0(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = b2;
                j4 = (long) i2;
            }
            yze.H(i3);
            j3 = (long) i3;
        }
        return j5 != -9223372036854775807L ? new il0(-2, j5, j2 + j3) : il0.d;
    }
}
