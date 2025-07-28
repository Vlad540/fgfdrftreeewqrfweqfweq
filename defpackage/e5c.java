package defpackage;

/* renamed from: e5c  reason: default package */
public final class e5c {
    public final mge a;
    public final mge b;
    public final d5c c;
    public final d5c d;
    public final mge e;
    public final boolean f;

    public e5c(hge hge, hge hge2, d5c d5c, d5c d5c2, mge mge, boolean z) {
        this.a = hge;
        this.b = hge2;
        this.c = d5c;
        this.d = d5c2;
        this.e = mge;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5c)) {
            return false;
        }
        e5c e5c = (e5c) obj;
        return hhd.f(this.a, e5c.a) && hhd.f(this.b, e5c.b) && hhd.f(this.c, e5c.c) && hhd.f(this.d, e5c.d) && hhd.f(this.e, e5c.e) && this.f == e5c.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mge mge = this.b;
        int hashCode2 = mge == null ? 0 : mge.hashCode();
        return Boolean.hashCode(this.f) + c3d.e((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitWithRecordState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", negativeButton=");
        sb.append(this.c);
        sb.append(", positiveButton=");
        sb.append(this.d);
        sb.append(", recordTitle=");
        sb.append(this.e);
        sb.append(", canRemove=");
        return hr1.j(sb, this.f, ")");
    }
}
