package defpackage;

/* renamed from: ccb  reason: default package */
public final class ccb extends ncb {
    public final p92 a;

    public ccb(p92 p92) {
        this.a = p92;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccb) && hhd.f(this.a, ((ccb) obj).a);
    }

    public final long getItemId() {
        return (long) 16384;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 16384;
    }

    public final String toString() {
        return "ChatLinkItem(model=" + this.a + ")";
    }
}
