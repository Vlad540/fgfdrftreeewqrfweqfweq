package defpackage;

import android.util.SparseArray;

/* renamed from: n39  reason: default package */
public final class n39 {
    public final SparseArray a;
    public hte b;

    public n39(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(hte hte, int i, int i2) {
        int a2 = hte.a(i);
        SparseArray sparseArray = this.a;
        n39 n39 = sparseArray == null ? null : (n39) sparseArray.get(a2);
        if (n39 == null) {
            n39 = new n39(1);
            sparseArray.put(hte.a(i), n39);
        }
        if (i2 > i) {
            n39.a(hte, i + 1, i2);
        } else {
            n39.b = hte;
        }
    }
}
