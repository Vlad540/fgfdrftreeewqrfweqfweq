package defpackage;

/* renamed from: c02  reason: default package */
public final class c02 extends sg9 {
    public final mge b;
    public final mge c;
    public final long d;

    public c02(hge hge, jge jge, long j) {
        super(jue.a);
        this.b = hge;
        this.c = jge;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c02)) {
            return false;
        }
        c02 c02 = (c02) obj;
        return hhd.f(this.b, c02.b) && hhd.f(this.c, c02.c) && this.d == c02.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + c3d.e(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChangeOwnerBottomSheetEvent(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", contactId=");
        return wn6.k(sb, this.d, ")");
    }
}
