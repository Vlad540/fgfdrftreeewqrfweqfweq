package defpackage;

/* renamed from: wy0  reason: default package */
public final class wy0 implements yy0 {
    public final mge a;
    public final int b;
    public final int c = o1a.f;

    public wy0(int i, hge hge) {
        int i2 = p1a.c;
        this.a = hge;
        this.b = i;
    }

    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy0)) {
            return false;
        }
        wy0 wy0 = (wy0) obj;
        if (!hhd.f(this.a, wy0.a) || this.b != wy0.b) {
            return false;
        }
        long j = p1a.b;
        return j == j;
    }

    public final long getItemId() {
        return p1a.b;
    }

    public final mge getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return hr1.t(4) + sxe.m(c3d.d(this.b, this.a.hashCode() * 31, 31), 31, p1a.b);
    }

    public final boolean i() {
        return false;
    }

    public final int l() {
        return this.c;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + p1a.b + ", sectionItemType=" + "SOLO" + ")";
    }

    public final int u() {
        return this.b;
    }
}
