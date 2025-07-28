package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: x90  reason: default package */
public final class x90 extends vn7 {
    public final long a;
    public final long b;
    public final d03 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final ljb g;

    public x90(long j, long j2, y80 y80, Integer num, String str, ArrayList arrayList) {
        ljb ljb = ljb.a;
        this.a = j;
        this.b = j2;
        this.c = y80;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = ljb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vn7)) {
            return false;
        }
        vn7 vn7 = (vn7) obj;
        if (this.a == ((x90) vn7).a) {
            x90 x90 = (x90) vn7;
            if (this.b == x90.b) {
                d03 d03 = x90.c;
                d03 d032 = this.c;
                if (d032 != null ? d032.equals(d03) : d03 == null) {
                    Integer num = x90.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = x90.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = x90.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                ljb ljb = x90.g;
                                ljb ljb2 = this.g;
                                if (ljb2 == null) {
                                    if (ljb == null) {
                                        return true;
                                    }
                                } else if (ljb2.equals(ljb)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i2 = 0;
        d03 d03 = this.c;
        int hashCode = (i ^ (d03 == null ? 0 : d03.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        ljb ljb = this.g;
        if (ljb != null) {
            i2 = ljb.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
