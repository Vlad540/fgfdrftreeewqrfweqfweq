package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: ea0  reason: default package */
public final class ea0 {
    public final Object a;
    public final i25 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final ws1 h;

    public ea0(Object obj, i25 i25, int i, Size size, Rect rect, int i2, Matrix matrix, ws1 ws1) {
        if (obj != null) {
            this.a = obj;
            this.b = i25;
            this.c = i;
            this.d = size;
            if (rect != null) {
                this.e = rect;
                this.f = i2;
                if (matrix != null) {
                    this.g = matrix;
                    if (ws1 != null) {
                        this.h = ws1;
                        return;
                    }
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null data");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0 = (ea0) obj;
        if (this.a.equals(ea0.a)) {
            i25 i25 = ea0.b;
            i25 i252 = this.b;
            if (i252 != null ? i252.equals(i25) : i25 == null) {
                if (this.c == ea0.c && this.d.equals(ea0.d) && this.e.equals(ea0.e) && this.f == ea0.f && this.g.equals(ea0.g) && this.h.equals(ea0.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        i25 i25 = this.b;
        return this.h.hashCode() ^ ((((((((((((hashCode ^ (i25 == null ? 0 : i25.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
