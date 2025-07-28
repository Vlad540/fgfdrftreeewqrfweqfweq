package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: tx4  reason: default package */
public final class tx4 implements ex4, ns9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public gs0 b = gs0.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ xx4 o;

    public tx4(xx4 xx4) {
        this.o = xx4;
    }

    public final void a(boolean z) {
        gs0 gs0 = gs0.b;
        gs0 gs02 = z ? gs0.a : gs0;
        if (this.b != gs02) {
            this.b = gs02;
            if (gs02 == gs0) {
                ArrayList arrayList = this.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ch7) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new ii4(entry, 10, gs02));
                } catch (RejectedExecutionException unused) {
                    String str = this.o.a;
                }
            }
        }
    }

    public final void g(Executor executor, ls9 ls9) {
        this.o.h.execute(new px4((Object) this, (Object) ls9, (Object) executor, 0));
    }

    public final ch7 m() {
        return hwf.f(new qx4(this, 0));
    }

    public final void r(ls9 ls9) {
        this.o.h.execute(new ii4(this, 12, ls9));
    }
}
