package defpackage;

/* renamed from: zl4  reason: default package */
public final class zl4 {
    public final long a;
    public final String b;

    public zl4(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl4)) {
            return false;
        }
        zl4 zl4 = (zl4) obj;
        return this.a == zl4.a && hhd.f(this.b, zl4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMediaUploadKeyDb(chatId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wn6.l(sb, this.b, ")");
    }
}
