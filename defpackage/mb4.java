package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: mb4  reason: default package */
public final class mb4 extends lpe {
    public static final /* synthetic */ int d1 = 0;
    public final int O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final boolean V0;
    public final boolean W0;
    public final boolean X0;
    public final boolean Y0;
    public final boolean Z0;
    public final boolean a1;
    public final SparseArray b1;
    public final SparseBooleanArray c1;

    static {
        new mb4(new ob4());
    }

    public mb4(ob4 ob4) {
        super(ob4);
        this.P0 = ob4.z;
        this.Q0 = ob4.A;
        this.R0 = ob4.B;
        this.S0 = ob4.C;
        this.T0 = ob4.D;
        this.U0 = ob4.E;
        this.V0 = ob4.F;
        this.W0 = ob4.G;
        this.X0 = ob4.H;
        this.O0 = ob4.I;
        this.Y0 = ob4.J;
        this.Z0 = ob4.K;
        this.a1 = ob4.L;
        this.b1 = ob4.M;
        this.c1 = ob4.N;
    }

    public final pb4 a(int i, voe voe) {
        Map map = (Map) this.b1.get(i);
        if (map != null) {
            return (pb4) map.get(voe);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mb4.class != obj.getClass()) {
            return false;
        }
        mb4 mb4 = (mb4) obj;
        if (super.equals(mb4) && this.P0 == mb4.P0 && this.Q0 == mb4.Q0 && this.R0 == mb4.R0 && this.S0 == mb4.S0 && this.T0 == mb4.T0 && this.U0 == mb4.U0 && this.V0 == mb4.V0 && this.W0 == mb4.W0 && this.X0 == mb4.X0 && this.O0 == mb4.O0 && this.Y0 == mb4.Y0 && this.Z0 == mb4.Z0 && this.a1 == mb4.a1) {
            SparseBooleanArray sparseBooleanArray = this.c1;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = mb4.c1;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.b1;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = mb4.b1;
                        if (sparseArray2.size() == size2) {
                            int i2 = 0;
                            while (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            voe voe = (voe) entry.getKey();
                                            if (map2.containsKey(voe)) {
                                                if (!mze.a(entry.getValue(), map2.get(voe))) {
                                                }
                                            }
                                        }
                                        i2++;
                                    }
                                }
                            }
                            return true;
                        }
                    } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.P0 ? 1 : 0)) * 31) + (this.Q0 ? 1 : 0)) * 31) + (this.R0 ? 1 : 0)) * 31) + (this.S0 ? 1 : 0)) * 31) + (this.T0 ? 1 : 0)) * 31) + (this.U0 ? 1 : 0)) * 31) + (this.V0 ? 1 : 0)) * 31) + (this.W0 ? 1 : 0)) * 31) + (this.X0 ? 1 : 0)) * 31) + this.O0) * 31) + (this.Y0 ? 1 : 0)) * 31) + (this.Z0 ? 1 : 0)) * 31) + (this.a1 ? 1 : 0);
    }
}
