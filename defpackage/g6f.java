package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: g6f  reason: default package */
public final class g6f implements rf3 {
    public final y4e a;
    public final SurfaceTexture b;
    public final Surface c;
    public final /* synthetic */ h6f d;

    public g6f(h6f h6f, y4e y4e, SurfaceTexture surfaceTexture, Surface surface) {
        this.d = h6f;
        this.a = y4e;
        this.b = surfaceTexture;
        this.c = surface;
    }

    public final void accept(Object obj) {
        h6f h6f = this.d;
        String str = h6f.a;
        int i = ((bb0) obj).a;
        udd.q(str, "onSurfaceRequestResult event=" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? wn6.h(i, "SerufaceRequest.Result_UNKNOWN_code_") : "WILL_NOT_PROVIDE_SURFACE" : "SURFACE_ALREADY_PROVIDED" : "INVALID_SURFACE" : "REQUEST_CANCELLED" : "SURFACE_USED_SUCCESSFULLY"));
        h6f.e();
        y4e y4e = this.a;
        synchronized (y4e.a) {
            y4e.n = null;
            y4e.o = null;
        }
        SurfaceTexture surfaceTexture = this.b;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.c.release();
        h6f.A0--;
        h6f.f();
    }
}
