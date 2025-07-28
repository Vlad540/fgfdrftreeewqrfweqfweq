package defpackage;

/* renamed from: dee  reason: default package */
public final class dee {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e = System.currentTimeMillis();

    public dee(String str, String str2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dee)) {
            return false;
        }
        dee dee = (dee) obj;
        return this.a == dee.a && this.b == dee.b && hhd.f(this.c, dee.c) && hhd.f(this.d, dee.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + me4.d(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskFileFromWebAppDownloadData(requestId=");
        sb.append(this.a);
        sb.append(", botId=");
        sb.append(this.b);
        sb.append(", fileUrl=");
        sb.append(this.c);
        sb.append(", fileName=");
        return wn6.l(sb, this.d, ")");
    }
}
