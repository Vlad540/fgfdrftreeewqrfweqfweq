package defpackage;

import java.util.Arrays;

/* renamed from: xwf  reason: default package */
public final class xwf {
    public final boolean[] a = new boolean[ke0.values().length];
    public int b = 0;

    public final boolean a(ke0 ke0, boolean z) {
        int ordinal = ke0.ordinal();
        boolean[] zArr = this.a;
        boolean z2 = zArr[ordinal];
        zArr[ke0.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xwf.class != obj.getClass()) {
            return false;
        }
        xwf xwf = (xwf) obj;
        return this.b == xwf.b && Arrays.equals(this.a, xwf.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
