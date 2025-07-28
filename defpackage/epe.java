package defpackage;

import java.util.Arrays;

/* renamed from: epe  reason: default package */
public final class epe {
    public final f55[] a;
    public int b;

    public epe(f55... f55Arr) {
        this.a = f55Arr;
        int length = f55Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || epe.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((epe) obj).a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}
