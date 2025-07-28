package defpackage;

/* renamed from: hcb  reason: default package */
public final class hcb extends mcb {
    public final CharSequence a;
    public final mge b;

    public hcb(CharSequence charSequence, hge hge) {
        this.a = charSequence;
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcb)) {
            return false;
        }
        hcb hcb = (hcb) obj;
        return hhd.f(this.a, hcb.a) && hhd.f(this.b, hcb.b);
    }

    public final long getItemId() {
        return (long) 65536;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mge mge = this.b;
        return hashCode + (mge == null ? 0 : mge.hashCode());
    }

    public final int l() {
        return 65536;
    }

    public final String toString() {
        return "ContactDescription(text=" + this.a + ", title=" + this.b + ")";
    }
}
