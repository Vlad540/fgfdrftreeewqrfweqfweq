package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* renamed from: pha  reason: default package */
public final class pha extends ii0 {
    public final /* synthetic */ int c = 1;
    public Object d;

    public pha() {
    }

    public final ov0 b() {
        switch (this.c) {
            case 0:
                return new ngd(String.valueOf(((Uri) this.d).hashCode()));
            default:
                if (((ngd) this.d) == null) {
                    this.d = new ngd("RoundAsCirclePostprocessor#AntiAliased");
                }
                return (ngd) this.d;
        }
    }

    public final void c(Bitmap bitmap) {
        switch (this.c) {
            case 0:
                Bitmap t = xs7.t((Uri) this.d);
                if (t != null) {
                    Canvas canvas = new Canvas(bitmap);
                    float width = ((float) bitmap.getWidth()) / ((float) t.getWidth());
                    canvas.scale(width, width);
                    canvas.drawBitmap(t, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            default:
                NativeRoundingFilter.toCircleFast(bitmap, true);
                return;
        }
    }

    public pha(Uri uri) {
        this.d = uri;
    }

    public /* synthetic */ pha(boolean z) {
    }
}
