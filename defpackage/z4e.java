package defpackage;

import org.webrtc.SurfaceTextureHelper;

/* renamed from: z4e  reason: default package */
public final /* synthetic */ class z4e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ z4e(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.a = i;
        this.b = surfaceTextureHelper;
    }

    public final void run() {
        int i = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (i) {
            case 0:
                surfaceTextureHelper.lambda$stopListening$1();
                return;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                return;
            case 2:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                return;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                return;
        }
    }
}
