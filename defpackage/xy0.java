package defpackage;

/* renamed from: xy0  reason: default package */
public final class xy0 implements yy0 {
    public final mge a;
    public final mge b = null;
    public final int c = o1a.e;

    public xy0(hge hge) {
        int i = p1a.c;
        this.a = hge;
    }

    public final int a() {
        return 4;
    }

    public final mge c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy0)) {
            return false;
        }
        xy0 xy0 = (xy0) obj;
        if (!hhd.f(this.a, xy0.a)) {
            return false;
        }
        long j = p1a.a;
        return j == j && hhd.f(this.b, xy0.b);
    }

    public final long getItemId() {
        return p1a.a;
    }

    public final mge getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int i = 0;
        int h = us8.h(4, sxe.m(c3d.d(0, this.a.hashCode() * 31, 31), 31, p1a.a), 31);
        mge mge = this.b;
        if (mge != null) {
            i = mge.hashCode();
        }
        return h + i;
    }

    public final boolean i() {
        return false;
    }

    public final int l() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderBottom(title=");
        sb.append(this.a);
        sb.append(", sectionId=0, itemId=");
        sb.append(p1a.a);
        sb.append(", sectionItemType=");
        sb.append("SOLO");
        sb.append(", descriptionRes=");
        return me4.k(sb, this.b, ")");
    }

    public final int u() {
        return 0;
    }
}
