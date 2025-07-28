package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: vi5  reason: default package */
public final class vi5 {
    public final SparseBooleanArray a;

    public vi5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        swb.g(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi5)) {
            return false;
        }
        vi5 vi5 = (vi5) obj;
        int i = mze.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(vi5.a);
        }
        if (sparseBooleanArray.size() != vi5.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (a(i2) != vi5.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = mze.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
