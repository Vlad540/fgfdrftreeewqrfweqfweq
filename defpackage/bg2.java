package defpackage;

/* renamed from: bg2  reason: default package */
public final class bg2 {
    public final mge a;

    public bg2(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg2) && hhd.f(this.a, ((bg2) obj).a);
    }

    public final int hashCode() {
        mge mge = this.a;
        if (mge == null) {
            return 0;
        }
        return mge.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ToolbarState(title="), this.a, ")");
    }
}
