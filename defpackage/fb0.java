package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: fb0  reason: default package */
public final class fb0 {
    public int a;
    public final Executor b;
    public final lv1 c;
    public final Rect d;
    public final Matrix e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;

    public fb0(Executor executor, lv1 lv1, Rect rect, Matrix matrix, int i2, int i3, int i4, List list) {
        this.a = ((CaptureFailedRetryQuirk) wf4.a.j(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor != null) {
            this.b = executor;
            this.c = lv1;
            this.d = rect;
            if (matrix != null) {
                this.e = matrix;
                this.f = i2;
                this.g = i3;
                this.h = i4;
                if (list != null) {
                    this.i = list;
                    return;
                }
                throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
            }
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        throw new NullPointerException("Null appExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0 = (fb0) obj;
        if (this.b.equals(fb0.b)) {
            lv1 lv1 = fb0.c;
            lv1 lv12 = this.c;
            if (lv12 != null ? lv12.equals(lv1) : lv1 == null) {
                if (this.d.equals(fb0.d) && this.e.equals(fb0.e) && this.f == fb0.f && this.g == fb0.g && this.h == fb0.h && this.i.equals(fb0.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        lv1 lv1 = this.c;
        return this.i.hashCode() ^ ((((((((((((hashCode ^ (lv1 == null ? 0 : lv1.hashCode())) * 583896283) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.b);
        sb.append(", inMemoryCallback=");
        sb.append(this.c);
        sb.append(", onDiskCallback=null, outputFileOptions=null, cropRect=");
        sb.append(this.d);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", rotationDegrees=");
        sb.append(this.f);
        sb.append(", jpegQuality=");
        sb.append(this.g);
        sb.append(", captureMode=");
        sb.append(this.h);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return hr1.i(sb, this.i, "}");
    }
}
