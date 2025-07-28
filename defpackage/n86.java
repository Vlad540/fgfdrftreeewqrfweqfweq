package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: n86  reason: default package */
public final class n86 {
    public final aqc a;
    public final t97 b;
    public final r7e c;
    public final r7e d;

    public n86(t97 t97, t97 t972, aqc aqc) {
        this.a = aqc;
        this.b = t97;
        this.c = new r7e(new xq(15, t972));
        this.d = new r7e(new xq(16, t972));
    }

    public final void a(i22 i22, Collection collection) {
        pyb pyb = (pyb) this.c.getValue();
        pyb.getClass();
        if (pyb == pyb.a) {
            udd.U("n86", "executeByServerIds: reactPermission is disabled");
        } else if (collection.isEmpty()) {
            udd.U("n86", "messageServerIds are empty!");
        } else {
            if (i22.b.a == 0) {
                if (!i22.b.f(this.a.a())) {
                    return;
                }
            }
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                int size = collection.size();
                String c0 = o23.c0(collection, (String) null, (String) null, (String) null, (u16) null, 63);
                fn6.d(tn7, "n86", "executeByServerIds " + size + " [" + c0 + "]", (Throwable) null);
            }
            try {
                b(i22.a, i22.b.a, new es(2, collection));
            } catch (Throwable th) {
                udd.s("n86", "executeByServerIds: call request failure!", th);
            }
        }
    }

    public final void b(long j, long j2, es esVar) {
        r7e r7e = this.d;
        int intValue = ((Number) r7e.getValue()).intValue();
        int intValue2 = ((Number) r7e.getValue()).intValue();
        pfa.c(intValue, intValue2);
        Iterator G = pfa.G(esVar.iterator(), intValue, intValue2, false);
        while (G.hasNext()) {
            List list = (List) G.next();
            gy9 gy9 = (gy9) ((pk) this.b.getValue());
            if (gy9.o(j)) {
                gy9.v(gy9, new v89(((j2b) gy9.z()).a.n(), j, j2, list));
            }
        }
    }
}
