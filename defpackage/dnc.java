package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dnc  reason: default package */
public abstract class dnc {
    public static final String a = a24.e0("Schedulers");

    public static void a(sa3 sa3, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            buf y = workDatabase.y();
            workDatabase.c();
            try {
                ArrayList g = y.g(sa3.h);
                ArrayList f = y.f();
                if (g.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = g.iterator();
                    while (it.hasNext()) {
                        y.n(currentTimeMillis, ((ztf) it.next()).a);
                    }
                }
                workDatabase.r();
                workDatabase.l();
                if (g.size() > 0) {
                    ztf[] ztfArr = (ztf[]) g.toArray(new ztf[g.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        rmc rmc = (rmc) it2.next();
                        if (rmc.c()) {
                            rmc.e(ztfArr);
                        }
                    }
                }
                if (f.size() > 0) {
                    ztf[] ztfArr2 = (ztf[]) f.toArray(new ztf[f.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        rmc rmc2 = (rmc) it3.next();
                        if (!rmc2.c()) {
                            rmc2.e(ztfArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
    }
}
