package defpackage;

import android.graphics.SurfaceTexture;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: nlc  reason: default package */
public final /* synthetic */ class nlc implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nlc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((olc) this.b).a.set(true);
                return;
            default:
                SurfaceTextureHelper.d((SurfaceTextureHelper) this.b, surfaceTexture);
                return;
        }
    }
}
