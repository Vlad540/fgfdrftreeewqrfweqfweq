package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: gh6  reason: default package */
public final /* synthetic */ class gh6 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ gh6(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(swb.k(((rg6) obj).k(), this.b));
            default:
                xr8 xr8 = (xr8) obj;
                List list = this.b;
                boolean z = true;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            xr8 xr82 = (xr8) it.next();
                            if (hhd.f(xr82.a.b, xr8.a.b) && xr82.b >= xr8.b) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
