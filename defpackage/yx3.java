package defpackage;

/* renamed from: yx3  reason: default package */
public final class yx3 {
    public final pjb a;
    public final boolean b;

    public yx3(pjb pjb, boolean z) {
        this.a = pjb;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yx3)) {
            return false;
        }
        yx3 yx3 = (yx3) obj;
        return yx3.a.equals(this.a) && yx3.b == this.b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
