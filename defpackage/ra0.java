package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ra0  reason: default package */
public final class ra0 {
    public final xc4 a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final zq4 f;

    public ra0(xc4 xc4, List list, String str, int i, int i2, zq4 zq4) {
        this.a = xc4;
        this.b = list;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = zq4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [pb5, java.lang.Object] */
    public static pb5 a(xc4 xc4) {
        ? obj = new Object();
        if (xc4 != null) {
            obj.a = xc4;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                obj.b = emptyList;
                obj.c = null;
                obj.o = -1;
                obj.X = -1;
                obj.Y = zq4.d;
                return obj;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0 = (ra0) obj;
        if (this.a.equals(ra0.a) && this.b.equals(ra0.b)) {
            String str = ra0.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d == ra0.d && this.e == ra0.e && this.f.equals(ra0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return this.f.hashCode() ^ ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.c + ", mirrorMode=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }
}
