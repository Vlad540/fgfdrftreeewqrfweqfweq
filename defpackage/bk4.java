package defpackage;

/* renamed from: bk4  reason: default package */
public final class bk4 extends kh0 {
    public final long X;
    public final String b;
    public final String c;
    public final String o;

    public bk4(long j, long j2, String str, String str2, String str3) {
        super(j);
        this.b = str;
        this.c = str2;
        this.o = str3 == null ? "" : str3;
        this.X = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleteEvent{url='");
        sb.append(this.b);
        sb.append("', path='");
        sb.append(this.c);
        sb.append("', attachLocalId='");
        sb.append(this.o);
        sb.append("', messageId=");
        return m4b.i(sb, this.X, '}');
    }
}
