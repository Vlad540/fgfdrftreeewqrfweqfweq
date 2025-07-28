package defpackage;

/* renamed from: ozb  reason: default package */
public final class ozb {
    public final ryb a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public ozb(ryb ryb, long j, long j2, String str, boolean z) {
        this.a = ryb;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozb)) {
            return false;
        }
        ozb ozb = (ozb) obj;
        return hhd.f(this.a, ozb.a) && this.b == ozb.b && this.c == ozb.c && hhd.f(this.d, ozb.d) && this.e == ozb.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + me4.d(sxe.m(sxe.m(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReaction(selfReaction=");
        sb.append(this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        sb.append(", msgTime=");
        sb.append(this.c);
        sb.append(", effectLottieUrl=");
        sb.append(this.d);
        sb.append(", checkIsVisibleInWindow=");
        return hr1.j(sb, this.e, ")");
    }
}
