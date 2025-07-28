package defpackage;

import android.content.Context;
import android.view.TextureView;

/* renamed from: d9f  reason: default package */
public final class d9f extends TextureView {
    public final /* synthetic */ f9f a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d9f(f9f f9f, Context context) {
        super(context);
        this.a = f9f;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b9f b9f = this.a.w0;
        if (b9f != null) {
            b9f.onSurfaceTextureDestroyed(getSurfaceTexture());
        }
    }
}
