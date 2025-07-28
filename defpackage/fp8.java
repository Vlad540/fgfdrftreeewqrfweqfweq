package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* renamed from: fp8  reason: default package */
public final class fp8 {
    public static final EnumSet g = EnumSet.of(ep8.c, new ep8[]{ep8.o, ep8.X, ep8.Y, ep8.Z, ep8.x0, ep8.y0, ep8.w0});
    public final long a;
    public final String b;
    public final ep8 c;
    public final int d;
    public final int e;
    public final Map f;

    public fp8(long j, String str, ep8 ep8, int i, int i2, Map map) {
        this.a = j;
        this.b = str;
        this.c = ep8;
        this.d = i;
        this.e = i2;
        this.f = map;
    }

    public static fp8 a(fp8 fp8, int i, int i2, int i3) {
        long j = fp8.a;
        String str = fp8.b;
        ep8 ep8 = fp8.c;
        if ((i3 & 8) != 0) {
            i = fp8.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = fp8.e;
        }
        Map map = fp8.f;
        fp8.getClass();
        return new fp8(j, str, ep8, i4, i2, map);
    }

    public final fp8 b() {
        if (this.e <= 0 || this.d < 0) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp8)) {
            return false;
        }
        fp8 fp8 = (fp8) obj;
        return this.a == fp8.a && hhd.f(this.b, fp8.b) && this.c == fp8.c && this.d == fp8.d && this.e == fp8.e && hhd.f(this.f, fp8.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int d2 = c3d.d(this.e, c3d.d(this.d, (this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31, 31), 31);
        Map map = this.f;
        if (map != null) {
            i = map.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "MessageElementData(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.d + ", length=" + this.e + ", attributes=" + this.f + ")";
    }
}
