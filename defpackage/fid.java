package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: fid  reason: default package */
public final class fid implements e75 {
    public int X;
    public i75 Y;
    public bpe Z;
    public final int a;
    public final int b;
    public final String c;
    public int o;

    public fid(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [vtc, java.lang.Object] */
    public final void S(i75 i75) {
        this.Y = i75;
        bpe B = i75.B(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        this.Z = B;
        uu5 uu5 = new uu5();
        uu5.m = c49.l(this.c);
        B.e(new xu5(uu5));
        this.Y.w();
        this.Y.M(new Object());
        this.X = 1;
    }

    public final void d(long j, long j2) {
        if (j == 0 || this.X == 1) {
            this.X = 1;
            this.o = 0;
        }
    }

    public final int g(g75 g75, le4 le4) {
        int i = this.X;
        if (i == 1) {
            bpe bpe = this.Z;
            bpe.getClass();
            int c2 = bpe.c(g75, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, true);
            if (c2 == -1) {
                this.X = 2;
                this.Z.a(0, 1, this.o, 0, (zoe) null);
                this.o = 0;
            } else {
                this.o += c2;
            }
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final boolean n(g75 g75) {
        int i = this.b;
        int i2 = this.a;
        oyb.k((i2 == -1 || i == -1) ? false : true);
        ija ija = new ija(i);
        ((r74) g75).r(ija.a, 0, i, false);
        return ija.A() == i2;
    }

    public final void release() {
    }
}
