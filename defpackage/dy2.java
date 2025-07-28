package defpackage;

/* renamed from: dy2  reason: default package */
public final class dy2 {
    public final bpe a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public dy2(int i2, int i3, long j2, int i4, bpe bpe) {
        boolean z = true;
        if (!(i3 == 1 || i3 == 2)) {
            z = false;
        }
        oyb.d(z);
        this.d = j2;
        this.e = i4;
        this.a = bpe;
        int i5 = (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48);
        this.b = (i3 == 2 ? 1667497984 : 1651965952) | i5;
        this.c = i3 == 2 ? i5 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final ztc a(int i2) {
        return new ztc(((this.d * ((long) 1)) / ((long) this.e)) * ((long) this.l[i2]), this.k[i2]);
    }

    public final ttc b(long j2) {
        int i2 = (int) (j2 / ((this.d * ((long) 1)) / ((long) this.e)));
        int e2 = oze.e(this.l, i2, true, true);
        if (this.l[e2] == i2) {
            ztc a2 = a(e2);
            return new ttc(a2, a2);
        }
        ztc a3 = a(e2);
        int i3 = e2 + 1;
        return i3 < this.k.length ? new ttc(a3, a(i3)) : new ttc(a3, a3);
    }
}
