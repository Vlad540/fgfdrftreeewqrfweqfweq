package defpackage;

import android.view.View;

/* renamed from: gs2  reason: default package */
public final class gs2 implements zqe {
    public final /* synthetic */ View a;
    public final /* synthetic */ hs2 b;
    public final /* synthetic */ boolean c;

    public gs2(View view, hs2 hs2, boolean z) {
        this.a = view;
        this.b = hs2;
        this.c = z;
    }

    public final void a(cre cre) {
        View view = this.a;
        if (view != null) {
            nea p = swb.p(view, this.b.B0);
            if (this.c) {
                raa searchView = p.getSearchView();
                if (searchView != null) {
                    searchView.d();
                    return;
                }
                return;
            }
            raa searchView2 = p.getSearchView();
            if (searchView2 != null) {
                searchView2.b();
            }
        }
    }

    public final void b() {
    }

    public final void c(cre cre) {
    }

    public final void f() {
    }

    public final void g(cre cre) {
    }
}
