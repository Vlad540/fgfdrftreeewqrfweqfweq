package defpackage;

/* renamed from: q10  reason: default package */
public final class q10 {
    public final String a;
    public final boolean b;

    public q10(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q10)) {
            return false;
        }
        q10 q10 = (q10) obj;
        return hhd.f(this.a, q10.a) && this.b == q10.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreviewCacheKey(attachId=" + this.a + ", blurred=" + this.b + ")";
    }
}
