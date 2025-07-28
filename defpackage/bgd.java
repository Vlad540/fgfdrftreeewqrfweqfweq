package defpackage;

/* renamed from: bgd  reason: default package */
public final class bgd {
    public final long a;
    public final m5c b;
    public final ge1 c;
    public final long d;
    public final String e;
    public final String f;

    public bgd(long j, m5c m5c, ge1 ge1, long j2, String str, String str2) {
        this.a = j;
        this.b = m5c;
        this.c = ge1;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgd)) {
            return false;
        }
        bgd bgd = (bgd) obj;
        return this.a == bgd.a && this.b == bgd.b && hhd.f(this.c, bgd.c) && this.d == bgd.d && hhd.f(this.e, bgd.e) && hhd.f(this.f, bgd.f);
    }

    public final int hashCode() {
        int m = sxe.m((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        int i = 0;
        String str = this.e;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(this.a);
        sb.append(", recordType=");
        sb.append(this.b);
        sb.append(", initiator=");
        sb.append(this.c);
        sb.append(", recordStartTime=");
        sb.append(this.d);
        sb.append(", recordExternalMovieId=");
        sb.append(this.e);
        sb.append(", recordExternalOwnerId=");
        return wn6.l(sb, this.f, ")");
    }
}
