package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: mm9  reason: default package */
public final class mm9 {
    public final tt0 a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;

    public mm9(tt0 tt0, nj4 nj4, nj4 nj42, nj4 nj43) {
        this.a = tt0;
        this.b = nj4;
        this.c = nj42;
        this.d = nj43;
    }

    public static void a(i22 i22, p7a p7a) {
        o62 o62 = i22.b;
        int i = o62.m;
        long j = o62.a;
        if (i > 0) {
            p7a.f(j);
        } else {
            p7a.a(j);
        }
    }

    public final void b(i22 i22, Collection collection, md4 md4) {
        udd.p("mm9", "onNotifMsgDelete, %s", new Object[]{md4.name()});
        if (i22 != null) {
            boolean a2 = md4.a();
            tt0 tt0 = this.a;
            nj4 nj4 = this.c;
            long j = i22.a;
            if (a2) {
                ArrayList k = ((to8) nj4.get()).k(j, collection);
                ArrayList arrayList = new ArrayList(k.size());
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf(((vo8) it.next()).b));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                ((hz3) ((to8) nj4.get()).a).c.d().o(j, arrayList, ls8.DELETED);
                tt0.c(new l89(j, arrayList, md4));
                return;
            }
            ArrayList k2 = ((to8) nj4.get()).k(j, collection);
            ArrayList arrayList2 = new ArrayList(k2.size());
            Iterator it2 = k2.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((vo8) it2.next()).b));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            ((to8) nj4.get()).c(j, arrayList2);
            if (md4.b()) {
                ((t52) this.b.get()).v(j);
            }
            tt0.c(new l89(j, arrayList2, md4));
            if (md4.b()) {
                a(i22, (p7a) this.d.get());
            }
        }
    }
}
