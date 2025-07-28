package defpackage;

/* renamed from: e0f  reason: default package */
public final class e0f {
    public final d0f a;
    public final c0f b;

    public e0f(d0f d0f, c0f c0f) {
        this.a = d0f;
        this.b = c0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0f)) {
            return false;
        }
        e0f e0f = (e0f) obj;
        if (!hhd.f(this.a, e0f.a) || !hhd.f(this.b, e0f.b) || !hhd.f((Object) null, (Object) null)) {
            return false;
        }
        hw4 hw4 = hw4.a;
        return hw4.equals(hw4);
    }

    public final int hashCode() {
        int i = 0;
        d0f d0f = this.a;
        int hashCode = (d0f == null ? 0 : d0f.hashCode()) * 31;
        c0f c0f = this.b;
        if (c0f != null) {
            i = c0f.hashCode();
        }
        return ((hashCode + i) * 961) + 1;
    }

    public final String toString() {
        return "VectorBackgroundModel(pattern=" + this.a + ", gradient=" + this.b + ", blur=null, colorEllipse=" + hw4.a + ")";
    }
}
