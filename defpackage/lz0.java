package defpackage;

/* renamed from: lz0  reason: default package */
public final class lz0 implements nz0 {
    public final long a;
    public final boolean b;
    public final String c;

    public lz0(long j, String str, boolean z) {
        this.a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz0)) {
            return false;
        }
        lz0 lz0 = (lz0) obj;
        return this.a == lz0.a && this.b == lz0.b && hhd.f(this.c, lz0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + th2.f(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        sb.append(this.b);
        sb.append(", link=");
        return wn6.l(sb, this.c, ")");
    }
}
