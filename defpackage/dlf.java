package defpackage;

/* renamed from: dlf  reason: default package */
public final class dlf {
    public static final clf Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ dlf(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        bm3.I(i, 3, blf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlf)) {
            return false;
        }
        dlf dlf = (dlf) obj;
        return hhd.f(this.a, dlf.a) && hhd.f(this.b, dlf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppRequestPhoneResponse(requestId=");
        sb.append(this.a);
        sb.append(", phone=");
        return wn6.l(sb, this.b, ")");
    }

    public dlf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
