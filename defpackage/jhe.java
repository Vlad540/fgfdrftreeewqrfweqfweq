package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jhe  reason: default package */
public final class jhe extends io9 {
    public TextureView e;
    public SurfaceTexture f;
    public vn1 g;
    public y4e h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public xz l;

    public final View f() {
        return this.e;
    }

    public final Bitmap g() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    public final void j() {
        SurfaceTexture surfaceTexture;
        if (this.i && this.j != null && this.e.getSurfaceTexture() != (surfaceTexture = this.j)) {
            this.e.setSurfaceTexture(surfaceTexture);
            this.j = null;
            this.i = false;
        }
    }

    public final void k() {
        this.i = true;
    }

    public final void l(y4e y4e, xz xzVar) {
        this.b = y4e.b;
        this.l = xzVar;
        FrameLayout frameLayout = (FrameLayout) this.c;
        frameLayout.getClass();
        ((Size) this.b).getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new ihe(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        y4e y4e2 = this.h;
        if (y4e2 != null) {
            y4e2.d();
        }
        this.h = y4e;
        Executor a = kq3.a(this.e.getContext());
        y4e.k.a(new zbe(this, 2, y4e), a);
        p();
    }

    public final ch7 o() {
        return hwf.f(new sic(28, this));
    }

    public final void p() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size != null && (surfaceTexture = this.f) != null && this.h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
            Surface surface = new Surface(this.f);
            y4e y4e = this.h;
            vn1 f2 = hwf.f(new joc(this, 8, surface));
            this.g = f2;
            f2.b.c(new wc3((Object) this, (Object) surface, (Object) f2, (Object) y4e, 16), kq3.a(this.e.getContext()));
            this.a = true;
            m();
        }
    }
}
