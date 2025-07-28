package defpackage;

import android.util.SparseIntArray;

/* renamed from: m20  reason: default package */
public final class m20 {
    public static final /* synthetic */ int b = 0;
    public final l20 a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public m20(l20 l20) {
        this.a = l20;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m20)) {
            return false;
        }
        m20 m20 = (m20) obj;
        l20 l20 = this.a;
        return l20 == null ? m20.a == null : l20.equals(m20.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
