package defpackage;

import android.graphics.SurfaceTexture;

/* renamed from: w65  reason: default package */
public final /* synthetic */ class w65 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ y65 a;
    public final /* synthetic */ ew0 b;

    public /* synthetic */ w65(y65 y65, ew0 ew0) {
        this.a = y65;
        this.b = ew0;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        y65 y65 = this.a;
        y65.getClass();
        this.b.v(new v65(y65, 4));
    }
}
