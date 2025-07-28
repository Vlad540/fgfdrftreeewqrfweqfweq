package defpackage;

/* renamed from: de2  reason: default package */
public final class de2 {
    public final eea a;
    public final CharSequence b;

    public de2(eea eea, String str) {
        this.a = eea;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de2)) {
            return false;
        }
        de2 de2 = (de2) obj;
        return hhd.f(this.a, de2.a) && hhd.f(this.b, de2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMediaTabsViewState(avatarParams=" + this.a + ", chatName=" + this.b + ")";
    }
}
