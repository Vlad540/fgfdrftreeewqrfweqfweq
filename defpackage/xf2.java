package defpackage;

/* renamed from: xf2  reason: default package */
public final class xf2 {
    public final vy5 a;
    public final boolean b;
    public final boolean c;

    public xf2(vy5 vy5, boolean z, boolean z2, int i) {
        vy5 = (i & 1) != 0 ? null : vy5;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? true : z2;
        this.a = vy5;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf2)) {
            return false;
        }
        xf2 xf2 = (xf2) obj;
        return hhd.f(this.a, xf2.a) && this.b == xf2.b && this.c == xf2.c;
    }

    public final int hashCode() {
        vy5 vy5 = this.a;
        return Boolean.hashCode(this.c) + th2.f((vy5 == null ? 0 : vy5.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameState(frame=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", featureEnabled=");
        return hr1.j(sb, this.c, ")");
    }
}
