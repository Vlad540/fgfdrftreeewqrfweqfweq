package defpackage;

/* renamed from: y8f  reason: default package */
public final class y8f {
    public final String a;
    public final long b;
    public final String c;

    public y8f(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUploadInfo{url='");
        sb.append(this.a);
        sb.append("', videoId=");
        sb.append(this.b);
        sb.append(", token='");
        sb.append(!r1g.p(this.c));
        sb.append("'}");
        return sb.toString();
    }
}
