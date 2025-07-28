package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: h45  reason: default package */
public final class h45 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ n45 a;

    public h45(n45 n45) {
        this.a = n45;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        n45 n45 = this.a;
        n45.getClass();
        Surface surface = new Surface(surfaceTexture);
        n45.p2(surface);
        n45.g1 = surface;
        n45.k2(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n45 n45 = this.a;
        n45.p2((Object) null);
        n45.k2(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.k2(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.k2(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        n45 n45 = this.a;
        n45.getClass();
        n45.k2(0, 0);
    }
}
