package defpackage;

/* renamed from: af4  reason: default package */
public final class af4 {
    public final String a;
    public final String b;
    public final String c;

    public af4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || af4.class != obj.getClass()) {
            return false;
        }
        af4 af4 = (af4) obj;
        return oze.a(this.a, af4.a) && oze.a(this.b, af4.b) && oze.a(this.c, af4.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
