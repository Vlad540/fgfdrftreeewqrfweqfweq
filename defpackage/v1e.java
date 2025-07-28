package defpackage;

import android.util.SparseArray;

/* renamed from: v1e  reason: default package */
public final class v1e implements e75 {
    public final e75 a;
    public final s1e b;
    public it4 c;

    public v1e(e75 e75, s1e s1e) {
        this.a = e75;
        this.b = s1e;
    }

    public final void S(i75 i75) {
        it4 it4 = new it4(i75, this.b);
        this.c = it4;
        this.a.S(it4);
    }

    public final void d(long j, long j2) {
        it4 it4 = this.c;
        if (it4 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) it4.c;
                if (i >= sparseArray.size()) {
                    break;
                }
                u1e u1e = ((w1e) sparseArray.valueAt(i)).h;
                if (u1e != null) {
                    u1e.reset();
                }
                i++;
            }
        }
        this.a.d(j, j2);
    }

    public final int g(g75 g75, le4 le4) {
        return this.a.g(g75, le4);
    }

    public final e75 m() {
        return this.a;
    }

    public final boolean n(g75 g75) {
        return this.a.n(g75);
    }

    public final void release() {
        this.a.release();
    }
}
