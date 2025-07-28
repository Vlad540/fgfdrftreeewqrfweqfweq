package defpackage;

import java.util.RandomAccess;

/* renamed from: gga  reason: default package */
public final class gga extends x1 implements RandomAccess {
    public final uu0[] a;
    public final int[] b;

    public gga(uu0[] uu0Arr, int[] iArr) {
        this.a = uu0Arr;
        this.b = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof uu0) {
            return super.contains((uu0) obj);
        }
        return false;
    }

    public final Object get(int i) {
        return this.a[i];
    }

    public final int getSize() {
        return this.a.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof uu0) {
            return super.indexOf((uu0) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof uu0) {
            return super.lastIndexOf((uu0) obj);
        }
        return -1;
    }
}
