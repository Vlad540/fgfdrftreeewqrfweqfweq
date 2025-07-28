package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zj3  reason: default package */
public final class zj3 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public zj3(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    public final void a(wj3 wj3, long[] jArr, long j) {
        ((di3) this.b.getValue()).s(wj3.c(), jArr);
        List c2 = wj3.c();
        bs bsVar = new bs(0);
        Iterator it = ((ArrayList) c2).iterator();
        while (it.hasNext()) {
            bsVar.add(Long.valueOf(((uj3) it.next()).a));
        }
        for (long valueOf : jArr) {
            bsVar.add(Long.valueOf(valueOf));
        }
        if (!bsVar.isEmpty()) {
            ((m07) this.c.getValue()).a(bsVar);
            ((tt0) this.a.getValue()).c(new lp3(j, bsVar));
        }
    }
}
