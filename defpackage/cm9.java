package defpackage;

/* renamed from: cm9  reason: default package */
public final class cm9 extends lbe {
    public final ym8 X;
    public final boolean Y;
    public final long Z;
    public final long c;
    public final j22 o;
    public final boolean w0;

    public cm9(long j, j22 j22, ym8 ym8, boolean z, long j2, boolean z2) {
        this.c = j;
        this.o = j22;
        this.X = ym8;
        this.Y = z;
        this.Z = j2;
        this.w0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm9)) {
            return false;
        }
        cm9 cm9 = (cm9) obj;
        return this.c == cm9.c && hhd.f(this.o, cm9.o) && hhd.f(this.X, cm9.X) && this.Y == cm9.Y && this.Z == cm9.Z && this.w0 == cm9.w0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        j22 j22 = this.o;
        return Boolean.hashCode(this.w0) + sxe.m(th2.f((this.X.hashCode() + ((hashCode + (j22 == null ? 0 : j22.hashCode())) * 31)) * 31, 31, this.Y), 31, this.Z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", isInvisible=");
        sb.append(this.Y);
        sb.append(", prevMessageId=");
        sb.append(this.Z);
        sb.append(", ttl=");
        return hr1.j(sb, this.w0, ")");
    }
}
