package defpackage;

/* renamed from: ks6  reason: default package */
public final class ks6 extends n1 implements ot6, uze {
    public static final ks6 b = new ks6(true);
    public static final ks6 c = new ks6(false);
    public final boolean a;

    public ks6(boolean z) {
        this.a = z;
    }

    public final String a() {
        return Boolean.toString(this.a);
    }

    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        uze uze = (uze) obj;
        int e = ((n1) uze).e();
        if (e == 0) {
            throw null;
        } else if (e != 2) {
            return false;
        } else {
            return this.a == uze.q().a;
        }
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final ks6 q() {
        return this;
    }

    public final ks6 t() {
        return this;
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
