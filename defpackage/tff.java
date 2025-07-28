package defpackage;

/* renamed from: tff  reason: default package */
public final class tff {
    public static final sff Companion = new Object();
    public static final l77[] d = {null, null, c2e.Companion.serializer()};
    public final String a;
    public final String b;
    public final c2e c;

    public /* synthetic */ tff(int i, String str, String str2, c2e c2e) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = c2e;
            return;
        }
        bm3.I(i, 7, rff.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tff)) {
            return false;
        }
        tff tff = (tff) obj;
        return hhd.f(this.a, tff.a) && hhd.f(this.b, tff.b) && this.c == tff.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppBiometryAuthResponse(requestId=" + this.a + ", token=" + this.b + ", status=" + this.c + ")";
    }

    public tff(String str, String str2) {
        c2e c2e = c2e.Y;
        this.a = str;
        this.b = str2;
        this.c = c2e;
    }
}
