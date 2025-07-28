package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: dya  reason: default package */
public final class dya implements lt0 {
    public final vi5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        swb.h(!false);
        new vi5(sparseBooleanArray);
    }

    public dya(vi5 vi5) {
        this.a = vi5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dya)) {
            return false;
        }
        return this.a.equals(((dya) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
