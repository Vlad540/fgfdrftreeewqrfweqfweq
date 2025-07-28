package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: r4b  reason: default package */
public final class r4b {
    public final Executor a;
    public ia0 b;
    public m54 c;
    public x3a d;
    public m54 e;
    public zl3 f;
    public qr4 g;
    public m54 h;
    public xhd i;
    public final xe6 j;
    public final boolean k;

    public r4b(Executor executor) {
        xe6 xe6 = wf4.a;
        if (wf4.a.j(LowMemoryQuirk.class) != null) {
            this.a = new ryc(executor);
        } else {
            this.a = executor;
        }
        this.j = xe6;
        this.k = xe6.i(IncorrectJpegMetadataQuirk.class);
    }

    public final ea0 a(ea0 ea0, int i2) {
        e07.p((String) null, am7.u(ea0.c));
        this.f.getClass();
        byte[] bArr = (byte[]) ea0.a;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            Rect rect = ea0.e;
            Bitmap decodeRegion = newInstance.decodeRegion(rect, options);
            i25 i25 = ea0.b;
            Objects.requireNonNull(i25);
            Rect rect2 = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
            RectF rectF = hqe.a;
            Matrix matrix = new Matrix(ea0.g);
            matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
            Size size = new Size(decodeRegion.getWidth(), decodeRegion.getHeight());
            ws1 ws1 = ea0.h;
            if (ws1 != null) {
                this.e.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeRegion.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Objects.requireNonNull(i25);
                return new ea0(byteArray, i25, (Build.VERSION.SDK_INT < 34 || !km0.d(decodeRegion)) ? 256 : 4101, size, rect2, ea0.f, matrix, ws1);
            }
            throw new NullPointerException("Null cameraCaptureResult");
        } catch (IOException e2) {
            throw new Exception("Failed to decode JPEG.", e2);
        }
    }

    public final lr6 b(ja0 ja0) {
        s4b s4b = ja0.a;
        ea0 ea0 = (ea0) this.c.e(ja0);
        if ((ea0.c == 35 || this.k) && this.b.d == 256) {
            ea0 ea02 = (ea0) this.d.j(new p90(ea0, s4b.d));
            this.h.getClass();
            Size size = ea02.d;
            yic yic = new yic(x87.n(size.getWidth(), size.getHeight(), 256, 2));
            lr6 a2 = ImageProcessingUtil.a(yic, (byte[]) ea02.a);
            yic.a();
            Objects.requireNonNull(a2);
            i25 i25 = ea02.b;
            Objects.requireNonNull(i25);
            qw5 qw5 = (qw5) a2;
            Size size2 = new Size(qw5.getWidth(), qw5.getHeight());
            qw5.k0();
            ea0 = new ea0(a2, i25, qw5.k0(), size2, ea02.e, ea02.f, ea02.g, ea02.h);
        }
        this.g.getClass();
        lr6 lr6 = (lr6) ea0.a;
        c4d c4d = new c4d(lr6, ea0.d, new q90(lr6.getImageInfo().e(), lr6.getImageInfo().getTimestamp(), ea0.f, ea0.g));
        c4d.d(ea0.e);
        return c4d;
    }
}
