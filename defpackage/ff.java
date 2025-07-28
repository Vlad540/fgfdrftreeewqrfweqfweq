package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: ff  reason: default package */
public final class ff extends u12 {
    public final /* synthetic */ int c = 0;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff(int i, gf gfVar) {
        super(i);
        this.e = gfVar;
    }

    public void b(asf asf) {
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && gfVar.k == asf.a.c()) {
                    gfVar.k = -1;
                    gfVar.i();
                    nsf nsf = gfVar.e;
                    if (nsf != null) {
                        gfVar.c(nsf);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(asf asf) {
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && gfVar.k == -1) {
                    zrf zrf = asf.a;
                    if ((zrf.c() & gfVar.j) != 0) {
                        gfVar.k = zrf.c();
                        this.d = gfVar.e;
                        gfVar.j();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((asf.a.c() & 8) != 0) {
                    z68 z68 = (z68) this.e;
                    View view = z68.c;
                    int c2 = z68.c();
                    View view2 = z68.b;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                    view2.setTranslationY(0.0f);
                    eaf.l((View) this.d, (u12) null);
                    return;
                }
                return;
        }
    }

    public final nsf d(nsf nsf, List list) {
        Object obj;
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (gfVar.g) {
                    return nsf;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((asf) obj).a.c() == gfVar.k) {
                        }
                    } else {
                        obj = null;
                    }
                }
                return ((asf) obj) != null ? gfVar.h(gf.f(gfVar, nsf)) : nsf;
            default:
                return nsf;
        }
    }

    public s5c e(asf asf, s5c s5c) {
        nsf nsf;
        switch (this.c) {
            case 0:
                gf gfVar = (gf) this.e;
                if (!gfVar.g && (nsf = (nsf) this.d) != null && gfVar.k == asf.a.c()) {
                    nsf f = gf.f(gfVar, nsf);
                    gfVar.g(f, s5c);
                    gfVar.h(f);
                }
                return s5c;
            default:
                return s5c;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff(View view, z68 z68) {
        super(1);
        this.d = view;
        this.e = z68;
    }
}
