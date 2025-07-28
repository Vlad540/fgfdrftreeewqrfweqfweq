package defpackage;

/* renamed from: ze4  reason: default package */
public final class ze4 {
    public final String a;
    public final String b;
    public final String c;

    public ze4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ze4.class != obj.getClass()) {
            return false;
        }
        ze4 ze4 = (ze4) obj;
        return mze.a(this.a, ze4.a) && mze.a(this.b, ze4.b) && mze.a(this.c, ze4.c);
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
