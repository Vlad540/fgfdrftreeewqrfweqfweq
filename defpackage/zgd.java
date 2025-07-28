package defpackage;

import java.util.Arrays;

/* renamed from: zgd  reason: default package */
public final class zgd {
    public static final zgd d;
    public final Comparable[] a;
    public final Object[] b;
    public final int c;

    static {
        Comparable[] comparableArr = new Comparable[0];
        d = new zgd(comparableArr, comparableArr);
    }

    public zgd(Comparable[] comparableArr, Object[] objArr) {
        if (comparableArr.length == objArr.length) {
            this.a = comparableArr;
            this.b = objArr;
            this.c = comparableArr.length;
            return;
        }
        StringBuilder sb = new StringBuilder("different array sizes: ");
        sb.append(comparableArr.length);
        sb.append(" keys and ");
        throw new IllegalArgumentException(wn6.j(sb, objArr.length, " values"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgd)) {
            return false;
        }
        zgd zgd = (zgd) obj;
        return zgd.c == this.c && Arrays.equals(zgd.a, this.a) && Arrays.equals(zgd.b, this.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append("{");
            sb.append(this.a[i]);
            sb.append(" : ");
            sb.append(this.b[i]);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }
}
