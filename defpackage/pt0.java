package defpackage;

import android.util.SparseArray;

/* renamed from: pt0  reason: default package */
public final class pt0 implements h75 {
    public static final le4 y0 = new Object();
    public boolean X;
    public afc Y;
    public long Z;
    public final d75 a;
    public final int b;
    public final vu5 c;
    public final SparseArray o = new SparseArray();
    public utc w0;
    public vu5[] x0;

    public pt0(d75 d75, int i, vu5 vu5) {
        this.a = d75;
        this.b = i;
        this.c = vu5;
    }

    public final ape B(int i, int i2) {
        ape xp4;
        SparseArray sparseArray = this.o;
        nt0 nt0 = (nt0) sparseArray.get(i);
        if (nt0 == null) {
            int i3 = 0;
            swb.h(this.x0 == null);
            nt0 = new nt0(i, i2, i2 == this.b ? this.c : null);
            afc afc = this.Y;
            long j = this.Z;
            if (afc == null) {
                nt0.e = nt0.c;
            } else {
                nt0.f = j;
                while (true) {
                    int[] iArr = (int[]) afc.a;
                    if (i3 >= iArr.length) {
                        xp4 = new xp4();
                        break;
                    }
                    if (nt0.a == iArr[i3]) {
                        xp4 = ((vjc[]) afc.b)[i3];
                        break;
                    }
                    i3++;
                }
                nt0.e = xp4;
                vu5 vu5 = nt0.d;
                if (vu5 != null) {
                    xp4.d(vu5);
                }
            }
            sparseArray.put(i, nt0);
        }
        return nt0;
    }

    public final void K(utc utc) {
        this.w0 = utc;
    }

    public final by2 a() {
        utc utc = this.w0;
        if (utc instanceof by2) {
            return (by2) utc;
        }
        return null;
    }

    public final void b(afc afc, long j, long j2) {
        ape xp4;
        this.Y = afc;
        this.Z = j2;
        boolean z = this.X;
        d75 d75 = this.a;
        if (!z) {
            d75.g(this);
            if (j != -9223372036854775807L) {
                d75.d(0, j);
            }
            this.X = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        d75.d(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i < sparseArray.size()) {
                nt0 nt0 = (nt0) sparseArray.valueAt(i);
                if (afc == null) {
                    nt0.e = nt0.c;
                } else {
                    nt0.f = j2;
                    int i2 = 0;
                    while (true) {
                        int[] iArr = (int[]) afc.a;
                        if (i2 >= iArr.length) {
                            xp4 = new xp4();
                            break;
                        }
                        if (nt0.a == iArr[i2]) {
                            xp4 = ((vjc[]) afc.b)[i2];
                            break;
                        }
                        i2++;
                    }
                    nt0.e = xp4;
                    vu5 vu5 = nt0.d;
                    if (vu5 != null) {
                        xp4.d(vu5);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.a.release();
    }

    public final void w() {
        SparseArray sparseArray = this.o;
        vu5[] vu5Arr = new vu5[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            vu5 vu5 = ((nt0) sparseArray.valueAt(i)).d;
            swb.i(vu5);
            vu5Arr[i] = vu5;
        }
        this.x0 = vu5Arr;
    }
}
