package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: s6e  reason: default package */
public final class s6e extends wr3 {
    public final String X;
    public final wr3 o;

    public s6e() {
        this(0);
    }

    public final void a() {
        this.o.a();
    }

    public final void f(wr3 wr3, rr3 rr3) {
        this.o.f(wr3, rr3);
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, ur3 ur3) {
        if (view == null && !z) {
            String str = this.X;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "Already swiped controller manually, skip performChange", (Throwable) null);
            }
            ur3.q();
        } else if (view != null || !z) {
            this.o.g(viewGroup, view, view2, z, ur3);
        } else {
            String str2 = this.X;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, str2, "Showing controller without animation", (Throwable) null);
            }
            new bhd(true).g(viewGroup, view, view2, z, ur3);
        }
    }

    public final void h(Bundle bundle) {
        this.o.h(bundle);
    }

    public final void i(Bundle bundle) {
        this.o.i(bundle);
    }

    public s6e(int i) {
        this.o = new pw7(0);
        this.X = s6e.class.getName();
    }
}
