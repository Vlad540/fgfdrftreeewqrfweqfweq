package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wbd  reason: default package */
public final class wbd implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ k40 c;
    public final /* synthetic */ ccd o;

    public wbd(ccd ccd, View view, k40 k40) {
        this.o = ccd;
        this.b = view;
        this.c = k40;
    }

    public final boolean onPreDraw() {
        ArrayList arrayList = new ArrayList();
        ccd ccd = this.o;
        Iterator it = ccd.w0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View view = this.b;
            if (swb.p(view, str) == null) {
                return false;
            }
            arrayList.add(swb.p(view, str));
        }
        if (this.a) {
            return false;
        }
        this.a = true;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            ccd ccd2 = ccd;
            View view3 = view2;
            acd.a(view2, new s18(ccd2, view3, this.b, this, this.c, 1));
        }
        return false;
    }
}
