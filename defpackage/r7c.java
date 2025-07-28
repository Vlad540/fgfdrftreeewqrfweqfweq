package defpackage;

import android.util.SparseArray;

/* renamed from: r7c  reason: default package */
public final class r7c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7c b;

    public /* synthetic */ r7c(s7c s7c, int i) {
        this.a = i;
        this.b = s7c;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((u7c) sparseArray.valueAt(i)).getClass();
                }
                sparseArray.clear();
                return;
            default:
                s7c s7c = this.b;
                x7c x7c = s7c.i;
                if (x7c.C0 == s7c) {
                    if (x7c.F0) {
                        x7c.toString();
                    }
                    x7c.k();
                    return;
                }
                return;
        }
    }
}
