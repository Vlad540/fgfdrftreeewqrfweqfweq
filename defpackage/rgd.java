package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: rgd  reason: default package */
public final class rgd extends PopupWindow {
    public final List a;
    public final u16 b;

    public rgd(Context context, boolean z, ArrayList arrayList, e98 e98) {
        boolean z2;
        Context context2 = context;
        boolean z3 = z;
        this.a = arrayList;
        this.b = e98;
        setHeight(-2);
        setWidth(a24.X(((float) 250) * dh4.c().getDisplayMetrics().density));
        setElevation(dh4.c().getDisplayMetrics().density * 12.0f);
        boolean z4 = true;
        setOutsideTouchable(true);
        setFocusable(true);
        b1b b1b = new b1b(context2, z3);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((qgd) it.next()).d != null) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        for (qgd qgd : this.a) {
            a1b a1b = new a1b(context2, z3);
            mge mge = qgd.b;
            Integer num = qgd.d;
            a1b a1b2 = a1b;
            a1b.c(a1b, mge, qgd.c, num != null ? z4 : false, z2);
            a1b2.b(num, qgd.e);
            a24.a0(a1b2, new p7d(this, 4, qgd));
            b1b.addView(a1b2, -1, -2);
            z4 = true;
        }
        setContentView(b1b);
    }
}
