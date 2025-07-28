package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: f21  reason: default package */
public final class f21 {
    public zq3 a;

    public final zq3 a(Context context, List list, e21 e21) {
        zq3 zq3 = this.a;
        if (zq3 != null) {
            zq3.dismiss();
        }
        zq3 zq32 = new zq3(context);
        zq32.setWidth(a24.X(((float) 250) * dh4.c().getDisplayMetrics().density));
        zq32.d = false;
        ck9 ck9 = ck9.e0;
        zq32.f.o1(zq32, zq3.g[0], ck9);
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q7 q7Var = (q7) it.next();
            arrayList.add(new oq3(q7Var.getName(), Integer.valueOf(q7Var.getIcon()), vce.y0, vce.H0, new x2((Object) e21, 5, (Object) q7Var)));
        }
        zq32.a.a(arrayList, new bk(7, zq32));
        this.a = zq32;
        return zq32;
    }
}
