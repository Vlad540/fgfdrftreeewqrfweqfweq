package defpackage;

/* renamed from: znf  reason: default package */
public final class znf {
    public static final ynf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ znf(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        bm3.I(i, 7, xnf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znf)) {
            return false;
        }
        znf znf = (znf) obj;
        return hhd.f(this.a, znf.a) && hhd.f(this.b, znf.b) && hhd.f(this.c, znf.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageGetKeyResponse(requestId=");
        sb.append(this.a);
        sb.append(", key=");
        sb.append(this.b);
        sb.append(", value=");
        return wn6.l(sb, this.c, ")");
    }

    public znf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
