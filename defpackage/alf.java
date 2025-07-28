package defpackage;

/* renamed from: alf  reason: default package */
public final class alf {
    public static final zkf Companion = new Object();
    public final String a;

    public /* synthetic */ alf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            bm3.I(i, 1, ykf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alf) && hhd.f(this.a, ((alf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("WebAppRequestPhoneRequest(requestId="), this.a, ")");
    }
}
