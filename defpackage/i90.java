package defpackage;

import java.util.HashMap;
import java.util.Map;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: i90  reason: default package */
public final class i90 {
    public final String a;
    public final Integer b;
    public final cx4 c;
    public final long d;
    public final long e;
    public final Map f;

    public i90(String str, Integer num, cx4 cx4, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = cx4;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [yd3, java.lang.Object] */
    public final yd3 c() {
        ? obj = new Object();
        String str = this.a;
        if (str != null) {
            obj.a = str;
            obj.b = this.b;
            cx4 cx4 = this.c;
            if (cx4 != null) {
                obj.c = cx4;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f = new HashMap(this.f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90 = (i90) obj;
        if (this.a.equals(i90.a)) {
            Integer num = i90.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(i90.c) && this.d == i90.d && this.e == i90.e && this.f.equals(i90.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return this.f.hashCode() ^ ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
