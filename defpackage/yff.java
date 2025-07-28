package defpackage;

/* renamed from: yff  reason: default package */
public final class yff implements cgf {
    public final String a;
    public final String b;
    public final stf c;

    public yff(stf stf, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = stf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yff)) {
            return false;
        }
        yff yff = (yff) obj;
        return hhd.f(this.a, yff.a) && hhd.f(this.b, yff.b) && hhd.f(this.c, yff.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        stf stf = this.c;
        if (stf != null) {
            i = stf.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", reason=" + this.b + ", cryptoObject=" + this.c + ")";
    }
}
