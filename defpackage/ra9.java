package defpackage;

/* renamed from: ra9  reason: default package */
public final class ra9 extends vx3 {
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public ra9(long j2, long j3, String str, String str2, String str3, String str4) {
        this.g = j2;
        this.h = j3;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra9)) {
            return false;
        }
        ra9 ra9 = (ra9) obj;
        return this.g == ra9.g && this.h == ra9.h && hhd.f(this.i, ra9.i) && hhd.f(this.j, ra9.j) && hhd.f(this.k, ra9.k) && hhd.f(this.l, ra9.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + me4.d(me4.d(me4.d(sxe.m(Long.hashCode(this.g) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttach(chatId=");
        sb.append(this.g);
        sb.append(", messageId=");
        sb.append(this.h);
        sb.append(", attachLocalId=");
        sb.append(this.i);
        sb.append(", audioUrl=");
        sb.append(this.j);
        sb.append(", attachTitle=");
        sb.append(this.k);
        sb.append(", attachSubtitle=");
        return wn6.l(sb, this.l, ")");
    }
}
