package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: wi5  reason: default package */
public final class wi5 {
    public final SparseBooleanArray a;

    public wi5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        oyb.f(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5)) {
            return false;
        }
        wi5 wi5 = (wi5) obj;
        int i = oze.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(wi5.a);
        }
        if (sparseBooleanArray.size() != wi5.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (b(i2) != wi5.b(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = oze.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + b(i2);
        }
        return size;
    }
}
