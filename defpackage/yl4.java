package defpackage;

/* renamed from: yl4  reason: default package */
public final class yl4 {
    public final long a;
    public final String b;

    public yl4(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl4)) {
            return false;
        }
        yl4 yl4 = (yl4) obj;
        return this.a == yl4.a && hhd.f(this.b, yl4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMediaUploadKey(chatId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wn6.l(sb, this.b, ")");
    }
}
