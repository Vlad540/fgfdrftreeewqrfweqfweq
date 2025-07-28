package defpackage;

/* renamed from: ys9  reason: default package */
public final class ys9 extends w2 {
    public final int X;
    public final /* synthetic */ int b = 0;
    public final j26 c;
    public final int o;

    public ys9(nv9 nv9, j26 j26, int i, int i2) {
        super(nv9);
        this.c = j26;
        this.o = i;
        this.X = i2;
    }

    public final void q(bw9 bw9) {
        switch (this.b) {
            case 0:
                nv9 nv9 = this.a;
                j26 j26 = this.c;
                if (!ek8.c0(nv9, bw9, j26)) {
                    boolean z = true;
                    int i = this.o;
                    int i2 = this.X;
                    if (i2 == 1) {
                        nv9.a(new xs9(new zyc(bw9), j26, i));
                        return;
                    }
                    if (i2 != 3) {
                        z = false;
                    }
                    nv9.a(new ws9(bw9, j26, i, z));
                    return;
                }
                return;
            default:
                nv9 nv92 = this.a;
                j26 j262 = this.c;
                if (!ek8.c0(nv92, bw9, j262)) {
                    nv92.a(new ut9(bw9, j262, this.o, this.X));
                    return;
                }
                return;
        }
    }

    public ys9(ms9 ms9, j26 j26, int i, int i2) {
        super(ms9);
        this.c = j26;
        this.X = i2;
        this.o = Math.max(8, i);
    }
}
