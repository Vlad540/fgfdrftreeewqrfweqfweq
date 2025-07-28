package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: ab4  reason: default package */
public final /* synthetic */ class ab4 implements rf3 {
    public final /* synthetic */ bb4 a;
    public final /* synthetic */ y4e b;
    public final /* synthetic */ SurfaceTexture c;
    public final /* synthetic */ Surface d;

    public /* synthetic */ ab4(bb4 bb4, y4e y4e, SurfaceTexture surfaceTexture, Surface surface) {
        this.a = bb4;
        this.b = y4e;
        this.c = surfaceTexture;
        this.d = surface;
    }

    public final void accept(Object obj) {
        bb0 bb0 = (bb0) obj;
        bb4 bb4 = this.a;
        bb4.getClass();
        y4e y4e = this.b;
        synchronized (y4e.a) {
            y4e.n = null;
            y4e.o = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.d.release();
        bb4.x0--;
        bb4.d();
    }
}
