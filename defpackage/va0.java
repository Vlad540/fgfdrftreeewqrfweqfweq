package defpackage;

import android.util.Range;
import android.util.Size;

/* renamed from: va0  reason: default package */
public final class va0 {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final zq4 b;
    public final Range c;
    public final ia3 d;
    public final boolean e;

    public va0(Size size, zq4 zq4, Range range, ia3 ia3, boolean z) {
        this.a = size;
        this.b = zq4;
        this.c = range;
        this.d = ia3;
        this.e = z;
    }

    public final uwb a() {
        uwb uwb = new uwb(1);
        uwb.b = this.a;
        uwb.c = this.b;
        uwb.d = this.c;
        uwb.e = this.d;
        uwb.f = Boolean.valueOf(this.e);
        return uwb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof va0)) {
            return false;
        }
        va0 va0 = (va0) obj;
        if (this.a.equals(va0.a) && this.b.equals(va0.b) && this.c.equals(va0.c)) {
            ia3 ia3 = va0.d;
            ia3 ia32 = this.d;
            if (ia32 != null ? ia32.equals(ia3) : ia3 == null) {
                if (this.e == va0.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ia3 ia3 = this.d;
        return (this.e ? 1231 : 1237) ^ ((hashCode ^ (ia3 == null ? 0 : ia3.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return hr1.j(sb, this.e, "}");
    }
}
