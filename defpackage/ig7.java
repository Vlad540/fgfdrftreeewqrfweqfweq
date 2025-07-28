package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: ig7  reason: default package */
public abstract class ig7 extends f6c {
    public final mu o;

    public ig7(urd urd) {
        hg7 hg7 = new hg7(this);
        c9 c9Var = new c9(0, this);
        synchronized (bm3.a) {
            try {
                if (bm3.b == null) {
                    bm3.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        mu muVar = new mu(c9Var, new qe4((Object) bm3.b, 4, (Object) urd));
        this.o = muVar;
        muVar.d.add(hg7);
    }

    public final Object C(int i) {
        return this.o.f.get(i);
    }

    public void D(List list, List list2) {
    }

    public final void E(List list) {
        this.o.b(list, (Runnable) null);
    }

    public final void F(List list, Runnable runnable) {
        this.o.b(list, runnable);
    }

    public int j() {
        return this.o.f.size();
    }

    public ig7(qe4 qe4) {
        hg7 hg7 = new hg7(this);
        mu muVar = new mu(new c9(0, this), qe4);
        this.o = muVar;
        muVar.d.add(hg7);
    }
}
