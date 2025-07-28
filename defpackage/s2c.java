package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: s2c  reason: default package */
public final /* synthetic */ class s2c implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2c b;
    public final /* synthetic */ List c;

    public /* synthetic */ s2c(v2c v2c, List list, int i) {
        this.a = i;
        this.b = v2c;
        this.c = list;
    }

    public final void run() {
        a10 a10;
        List<f2c> list = this.c;
        v2c v2c = this.b;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (f2c f2c : list) {
                    int ordinal = f2c.a.ordinal();
                    Long l = null;
                    if (ordinal == 2) {
                        utd utd = f2c instanceof utd ? (utd) f2c : null;
                        if (utd != null) {
                            l = Long.valueOf(utd.c);
                        }
                    } else if (ordinal == 3) {
                        c96 c96 = f2c instanceof c96 ? (c96) f2c : null;
                        if (!(c96 == null || (a10 = c96.c) == null)) {
                            l = Long.valueOf(a10.w0);
                        }
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((gy9) ((pk) v2c.d.getValue())).f(6, ek8.n(arrayList));
                    return;
                }
                return;
            default:
                int i = v2c.g;
                ((gy9) ((pk) v2c.d.getValue())).f(6, ek8.n(list));
                return;
        }
    }
}
