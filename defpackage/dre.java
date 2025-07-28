package defpackage;

import android.view.ViewGroup;

/* renamed from: dre  reason: default package */
public final class dre implements zqe {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ ere c;

    public dre(ere ere, ViewGroup viewGroup, lde lde) {
        this.c = ere;
        this.a = viewGroup;
        this.b = lde;
    }

    public final void a(cre cre) {
        this.a.removeCallbacks(this.b);
    }

    public final void b() {
    }

    public final void c(cre cre) {
        ere ere = this.c;
        ere.Y.q();
        ere.Y = null;
    }

    public final void f() {
    }

    public final void g(cre cre) {
        ere ere = this.c;
        ere.Y.q();
        ere.Y = null;
    }
}
