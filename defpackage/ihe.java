package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* renamed from: ihe  reason: default package */
public final class ihe implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ jhe a;

    public ihe(jhe jhe) {
        this.a = jhe;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        jhe jhe = this.a;
        jhe.f = surfaceTexture;
        if (jhe.g != null) {
            jhe.h.getClass();
            Objects.toString(jhe.h);
            jhe.h.l.a();
            return;
        }
        jhe.p();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jhe jhe = this.a;
        jhe.f = null;
        vn1 vn1 = jhe.g;
        if (vn1 == null) {
            return true;
        }
        ct0.a(vn1, new j1c(this, surfaceTexture, false, 8), kq3.a(jhe.e.getContext()));
        jhe.j = surfaceTexture;
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        sn1 sn1 = (sn1) this.a.k.getAndSet((Object) null);
        if (sn1 != null) {
            sn1.b((Object) null);
        }
    }
}
