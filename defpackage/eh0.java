package defpackage;

import java.util.ArrayList;

/* renamed from: eh0  reason: default package */
public abstract class eh0 implements oz3 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public xz3 o;

    public eh0(boolean z) {
        this.a = z;
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(bqe)) {
            arrayList.add(bqe);
            this.c++;
        }
    }

    public final void b(int i) {
        xz3 xz3 = this.o;
        int i2 = mze.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((f54) ((bqe) this.b.get(i3))).e(xz3, this.a, i);
        }
    }

    public final void c() {
        xz3 xz3 = this.o;
        int i = mze.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((f54) ((bqe) this.b.get(i2))).f(xz3, this.a);
        }
        this.o = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((bqe) this.b.get(i)).getClass();
        }
    }

    public final void e(xz3 xz3) {
        this.o = xz3;
        for (int i = 0; i < this.c; i++) {
            ((f54) ((bqe) this.b.get(i))).g(xz3, this.a);
        }
    }
}
