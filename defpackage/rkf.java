package defpackage;

/* renamed from: rkf  reason: default package */
public final class rkf {
    public static final qkf Companion = new Object();
    public final String a;

    public /* synthetic */ rkf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            bm3.I(i, 1, pkf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkf) && hhd.f(this.a, ((rkf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("WebAppOpenMaxLinkRequest(url="), this.a, ")");
    }
}
