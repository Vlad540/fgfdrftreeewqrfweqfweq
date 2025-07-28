package defpackage;

import java.util.Arrays;

/* renamed from: w90  reason: default package */
public final class w90 extends pn7 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final ph9 g;

    public w90(long j, Integer num, long j2, byte[] bArr, String str, long j3, aa0 aa0) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = aa0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pn7)) {
            return false;
        }
        pn7 pn7 = (pn7) obj;
        if (this.a == ((w90) pn7).a && ((num = this.b) != null ? num.equals(((w90) pn7).b) : ((w90) pn7).b == null)) {
            w90 w90 = (w90) pn7;
            if (this.c == w90.c) {
                if (Arrays.equals(this.d, pn7 instanceof w90 ? ((w90) pn7).d : w90.d)) {
                    String str = w90.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == w90.f) {
                            ph9 ph9 = w90.g;
                            ph9 ph92 = this.g;
                            if (ph92 == null) {
                                if (ph9 == null) {
                                    return true;
                                }
                            } else if (ph92.equals(ph9)) {
                                return true;
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        ph9 ph9 = this.g;
        if (ph9 != null) {
            i2 = ph9.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
