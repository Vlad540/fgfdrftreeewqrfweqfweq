package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: ya0  reason: default package */
public final class ya0 {
    public final Size a;
    public final Rect b;
    public final hu1 c;
    public final int d;
    public final boolean e;

    public ya0(Size size, Rect rect, hu1 hu1, int i, boolean z) {
        if (size != null) {
            this.a = size;
            if (rect != null) {
                this.b = rect;
                this.c = hu1;
                this.d = i;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ya0)) {
            return false;
        }
        ya0 ya0 = (ya0) obj;
        if (this.a.equals(ya0.a) && this.b.equals(ya0.b)) {
            hu1 hu1 = ya0.c;
            hu1 hu12 = this.c;
            if (hu12 != null ? hu12.equals(hu1) : hu1 == null) {
                if (this.d == ya0.d && this.e == ya0.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        hu1 hu1 = this.c;
        return (this.e ? 1231 : 1237) ^ ((((hashCode ^ (hu1 == null ? 0 : hu1.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return hr1.j(sb, this.e, "}");
    }
}
