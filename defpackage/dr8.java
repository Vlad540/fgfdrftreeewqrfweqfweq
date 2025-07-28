package defpackage;

/* renamed from: dr8  reason: default package */
public final class dr8 {
    public final long a;
    public final long b;
    public final String c;

    public dr8(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dr8.class != obj.getClass()) {
            return false;
        }
        dr8 dr8 = (dr8) obj;
        if (this.a != dr8.a || this.b != dr8.b) {
            return false;
        }
        String str = dr8.c;
        String str2 = this.c;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMediaUploadKey{messageId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", attachLocalId='");
        return wn6.l(sb, this.c, "'}");
    }
}
