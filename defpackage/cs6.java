package defpackage;

import android.util.Size;
import android.view.Surface;

/* renamed from: cs6  reason: default package */
public final class cs6 extends xc4 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public cs6(Surface surface, Size size, int i) {
        super(size, i);
        this.o = surface;
    }

    public final ch7 e() {
        switch (this.n) {
            case 0:
                return ct0.w((Surface) this.o);
            default:
                return ((y4e) this.o).g;
        }
    }

    public cs6(Surface surface) {
        super(xc4.k, 0);
        this.o = surface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cs6(y4e y4e, Size size) {
        super(size, 34);
        this.o = y4e;
    }
}
