package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* renamed from: m4e  reason: default package */
public final /* synthetic */ class m4e implements au {
    public final /* synthetic */ ya0 X;
    public final /* synthetic */ o4e a;
    public final /* synthetic */ n4e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ya0 o;

    public /* synthetic */ m4e(o4e o4e, n4e n4e, int i, ya0 ya0, ya0 ya02) {
        this.a = o4e;
        this.b = n4e;
        this.c = i;
        this.o = ya0;
        this.X = ya02;
    }

    public final ch7 apply(Object obj) {
        n4e n4e = this.b;
        Surface surface = (Surface) obj;
        o4e o4e = this.a;
        o4e.getClass();
        surface.getClass();
        try {
            n4e.d();
            q4e q4e = new q4e(surface, this.c, o4e.g.a, this.o, this.X);
            q4e.y0.b.c(new l4e(n4e, 1), pa2.j());
            e07.p("Consumer can only be linked once.", n4e.q == null);
            n4e.q = q4e;
            return ct0.w(q4e);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new as6(1, e);
        }
    }
}
