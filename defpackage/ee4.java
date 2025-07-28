package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: ee4  reason: default package */
public final class ee4 {
    public final t97 a;

    public ee4(t97 t97) {
        this.a = t97;
    }

    public final void a(long j, long j2, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            pk pkVar = (pk) this.a.getValue();
            List o = hr1.o(longValue);
            int i = z ? -1 : 0;
            gy9 gy9 = (gy9) pkVar;
            if (gy9.o(j)) {
                sh2 sh2 = new sh2(((j2b) gy9.z()).a.n(), j, j2, 2, o, ch2.MEMBER, true, i, 0);
                if (i == 0) {
                    gy9.w(gy9, sh2);
                } else {
                    gy9.v(gy9, sh2);
                }
            }
        }
    }
}
