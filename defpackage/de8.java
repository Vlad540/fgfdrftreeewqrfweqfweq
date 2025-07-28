package defpackage;

/* renamed from: de8  reason: default package */
public final /* synthetic */ class de8 implements Runnable {
    public final /* synthetic */ cd8 X;
    public final /* synthetic */ le8 Y;
    public final /* synthetic */ me8 a;
    public final /* synthetic */ ic8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ de8(me8 me8, ic8 ic8, int i, int i2, cd8 cd8, le8 le8) {
        this.a = me8;
        this.b = ic8;
        this.c = i;
        this.o = i2;
        this.X = cd8;
        this.Y = le8;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [xc3, java.lang.Object] */
    public final void run() {
        nxc nxc = this.a.e;
        ic8 ic8 = this.b;
        int i = this.c;
        boolean N = nxc.N(ic8, i);
        int i2 = this.o;
        if (!N) {
            me8.M0(ic8, i2, new p2d(-4));
            return;
        }
        cd8 cd8 = this.X;
        cd8.s(ic8);
        cd8.e.getClass();
        le8 le8 = this.Y;
        if (i == 27) {
            le8.h(cd8, ic8, i2);
            nxc.n(ic8, i, new Object());
            return;
        }
        nxc.n(ic8, i, new he8(le8, cd8, ic8, i2));
    }
}
