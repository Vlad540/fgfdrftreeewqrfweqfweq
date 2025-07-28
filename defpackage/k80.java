package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: k80  reason: default package */
public final class k80 {
    public final xa0 a;
    public final int b;
    public final Size c;
    public final zq4 d;
    public final List e;
    public final ia3 f;
    public final Range g;

    public k80(xa0 xa0, int i, Size size, zq4 zq4, List list, ia3 ia3, Range range) {
        if (xa0 != null) {
            this.a = xa0;
            this.b = i;
            if (size != null) {
                this.c = size;
                if (zq4 != null) {
                    this.d = zq4;
                    if (list != null) {
                        this.e = list;
                        this.f = ia3;
                        this.g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80 = (k80) obj;
        if (this.a.equals(k80.a) && this.b == k80.b && this.c.equals(k80.c) && this.d.equals(k80.d) && this.e.equals(k80.e)) {
            ia3 ia3 = k80.f;
            ia3 ia32 = this.f;
            if (ia32 != null ? ia32.equals(ia3) : ia3 == null) {
                Range range = k80.g;
                Range range2 = this.g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        ia3 ia3 = this.f;
        int hashCode2 = (hashCode ^ (ia3 == null ? 0 : ia3.hashCode())) * 1000003;
        Range range = this.g;
        if (range != null) {
            i = range.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
