package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ccd  reason: default package */
public abstract class ccd extends ere {
    public cre A0;
    public final yr Z = new kgd(0);
    public final ArrayList w0 = new ArrayList();
    public final ArrayList x0 = new ArrayList();
    public cre y0;
    public cre z0;

    public static void n(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (jaf.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                n(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public final void f(wr3 wr3, rr3 rr3) {
        this.o = true;
        this.x0.clear();
    }

    public final void k(ViewGroup viewGroup, View view, View view2, cre cre, boolean z) {
        if (view2 != null) {
            ArrayList arrayList = this.x0;
            if (arrayList.size() > 0) {
                view2.setVisibility(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bcd bcd = (bcd) it.next();
                    bcd.b.addView(bcd.a);
                }
                arrayList.clear();
            }
        }
        super.k(viewGroup, view, view2, cre, z);
    }

    public final kre l(ViewGroup viewGroup, View view, View view2, boolean z) {
        cre cre;
        this.y0 = null;
        this.z0 = null;
        kre p = p(view2, z);
        this.A0 = p;
        cre cre2 = this.z0;
        if (cre2 == null || (cre = this.y0) == null || (!(this instanceof hs2))) {
            return swb.E(0, new cre[]{this.y0, cre2, p});
        }
        return swb.E(0, new cre[]{swb.E(1, new cre[]{cre, cre2}), this.A0});
    }

    public void m(ViewGroup viewGroup, View view, View view2, cre cre, boolean z, k40 k40) {
        View view3 = view2;
        k40 k402 = new k40(this, viewGroup, view, view2, cre, z, k40, 4);
        o();
        if (view3 == null || view2.getParent() != null || this.w0.size() <= 0) {
            k402.g();
            return;
        }
        view2.getViewTreeObserver().addOnPreDrawListener(new wbd(this, view2, k402));
        ViewGroup viewGroup2 = viewGroup;
        viewGroup.addView(view2);
    }

    public abstract void o();

    public abstract kre p(View view, boolean z);
}
