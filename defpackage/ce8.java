package defpackage;

/* renamed from: ce8  reason: default package */
public final /* synthetic */ class ce8 implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ le8 Y;
    public final /* synthetic */ cd8 Z;
    public final /* synthetic */ me8 a;
    public final /* synthetic */ ic8 b;
    public final /* synthetic */ v1d c;
    public final /* synthetic */ int o;

    public /* synthetic */ ce8(me8 me8, ic8 ic8, v1d v1d, int i, int i2, le8 le8, cd8 cd8) {
        this.a = me8;
        this.b = ic8;
        this.c = v1d;
        this.o = i;
        this.X = i2;
        this.Y = le8;
        this.Z = cd8;
    }

    public final void run() {
        nxc nxc = this.a.e;
        ic8 ic8 = this.b;
        if (nxc.J(ic8)) {
            v1d v1d = this.c;
            int i = this.o;
            if (v1d != null) {
                if (!nxc.P(ic8, v1d)) {
                    me8.M0(ic8, i, new p2d(-4));
                    return;
                }
            } else if (!nxc.O(ic8, this.X)) {
                me8.M0(ic8, i, new p2d(-4));
                return;
            }
            this.Y.h(this.Z, ic8, i);
        }
    }
}
