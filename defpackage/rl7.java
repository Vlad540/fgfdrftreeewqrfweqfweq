package defpackage;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.Map;

/* renamed from: rl7  reason: default package */
public final class rl7 extends mrd {
    public final /* synthetic */ c5b Y;
    public final /* synthetic */ z4b Z;
    public final /* synthetic */ tr6 w0;
    public final /* synthetic */ CancellationSignal x0;
    public final /* synthetic */ sl7 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rl7(sl7 sl7, ah0 ah0, c5b c5b, z4b z4b, c5b c5b2, z4b z4b2, tr6 tr6, CancellationSignal cancellationSignal) {
        super(ah0, c5b, z4b, "LocalThumbnailBitmapSdk29Producer");
        this.y0 = sl7;
        this.Y = c5b2;
        this.Z = z4b2;
        this.w0 = tr6;
        this.x0 = cancellationSignal;
    }

    public final void b(Object obj) {
        e13.S((e13) obj);
    }

    public final Map c(Object obj) {
        return at6.a("createdThumbnail", String.valueOf(((e13) obj) != null));
    }

    public final Object d() {
        String str;
        Bitmap bitmap;
        sl7 sl7 = this.y0;
        tr6 tr6 = this.w0;
        hbc hbc = tr6.i;
        int i = 2048;
        int i2 = hbc != null ? hbc.a : 2048;
        Uri uri = tr6.b;
        if (hbc != null) {
            i = hbc.b;
        }
        Size size = new Size(i2, i);
        try {
            sl7.getClass();
            str = fye.a(sl7.c, uri);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        CancellationSignal cancellationSignal = this.x0;
        if (str != null) {
            String a = sh8.a(str);
            bitmap = a != null ? p0e.Q(a, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(str), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(str), size, cancellationSignal);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = sl7.c.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmap == null) {
            return null;
        }
        CloseableStaticBitmap of = CloseableStaticBitmap.of(bitmap, (nbc) smc.j(), (tjb) et6.d, 0);
        ji0 ji0 = (ji0) this.Z;
        ji0.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        of.putExtras(ji0.Y);
        return e13.o0(of);
    }

    public final void e() {
        super.e();
        this.x0.cancel();
    }

    public final void f(Exception exc) {
        super.f(exc);
        c5b c5b = this.Y;
        z4b z4b = this.Z;
        c5b.e(z4b, "LocalThumbnailBitmapSdk29Producer", false);
        ((ji0) z4b).h("local", "thumbnail_bitmap");
    }

    public final void g(Object obj) {
        e13 e13 = (e13) obj;
        super.g(e13);
        boolean z = e13 != null;
        c5b c5b = this.Y;
        z4b z4b = this.Z;
        c5b.e(z4b, "LocalThumbnailBitmapSdk29Producer", z);
        ((ji0) z4b).h("local", "thumbnail_bitmap");
    }
}
