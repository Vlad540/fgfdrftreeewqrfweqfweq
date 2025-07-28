package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: g45  reason: default package */
public final class g45 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ m45 a;

    public g45(m45 m45) {
        this.a = m45;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m45 m45 = this.a;
        m45.getClass();
        Surface surface = new Surface(surfaceTexture);
        m45.m2(surface);
        m45.c1 = surface;
        m45.i2(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m45 m45 = this.a;
        m45.m2((Surface) null);
        m45.i2(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.i2(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.i2(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        m45 m45 = this.a;
        m45.getClass();
        m45.i2(0, 0);
    }
}
