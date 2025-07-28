package defpackage;

/* renamed from: ulf  reason: default package */
public final class ulf implements wlf {
    public final String a;
    public final hnf b;

    public ulf(String str, hnf hnf) {
        this.a = str;
        this.b = hnf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulf)) {
            return false;
        }
        ulf ulf = (ulf) obj;
        return hhd.f(this.a, ulf.a) && hhd.f(this.b, ulf.b);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        hnf hnf = this.b;
        if (hnf != null) {
            i = hnf.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShowShareDialog(text=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
