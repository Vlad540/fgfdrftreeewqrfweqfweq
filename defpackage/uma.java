package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: uma  reason: default package */
public final class uma {
    public final xr7 a;
    public final t97 b;
    public final t97 c;
    public final zo d = zo.a;

    public uma(xr7 xr7, t97 t97, t97 t972) {
        this.a = xr7;
        this.b = t972;
        this.c = t97;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a07, java.lang.Object] */
    public final ln7 a(lma lma, ht7 ht7) {
        ? obj = new Object();
        obj.c = "PERF";
        obj.o = lma.a;
        obj.b = ((lqc) ((f03) this.b.getValue())).s();
        obj.a = System.currentTimeMillis();
        obj.c(ht7);
        return obj.d();
    }

    public final ht7 b(boolean z, boolean z2, int i, int i2, List list) {
        lg7 c2 = hwf.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nma nma = (nma) it.next();
            ht7 ht7 = new ht7();
            ht7.put("name", nma.a.a);
            long j = nma.e;
            Long valueOf = Long.valueOf(j);
            Long l = null;
            if (j == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                ht7.put("duration", Long.valueOf(nma.e));
            }
            long j2 = nma.f;
            Long valueOf2 = Long.valueOf(j2);
            if (j2 == -1) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                ht7.put("span_id", Long.valueOf(nma.f));
            }
            long j3 = nma.g;
            Long valueOf3 = Long.valueOf(j3);
            if (j3 != -1) {
                l = valueOf3;
            }
            if (l != null) {
                ht7.put("parent_span_id", Long.valueOf(nma.g));
            }
            List<pma> list2 = nma.h;
            if (list2 != null) {
                for (pma pma : list2) {
                    pma.getClass();
                    ht7.put("hasData", pma.a);
                }
            }
            c2.add(ht7.b());
        }
        lg7 a2 = hwf.a(c2);
        ht7 ht72 = new ht7();
        ht72.put("session_id", Long.valueOf(((i03) ((f03) this.b.getValue())).D()));
        ht72.put("start_type", z ? "cold" : "warm");
        if (z2) {
            ht72.put("source", "push");
        }
        ht72.put("trace_id", UUID.randomUUID().toString());
        ht72.put("spans", a2);
        int i3 = 1;
        if (i != 1) {
            if (i == 2) {
                i3 = 0;
            } else {
                throw null;
            }
        }
        ht72.put("status", Integer.valueOf(i3));
        if (i2 != 0) {
            ht72.put("errorType", Integer.valueOf(hr1.t(i2)));
        }
        return ht72.b();
    }

    public final void c() {
        this.d.getClass();
        if (zo.c) {
            oma oma = oma.APP_INIT;
            jc9 jc9 = zo.b;
            nma nma = (nma) jc9.f(oma);
            qma qma = nma != null ? new qma(nma.e, o23.s0(new ru5(jc9))) : null;
            if (qma != null) {
                ((bd) this.c.getValue()).j(a(lma.APP_INIT, b(true, this.a.i, 1, 0, qma.a)));
                for (nma nma2 : qma.a) {
                    zo.b.i(nma2.a);
                }
                zo.c = false;
            }
        }
    }

    public final void d(int i, int i2) {
        this.d.getClass();
        boolean z = zo.c;
        xr7 xr7 = this.a;
        boolean z2 = xr7.i;
        c();
        lma lma = lma.EVENT_OPEN_CHAT;
        qma c2 = xr7.c(lma);
        if (c2 != null) {
            nma nma = new nma(oma.OPEN_CHAT_ROOT_SPAN, -1);
            nma.e = c2.b;
            List singletonList = Collections.singletonList(nma);
            List list = c2.a;
            ((bd) this.c.getValue()).j(a(lma, b(z, z2, i, i2, o23.i0(singletonList, list))));
            xr7.e(lma, list);
        }
    }

    public final void e(int i, int i2) {
        this.d.getClass();
        boolean z = zo.c;
        xr7 xr7 = this.a;
        boolean z2 = xr7.i;
        c();
        lma lma = lma.EVENT_OPEN_CHATS;
        qma c2 = xr7.c(lma);
        if (c2 != null) {
            nma nma = new nma(oma.OPEN_CHATS_ROOT_SPAN, -1);
            nma.e = c2.b;
            List singletonList = Collections.singletonList(nma);
            List list = c2.a;
            ((bd) this.c.getValue()).j(a(lma, b(z, z2, i, i2, o23.i0(singletonList, list))));
            xr7.e(lma, list);
        }
    }
}
