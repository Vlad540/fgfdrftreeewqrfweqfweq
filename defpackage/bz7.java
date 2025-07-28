package defpackage;

/* renamed from: bz7  reason: default package */
public final class bz7 implements ez7 {
    public final qwc a;
    public final int b;

    public bz7(qwc qwc, int i) {
        this.a = qwc;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz7)) {
            return false;
        }
        bz7 bz7 = (bz7) obj;
        return hhd.f(this.a, bz7.a) && this.b == bz7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
