package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: op4  reason: default package */
public final /* synthetic */ class op4 implements rf3 {
    public final /* synthetic */ pp4 a;
    public final /* synthetic */ SurfaceTexture b;
    public final /* synthetic */ Surface c;

    public /* synthetic */ op4(pp4 pp4, SurfaceTexture surfaceTexture, Surface surface) {
        this.a = pp4;
        this.b = surfaceTexture;
        this.c = surface;
    }

    public final void accept(Object obj) {
        bb0 bb0 = (bb0) obj;
        pp4 pp4 = this.a;
        pp4.getClass();
        SurfaceTexture surfaceTexture = this.b;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.c.release();
        pp4.X--;
        pp4.d();
    }
}
