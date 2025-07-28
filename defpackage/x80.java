package defpackage;

import android.util.Size;

/* renamed from: x80  reason: default package */
public final class x80 {
    public ps1 a = new Object();
    public cs6 b;
    public final cs6 c = null;
    public final Size d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Size h;
    public final int i;
    public final ir4 j;
    public final ir4 k;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ps1] */
    public x80(Size size, int i2, int i3, boolean z, ir4 ir4, ir4 ir42) {
        if (size != null) {
            this.d = size;
            this.e = i2;
            this.f = i3;
            this.g = z;
            this.h = null;
            this.i = 35;
            this.j = ir4;
            this.k = ir42;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80 = (x80) obj;
        if (this.d.equals(x80.d) && this.e == x80.e && this.f == x80.f && this.g == x80.g) {
            Size size = x80.h;
            Size size2 = this.h;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.i == x80.i && this.j.equals(x80.j) && this.k.equals(x80.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * -721379959;
        Size size = this.h;
        return this.k.hashCode() ^ ((((((hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormat=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSize=" + this.h + ", postviewImageFormat=" + this.i + ", requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
