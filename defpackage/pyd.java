package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: pyd  reason: default package */
public final class pyd extends h6c {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pyd(Object obj, RecyclerView recyclerView, int i) {
        this.a = i;
        this.c = obj;
        this.b = recyclerView;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ryd.i((ryd) this.c);
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                ryd.i((ryd) this.c);
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                ryd.i((ryd) this.c);
                return;
            default:
                pyd.super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<pyd> cls = pyd.class;
                String name = cls.getName();
                RecyclerView recyclerView = this.b;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, name, us8.k("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), (Throwable) null);
                }
                ryd.i((ryd) this.c);
                String name2 = cls.getName();
                RecyclerView recyclerView2 = this.b;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, name2, us8.k("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), (Throwable) null);
                    return;
                }
                return;
            default:
                if (i == 0) {
                    kme.h0((kme) this.c, this.b);
                    return;
                }
                return;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                ryd.i((ryd) this.c);
                return;
            default:
                if (i == 0 || i2 == 0) {
                    kme.h0((kme) this.c, this.b);
                    return;
                }
                return;
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                ryd.i((ryd) this.c);
                return;
            default:
                if (i == 0) {
                    kme.h0((kme) this.c, this.b);
                    return;
                }
                return;
        }
    }
}
