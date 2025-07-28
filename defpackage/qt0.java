package defpackage;

import android.util.SparseArray;

/* renamed from: qt0  reason: default package */
public final class qt0 implements i75, ay2 {
    public static final a84 y0;
    public static final le4 z0 = new Object();
    public boolean X;
    public otf Y;
    public long Z;
    public final e75 a;
    public final int b;
    public final xu5 c;
    public final SparseArray o = new SparseArray();
    public vtc w0;
    public xu5[] x0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, a84] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, le4] */
    static {
        ? obj = new Object();
        obj.b = new smc(9);
        y0 = obj;
    }

    public qt0(e75 e75, int i, xu5 xu5) {
        this.a = e75;
        this.b = i;
        this.c = xu5;
    }

    public final bpe B(int i, int i2) {
        SparseArray sparseArray = this.o;
        ot0 ot0 = (ot0) sparseArray.get(i);
        if (ot0 == null) {
            oyb.k(this.x0 == null);
            ot0 = new ot0(i, i2, i2 == this.b ? this.c : null);
            otf otf = this.Y;
            long j = this.Z;
            if (otf == null) {
                ot0.e = ot0.c;
            } else {
                ot0.f = j;
                bpe N = otf.N(i2);
                ot0.e = N;
                xu5 xu5 = ot0.d;
                if (xu5 != null) {
                    N.e(xu5);
                }
            }
            sparseArray.put(i, ot0);
        }
        return ot0;
    }

    public final void M(vtc vtc) {
        this.w0 = vtc;
    }

    public final cy2 a() {
        vtc vtc = this.w0;
        if (vtc instanceof cy2) {
            return (cy2) vtc;
        }
        return null;
    }

    public final void b(otf otf, long j, long j2) {
        this.Y = otf;
        this.Z = j2;
        boolean z = this.X;
        e75 e75 = this.a;
        if (!z) {
            e75.S(this);
            if (j != -9223372036854775807L) {
                e75.d(0, j);
            }
            this.X = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        e75.d(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i < sparseArray.size()) {
                ot0 ot0 = (ot0) sparseArray.valueAt(i);
                if (otf == null) {
                    ot0.e = ot0.c;
                } else {
                    ot0.f = j2;
                    bpe N = otf.N(ot0.a);
                    ot0.e = N;
                    xu5 xu5 = ot0.d;
                    if (xu5 != null) {
                        N.e(xu5);
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
        xu5[] xu5Arr = new xu5[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            xu5 xu5 = ((ot0) sparseArray.valueAt(i)).d;
            oyb.l(xu5);
            xu5Arr[i] = xu5;
        }
        this.x0 = xu5Arr;
    }
}
