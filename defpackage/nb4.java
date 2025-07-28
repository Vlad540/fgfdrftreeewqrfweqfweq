package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: nb4  reason: default package */
public final class nb4 extends mpe {
    public static final String A0 = Integer.toString(1001, 36);
    public static final String B0 = Integer.toString(1002, 36);
    public static final String C0 = Integer.toString(1003, 36);
    public static final String D0 = Integer.toString(1004, 36);
    public static final String E0 = Integer.toString(1005, 36);
    public static final String F0 = Integer.toString(1006, 36);
    public static final String G0 = Integer.toString(1007, 36);
    public static final String H0 = Integer.toString(1008, 36);
    public static final String I0 = Integer.toString(1009, 36);
    public static final String J0 = Integer.toString(1010, 36);
    public static final String K0 = Integer.toString(1011, 36);
    public static final String L0 = Integer.toString(1012, 36);
    public static final String M0 = Integer.toString(1013, 36);
    public static final String N0 = Integer.toString(1014, 36);
    public static final String O0 = Integer.toString(1015, 36);
    public static final String P0 = Integer.toString(1016, 36);
    public static final String Q0 = Integer.toString(1017, 36);
    public static final String R0 = Integer.toString(1018, 36);
    public static final String z0 = Integer.toString(1000, 36);
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final SparseArray x0;
    public final SparseBooleanArray y0;

    static {
        new nb4(new lb4());
        int i = oze.a;
    }

    public nb4(lb4 lb4) {
        super(lb4);
        this.i0 = lb4.C;
        this.j0 = lb4.D;
        this.k0 = lb4.E;
        this.l0 = lb4.F;
        this.m0 = lb4.G;
        this.n0 = lb4.H;
        this.o0 = lb4.I;
        this.p0 = lb4.J;
        this.q0 = lb4.K;
        this.r0 = lb4.L;
        this.s0 = lb4.M;
        this.t0 = lb4.N;
        this.u0 = lb4.O;
        this.v0 = lb4.P;
        this.w0 = lb4.Q;
        this.x0 = lb4.R;
        this.y0 = lb4.S;
    }

    public final kpe a() {
        return new lb4(this);
    }

    public final Bundle c() {
        Bundle c = super.c();
        c.putBoolean(z0, this.i0);
        c.putBoolean(A0, this.j0);
        c.putBoolean(B0, this.k0);
        c.putBoolean(N0, this.l0);
        c.putBoolean(C0, this.m0);
        c.putBoolean(D0, this.n0);
        c.putBoolean(E0, this.o0);
        c.putBoolean(F0, this.p0);
        c.putBoolean(O0, this.q0);
        c.putBoolean(R0, this.r0);
        c.putBoolean(P0, this.s0);
        c.putBoolean(G0, this.t0);
        c.putBoolean(H0, this.u0);
        c.putBoolean(I0, this.v0);
        c.putBoolean(Q0, this.w0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.x0;
            if (i < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                    hr1.r(entry.getValue());
                    arrayList2.add((woe) entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                c.putIntArray(J0, xie.H(arrayList));
                c.putParcelableArrayList(K0, gt0.M(arrayList2, new i74(3)));
                SparseArray sparseArray3 = new SparseArray(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c.putSparseParcelableArray(L0, sparseArray3);
                    i++;
                } else {
                    sparseArray.keyAt(0);
                    hr1.r(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.y0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                c.putIntArray(M0, iArr);
                return c;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nb4.class != obj.getClass()) {
            return false;
        }
        nb4 nb4 = (nb4) obj;
        if (super.equals(nb4) && this.i0 == nb4.i0 && this.j0 == nb4.j0 && this.k0 == nb4.k0 && this.l0 == nb4.l0 && this.m0 == nb4.m0 && this.n0 == nb4.n0 && this.o0 == nb4.o0 && this.p0 == nb4.p0 && this.q0 == nb4.q0 && this.r0 == nb4.r0 && this.s0 == nb4.s0 && this.t0 == nb4.t0 && this.u0 == nb4.u0 && this.v0 == nb4.v0 && this.w0 == nb4.w0) {
            SparseBooleanArray sparseBooleanArray = this.y0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = nb4.y0;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.x0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = nb4.x0;
                        if (sparseArray2.size() == size2) {
                            int i2 = 0;
                            while (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            woe woe = (woe) entry.getKey();
                                            if (map2.containsKey(woe)) {
                                                if (!oze.a(entry.getValue(), map2.get(woe))) {
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
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.i0 ? 1 : 0)) * 31) + (this.j0 ? 1 : 0)) * 31) + (this.k0 ? 1 : 0)) * 31) + (this.l0 ? 1 : 0)) * 31) + (this.m0 ? 1 : 0)) * 31) + (this.n0 ? 1 : 0)) * 31) + (this.o0 ? 1 : 0)) * 31) + (this.p0 ? 1 : 0)) * 31) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0);
    }
}
