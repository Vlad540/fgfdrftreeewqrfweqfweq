package defpackage;

/* renamed from: pf5  reason: default package */
public final class pf5 {
    public final long a;
    public final String b;
    public final String c;

    public pf5(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileUploadInfo{fileId=");
        sb.append(this.a);
        sb.append(", token='");
        sb.append(!r1g.p(this.b));
        sb.append("', url='");
        return wn6.l(sb, this.c, "'}");
    }
}
