package defpackage;

/* renamed from: rad  reason: default package */
public final class rad implements rz {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final tp6 f;
    public final long g;

    public rad(long j, String str, String str2, String str3, String str4, tp6 tp6, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = tp6;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rad)) {
            return false;
        }
        rad rad = (rad) obj;
        return this.a == rad.a && hhd.f(this.b, rad.b) && hhd.f(this.c, rad.c) && hhd.f(this.d, rad.d) && hhd.f(this.e, rad.e) && hhd.f(this.f, rad.f) && this.g == rad.g;
    }

    public final int hashCode() {
        int d2 = me4.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        tp6 tp6 = this.f;
        if (tp6 != null) {
            i = tp6.hashCode();
        }
        return Long.hashCode(this.g) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttachModel(shareId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", host=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", previewConfig=");
        sb.append(this.f);
        sb.append(", messageId=");
        return wn6.k(sb, this.g, ")");
    }
}
