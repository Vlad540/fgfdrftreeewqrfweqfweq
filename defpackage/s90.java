package defpackage;

/* renamed from: s90  reason: default package */
public final class s90 {
    public final String a;
    public final String b;
    public final String c;
    public final gb0 d;
    public final int e;

    public s90(String str, String str2, String str3, gb0 gb0, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gb0;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s90)) {
            return false;
        }
        s90 s90 = (s90) obj;
        String str = this.a;
        if (str != null ? str.equals(s90.a) : s90.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(s90.b) : s90.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(s90.c) : s90.c == null) {
                    gb0 gb0 = this.d;
                    if (gb0 != null ? gb0.equals(s90.d) : s90.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (s90.e == 0) {
                                return true;
                            }
                        } else if (hr1.c(i, s90.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        gb0 gb0 = this.d;
        int hashCode4 = (hashCode3 ^ (gb0 == null ? 0 : gb0.hashCode())) * 1000003;
        int i2 = this.e;
        if (i2 != 0) {
            i = hr1.t(i2);
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
