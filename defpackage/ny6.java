package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: ny6  reason: default package */
public final class ny6 {
    public final Context a;
    public final z23 b;
    public final h96 c;
    public final ew0 d;
    public final l96 e;
    public final Executor f;
    public final SparseArray g;
    public final int h;
    public final boolean i;
    public o96 j;
    public v2 k;

    public ny6(Context context, z23 z23, h96 h96, ew0 ew0, Executor executor, kc4 kc4, int i2, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = z23;
        this.c = h96;
        this.d = ew0;
        this.f = executor;
        this.e = kc4;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.h = i2;
        this.i = z2;
        sparseArray.put(1, new my6(new y65(h96, ew0, z, z2)));
        sparseArray.put(2, new my6(new jn0(h96, ew0, z3)));
        sparseArray.put(3, new my6(new xee(h96, ew0)));
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i2 < sparseArray.size()) {
                my6 my6 = (my6) sparseArray.get(sparseArray.keyAt(i2));
                my6.a.release();
                u65 u65 = my6.b;
                if (u65 != null) {
                    ((na4) u65).release();
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
