package defpackage;

import android.view.ViewGroup;

/* renamed from: ry1  reason: default package */
public final class ry1 extends fre {
    public boolean a = false;
    public final ViewGroup b;

    public ry1(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void b() {
        kaf.b(this.b, false);
    }

    public final void c(cre cre) {
        if (!this.a) {
            kaf.b(this.b, false);
        }
        cre.E(this);
    }

    public final void f() {
        kaf.b(this.b, true);
    }

    public final void g(cre cre) {
        kaf.b(this.b, false);
        this.a = true;
    }
}
