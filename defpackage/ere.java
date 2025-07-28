package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: ere  reason: default package */
public abstract class ere extends wr3 {
    public boolean X;
    public ur3 Y;
    public boolean o;

    public final void a() {
        this.X = true;
    }

    public final boolean d() {
        return true;
    }

    public void f(wr3 wr3, rr3 rr3) {
        this.o = true;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, ur3 ur3) {
        ur3 ur32 = ur3;
        this.Y = ur32;
        if (this.o) {
            ur3.q();
        } else if (this.X) {
            k(viewGroup, view, view2, (cre) null, z);
            ur3.q();
        } else {
            lde lde = new lde(5, (Object) ur32);
            kre l = l(viewGroup, view, view2, z);
            ViewGroup viewGroup2 = viewGroup;
            l.a(new dre(this, viewGroup, lde));
            m(viewGroup, view, view2, l, z, new k40(this, viewGroup, l, view, view2, z, lde, 6));
        }
    }

    public void k(ViewGroup viewGroup, View view, View view2, cre cre, boolean z) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
    }

    public abstract kre l(ViewGroup viewGroup, View view, View view2, boolean z);

    public void m(ViewGroup viewGroup, View view, View view2, cre cre, boolean z, k40 k40) {
        k40.g();
    }
}
