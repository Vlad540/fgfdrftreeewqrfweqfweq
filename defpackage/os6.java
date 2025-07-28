package defpackage;

/* renamed from: os6  reason: default package */
public final class os6 extends n1 implements bs9 {
    public final double a;

    public os6(double d) {
        this.a = d;
    }

    public final String a() {
        double d = this.a;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    public final int e() {
        return 4;
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
        } else if (e != 4) {
            return false;
        } else {
            return this.a == uze.l().a;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final os6 l() {
        return this;
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    public final os6 v() {
        return this;
    }
}
