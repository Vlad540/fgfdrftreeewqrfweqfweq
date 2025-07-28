package defpackage;

/* renamed from: sjf  reason: default package */
public final class sjf {
    public static final rjf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ sjf(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        bm3.I(i, 7, qjf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjf)) {
            return false;
        }
        sjf sjf = (sjf) obj;
        return hhd.f(this.a, sjf.a) && hhd.f(this.b, sjf.b) && hhd.f(this.c, sjf.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileRequest(requestId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", fileName=");
        return wn6.l(sb, this.c, ")");
    }
}
