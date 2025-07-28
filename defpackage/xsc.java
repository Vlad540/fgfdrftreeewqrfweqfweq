package defpackage;

/* renamed from: xsc  reason: default package */
public final class xsc implements q8b {
    public final int X;
    public final mge a;
    public final u16 b;
    public final nge c;
    public final int o;

    public xsc(mge mge, nge nge, int i, int i2) {
        u1c u1c = new u1c(3);
        nge = (i2 & 4) != 0 ? nte.t : nge;
        i = (i2 & 8) != 0 ? 2048 : i;
        this.a = mge;
        this.b = u1c;
        this.c = nge;
        this.o = i;
        this.X = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsc)) {
            return false;
        }
        xsc xsc = (xsc) obj;
        return hhd.f(this.a, xsc.a) && hhd.f(this.b, xsc.b) && hhd.f(this.c, xsc.c) && jjd.m(this.o, xsc.o);
    }

    public final long getItemId() {
        return (long) this.o;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.o) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final int l() {
        return this.X;
    }

    public final String toString() {
        String R = jjd.R(this.o);
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ", itemViewType=" + R + ")";
    }
}
