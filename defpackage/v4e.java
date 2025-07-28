package defpackage;

import android.view.Surface;

/* renamed from: v4e  reason: default package */
public final /* synthetic */ class v4e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf3 b;
    public final /* synthetic */ Surface c;

    public /* synthetic */ v4e(rf3 rf3, Surface surface, int i) {
        this.a = i;
        this.b = rf3;
        this.c = surface;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.accept(new bb0(3, this.c));
                return;
            default:
                this.b.accept(new bb0(4, this.c));
                return;
        }
    }
}
