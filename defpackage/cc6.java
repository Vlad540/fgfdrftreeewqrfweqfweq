package defpackage;

/* renamed from: cc6  reason: default package */
public final class cc6 {
    public static final cc6 e = dc6.l(Integer.MIN_VALUE, 1, dc6.J0, 0.0f);
    public final boolean a;
    public final zb6 b;
    public final n1g c;
    public final float d;

    public cc6(boolean z, zb6 zb6, n1g n1g, float f) {
        this.a = z;
        this.b = zb6;
        this.c = n1g;
        this.d = f;
    }

    public final n1g a(boolean z) {
        sb6 sb6 = dc6.J0;
        n1g n1g = this.c;
        return n1g != sb6 ? n1g : this.d == 0.0f ? z ? dc6.M0 : dc6.R0 : dc6.S0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cc6.class != obj.getClass()) {
            return false;
        }
        cc6 cc6 = (cc6) obj;
        return this.c.equals(cc6.c) && this.b.equals(cc6.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
