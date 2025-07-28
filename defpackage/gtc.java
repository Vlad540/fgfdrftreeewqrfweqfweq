package defpackage;

/* renamed from: gtc  reason: default package */
public final class gtc implements itc {
    public final mge a;
    public final int b;
    public final long c;
    public final int o = saa.C;

    public gtc(hge hge, int i, long j) {
        this.a = hge;
        this.b = i;
        this.c = j;
    }

    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtc)) {
            return false;
        }
        gtc gtc = (gtc) obj;
        return hhd.f(this.a, gtc.a) && this.b == gtc.b && this.c == gtc.c;
    }

    public final long getItemId() {
        return this.c;
    }

    public final mge getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return hr1.t(4) + sxe.m(c3d.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final boolean i() {
        return false;
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + this.c + ", sectionItemType=" + "SOLO" + ")";
    }

    public final int u() {
        return this.b;
    }
}
