package defpackage;

/* renamed from: okf  reason: default package */
public final class okf {
    public static final nkf Companion = new Object();
    public final String a;

    public /* synthetic */ okf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            bm3.I(i, 1, mkf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okf) && hhd.f(this.a, ((okf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("WebAppOpenLinkRequest(url="), this.a, ")");
    }
}
