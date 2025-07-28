package defpackage;

import java.util.ArrayDeque;

/* renamed from: cy1  reason: default package */
public final class cy1 extends p1e {
    public final /* synthetic */ int Y;
    public Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy1() {
        super(2);
        this.Y = 0;
    }

    public final void v() {
        switch (this.Y) {
            case 0:
                zx1 zx1 = (zx1) this.Z;
                zx1.getClass();
                ey1 ey1 = (ey1) zx1.b;
                ey1.getClass();
                this.b = 0;
                this.o = null;
                ey1.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((ex) this.Z).Y;
                swb.h(arrayDeque.size() < 2);
                swb.e(!arrayDeque.contains(this));
                this.b = 0;
                this.o = null;
                arrayDeque.addFirst(this);
                return;
            default:
                ahd ahd = (ahd) this.Z;
                synchronized (ahd.b) {
                    this.b = 0;
                    this.o = null;
                    int i = ahd.w0;
                    ahd.w0 = i + 1;
                    ahd.Y[i] = this;
                    if (!ahd.c.isEmpty() && ahd.w0 > 0) {
                        ahd.b.notify();
                    }
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy1(i1e i1e, int i) {
        super(2);
        this.Y = i;
        this.Z = i1e;
    }
}
