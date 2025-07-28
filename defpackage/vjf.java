package defpackage;

/* renamed from: vjf  reason: default package */
public final class vjf {
    public static final ujf Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ vjf(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        bm3.I(i, 3, tjf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjf)) {
            return false;
        }
        vjf vjf = (vjf) obj;
        return hhd.f(this.a, vjf.a) && hhd.f(this.b, vjf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileResponse(requestId=");
        sb.append(this.a);
        sb.append(", status=");
        return wn6.l(sb, this.b, ")");
    }

    public vjf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
