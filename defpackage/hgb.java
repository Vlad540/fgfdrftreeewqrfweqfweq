package defpackage;

/* renamed from: hgb  reason: default package */
public final class hgb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public hgb(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgb)) {
            return false;
        }
        hgb hgb = (hgb) obj;
        return oze.a(this.a, hgb.a) && oze.a(this.b, hgb.b) && oze.a(this.c, hgb.c) && oze.a(this.d, hgb.d) && oze.a(this.e, hgb.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
