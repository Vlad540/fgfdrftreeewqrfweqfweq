package defpackage;

/* renamed from: igd  reason: default package */
public final class igd implements pg7 {
    public final mge a;
    public final mge b;
    public final long c;
    public final int o = by9.a;

    public igd(int i, hge hge, lge lge) {
        this.a = hge;
        this.b = lge;
        this.c = (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igd)) {
            return false;
        }
        igd igd = (igd) obj;
        igd.getClass();
        int i = by9.a;
        return hhd.f(this.a, igd.a) && hhd.f(this.b, igd.b);
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + c3d.e(Integer.hashCode(by9.b) * 31, 31, this.a);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "SimpleActionItem(id=" + by9.b + ", title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
