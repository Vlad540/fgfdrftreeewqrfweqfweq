package defpackage;

/* renamed from: gjd  reason: default package */
public final class gjd {
    public static final gjd c = new gjd(-1, -1);
    public final int a;
    public final int b;

    static {
        new gjd(0, 0);
    }

    public gjd(int i, int i2) {
        oyb.d((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjd)) {
            return false;
        }
        gjd gjd = (gjd) obj;
        return this.a == gjd.a && this.b == gjd.b;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
